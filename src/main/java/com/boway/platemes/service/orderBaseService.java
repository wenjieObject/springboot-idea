package com.boway.platemes.service;

import com.alibaba.fastjson.JSON;
import com.boway.platemes.entity.*;
import com.boway.platemes.pojo.OrderBase;
import com.boway.platemes.pojo.OrderBaseResult;
import com.boway.platemes.repository.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class orderBaseService {

    @Autowired
    private orderBaseRepository orderBaseRepository;

    @Autowired
    private relationRepository relationRepository;

    @Autowired
    private madeRuleRepository madeRuleRepository;

    @Autowired
    private madeRuleDetailRepository madeRuleDetailRepository;

    @Autowired
    private itemDetailRepository itemDetailRepository;

    @Autowired
    private itemDetailSubRepository itemDetailSubRepository;

    @Autowired
    private madeRuleProcessRepository madeRuleProcessRepository;

    @Autowired
    private brandBasRepository brandBasRepository;

    public List<OrderBaseResult> getBottomDesc() {

        //1.获取7521/7701牌号的询单，白铜 --SD210024860
        //2.根据询单的最终用户，最终用户，产品规范 匹配制造规范
        //3.查询制造规范的留底索引
        //4.根据询单的 订单厚度+（正厚度公差+负厚度公差）/2 去匹配留底索引下的序号，查询到目标规格
        //5.根据目标厚度，匹配产线适用规格，查询产线

        List<Map<String, Object>> orderBases = orderBaseRepository.getOrderBase();
        String irsStr = JSON.toJSONString(orderBases);
        List<OrderBase> irsList = JSON.parseArray(irsStr, OrderBase.class);

        List<OrderBaseResult> orderBaseResults = new ArrayList<>();
        for (OrderBase item : irsList) {

            if(!"SD200406023".equals(item.getInquiries_no()))continue;

            float targetThick = item.getSpec1() + (item.getN_SPEC1_TOL() + item.getP_SPEC1_TOL()) / 2;

            CppPrdMadeRuleRelationBas relationBas = relationRepository.getByDeleteFlagAndPrdGuidAndFinalUserGuidAndFinalFunctionGuid("N", item.getPrd_guid(), item.getFinal_user_guid(), item.getFinal_function_guid());

            if (relationBas == null) continue;

            String madeRuleGuid = relationBas.getMadeRuleGuid();

            CppMadeRule cppMadeRule = madeRuleRepository.getOne(madeRuleGuid);

            //留底规格转换
            CppMadeRuleItemDetail madeRuleItemDetail = madeRuleDetailRepository.getByDeleteFlagAndCategoryGuidAndCategoryNoAndItemCategoryGuid("N", cppMadeRule.getGuid(), "1", "493083a3-2dbd-4a2b-9848-7950050b8853");

            if (madeRuleItemDetail == null) continue;

            String itemGuid = madeRuleItemDetail.getItemGuid();
            List<CppItemDetail> itemDetails = itemDetailRepository.getByDeleteFlagAndFromGuid("N", itemGuid);

            if (itemDetails == null || itemDetails.isEmpty()) continue;
            List<CppItemDetail> collectors = itemDetails.stream().filter(t -> targetThick > Float.parseFloat(t.getSpecsMin1())
                    && targetThick <= Float.parseFloat(t.getSpecsMax1())).collect(Collectors.toList());

            if (collectors == null || collectors.isEmpty()) continue;

            CppItemDetail itemDetail = collectors.get(0);

            //来料厚度目标值
            CppItemDetailSub cppItemDetailSub = itemDetailSubRepository.getByDeleteFlagAndFromGuidAndItemParmGuid("N", itemDetail.getGuid(), "e975ad85-ac99-47c3-a8c7-4145b4141f62");
            //目标厚度
            String targetSpec1 = cppItemDetailSub.getItemParmValue();

            //查询当前制造规范的产线
            List<CppMadeRuleProcessDetail> processes = madeRuleProcessRepository.
                    getByDeleteFlagAndMadeRuleGuid("N", madeRuleGuid);
            String processNo = "";
            for (CppMadeRuleProcessDetail process : processes) {
                //产线适用规格
                CppMadeRuleItemDetail tmpMadeRuleItemDetail = madeRuleDetailRepository.getByDeleteFlagAndCategoryGuidAndCategoryNoAndItemCategoryGuid("N",
                        process.getGuid(), "2", "3aedd3a6-856b-4f8c-952b-f1b8dd6028c3");

                String tmpItemGuid = tmpMadeRuleItemDetail.getItemGuid();
                CppItemDetail tmpItemDetail = itemDetailRepository.getByDeleteFlagAndFromGuid("N", tmpItemGuid).get(0);

                if (Float.parseFloat(tmpItemDetail.getSpecsMin1()) < Float.parseFloat(targetSpec1)
                        && Float.parseFloat(tmpItemDetail.getSpecsMax1()) >= Float.parseFloat(targetSpec1)) {
                    processNo = process.getProcessName();
                    break;
                }
            }

            String brand_guid = item.getBrand_guid();

            CppPrdBrandBas brandBas = brandBasRepository.getOne(brand_guid);

            if (processNo == null || "".equals(processNo)) continue;

            OrderBaseResult orderBaseResult = new OrderBaseResult();
            orderBaseResult.setInquiries_no(item.getInquiries_no());
            //orderBaseResult.setPro_no();
            orderBaseResult.setMade_rule_no(cppMadeRule.getMadeRuleNo());
            orderBaseResult.setBottomIndex(itemGuid);
            orderBaseResult.setBottomNo(itemDetail.getItemIndexSeq());
            orderBaseResult.setSeq(item.getSeq());
            orderBaseResult.setPrd_guid(item.getPrd_guid());

            orderBaseResult.setFinal_user_guid(item.getFinal_user_guid());
            orderBaseResult.setFinal_function_guid(item.getFinal_function_guid());
            orderBaseResult.setBrand_guid(item.getBrand_guid());

            orderBaseResult.setSpec1(item.getSpec1());
            orderBaseResult.setN_SPEC1_TOL(item.getN_SPEC1_TOL());
            orderBaseResult.setP_SPEC1_TOL(item.getP_SPEC1_TOL());
            orderBaseResult.setTargetSpec1(targetSpec1);
            orderBaseResult.setProcessNo(processNo);
            orderBaseResult.setBrandNo(brandBas.getBrandName());
            orderBaseResults.add(orderBaseResult);
            //System.out.println(orderBaseResult.toString());
        }

        return orderBaseResults;

    }
}
