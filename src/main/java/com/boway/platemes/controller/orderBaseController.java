package com.boway.platemes.controller;


import com.boway.platemes.pojo.OrderBaseResult;
import com.boway.platemes.service.orderBaseService;
import org.apache.poi.hssf.usermodel.*;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/orderBase")
public class orderBaseController {

    @Autowired
    private orderBaseService orderBaseService;

    @GetMapping("/bottom")
    public void test(HttpServletResponse response) throws IOException {

        List<OrderBaseResult> orderBaseResults = orderBaseService.getBottomDesc();


        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");

        // 设置要导出的文件的名字
        String fileName = "users"  + new Date() + ".xls";

        // 新增数据行，并且设置单元格数据
        int rowNum = 1;

        // headers表示excel表中第一行的表头 在excel表中添加表头
        String[] headers = { "询单", "询单行号", "制造规范", "留底索引", "留底序号","订单厚度","订单厚度公差+"
        ,"订单厚度公差-","目标规格厚度","产线","牌号"};
        HSSFRow row = sheet.createRow(0);
        for(int i=0;i<headers.length;i++){
            HSSFCell cell = row.createCell(i);
                HSSFRichTextString text = new HSSFRichTextString(headers[i]);
            cell.setCellValue(text);
        }

        //在表中存放查询到的数据放入对应的列
        for (OrderBaseResult item : orderBaseResults) {
            HSSFRow row1 = sheet.createRow(rowNum);
            row1.createCell(0).setCellValue(item.getInquiries_no());
            row1.createCell(1).setCellValue(item.getSeq());
            row1.createCell(2).setCellValue(item.getMade_rule_no());
            row1.createCell(3).setCellValue(item.getBottomIndex());
            row1.createCell(4).setCellValue(item.getBottomNo());
            row1.createCell(5).setCellValue(item.getSpec1());
            row1.createCell(6).setCellValue(item.getP_SPEC1_TOL());
            row1.createCell(7).setCellValue(item.getN_SPEC1_TOL());
            row1.createCell(8).setCellValue(item.getTargetSpec1());
            row1.createCell(9).setCellValue(item.getProcessNo());
            row1.createCell(10).setCellValue(item.getBrandNo());

            rowNum++;
        }

        response.setContentType("application/octet-stream");
        response.setHeader("Content-disposition", "attachment;filename=" + fileName);
        response.flushBuffer();
        workbook.write(response.getOutputStream());
    }
}
