package com.boway.platemes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;

/**
 * @Description  
 * @Author  linmengmeng
 * @Date 2020-10-28 11:01:05 
 */

@Entity
@Table ( name ="WIP_ORDER_D" , schema = "")
public class WipOrderD  implements Serializable {

	private static final long serialVersionUID =  3171867863106689433L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 销售询单GUID
	 */
   	@Column(name = "ORDER_GUID" )
	private String orderGuid;

	/**
	 * 序号
	 */
   	@Column(name = "SEQ" )
	private String seq;

	/**
	 * 产品规范码 来源查询制造规范
	 */
   	@Column(name = "PRD_NO" )
	private String prdNo;

	/**
	 * 产品规范GUID 来源查询制造规范
	 */
   	@Column(name = "PRD_GUID" )
	private String prdGuid;

	/**
	 * 最终用户编号GUID 根据单头的客户编号
	 */
   	@Column(name = "FINAL_USER_GUID" )
	private String finalUserGuid;

	/**
	 * 最终用途编号 对应接口 useindustryno
	 */
   	@Column(name = "FINAL_FUNCTION_GUID" )
	private String finalFunctionGuid;

	/**
	 * 规格1(厚) 对应接口 spcione
	 */
   	@Column(name = "SPEC1" )
	private String spec1;

	/**
	 * 规格1(宽) 对应接口 spcitwo
	 */
   	@Column(name = "SPEC2" )
	private String spec2;

	/**
	 * 规格3(长) 对应接口 spcithree
	 */
   	@Column(name = "SPEC3" )
	private String spec3;

	/**
	 * 数量   对应接口 qty
	 */
   	@Column(name = "QTY" )
	private String qty;

	/**
	 * 客户要求交期  对应接口 plannedate
	 */
   	@Column(name = "DELIVERYDATE" )
	private Date deliverydate;

	/**
	 * 单位GUID  取WMS_ITEM_DETAIL 里面的单位GUID
	 */
   	@Column(name = "UNIT_GUID" )
	private String unitGuid;

	/**
	 * 物料GUID  对应接口 itemno
	 */
   	@Column(name = "ITEM_GUID" )
	private String itemGuid;

	/**
	 * 牌号GUID  对应接口 brandno
	 */
   	@Column(name = "BRAND_GUID" )
	private String brandGuid;

	/**
	 * 标准编码  产品规范码查询条件 对应接口 exestandard
	 */
   	@Column(name = "STD" )
	private String std;

	/**
	 * 产品大类编码 产品规范码查询条件 对应接口 producttype
	 */
   	@Column(name = "PRODUCT_TYPE" )
	private String productType;

	/**
	 * 产品大类描述 对应接口 producttypedes
	 */
   	@Column(name = "PRODUCT_TYPE_DES" )
	private String productTypeDes;

	/**
	 * 厚度正公差 对应接口 maxspcione
	 */
   	@Column(name = "P_SPEC1_TOL" )
	private String pSpec1Tol;

	/**
	 * 厚度负公差 对应接口 minspcione
	 */
   	@Column(name = "N_SPEC1_TOL" )
	private String nSpec1Tol;

	/**
	 * 厚度公差一致性要求 对应接口 spcionereq
	 */
   	@Column(name = "SPEC1_CON_REQ" )
	private String spec1ConReq;

	/**
	 * 宽度正公差 对应接口 maxspcitwo
	 */
   	@Column(name = "P_SPEC2_TOL" )
	private String pSpec2Tol;

	/**
	 * 宽度负公差 对应接口 minspcitwo
	 */
   	@Column(name = "N_SPEC2_TOL" )
	private String nSpec2Tol;

	/**
	 * 宽度公差一致性要求 对应接口 spcitworeq
	 */
   	@Column(name = "SPEC2_CON_REQ" )
	private String spec2ConReq;

	/**
	 * 长度正公差 对应接口 maxspcithree
	 */
   	@Column(name = "P_SPEC3_TOL" )
	private String pSpec3Tol;

	/**
	 * 长度负公差 对应接口 minspcithree
	 */
   	@Column(name = "N_SPEC3_TOL" )
	private String nSpec3Tol;

	/**
	 * 长度公差一致性要求 对应接口 spcitthrreq
	 */
   	@Column(name = "SPEC3_CON_REQ" )
	private String spec3ConReq;

	/**
	 * 纸芯内径1  对应接口 inpaperno
	 */
   	@Column(name = "PAPER_INNER_DIA1" )
	private String paperInnerDia1;

	/**
	 * 纸芯内径2  为空 预留
	 */
   	@Column(name = "PAPER_INNER_DIA2" )
	private String paperInnerDia2;

	/**
	 * 纸芯内径3  为空 预留
	 */
   	@Column(name = "PAPER_INNER_DIA3" )
	private String paperInnerDia3;

	/**
	 * 卷外径最小值 对应接口 outwindlow
	 */
   	@Column(name = "MIN_OUTER_DIA" )
	private String minOuterDia;

	/**
	 * 卷外径最大值 对应接口 outwindup (800-1200mm；与单卷最大、小重量中的一个必输)
	 */
   	@Column(name = "MAX_OUTER_DIA" )
	private String maxOuterDia;

	/**
	 * 单卷卷重最小值 对应接口 minunitrweight   提供容差逻辑
	 */
   	@Column(name = "MIN_ROLL_WEIGHT" )
	private String minRollWeight;

	/**
	 * 单卷卷重最大值 对应接口 maxunitrweight  提供容差逻辑
	 */
   	@Column(name = "MAX_ROLL_WEIGHT" )
	private String maxRollWeight;

	/**
	 * 硬度最小值HV 对应接口 minhardness
	 */
   	@Column(name = "MIN_HARDNESS" )
	private String minHardness;

	/**
	 * 硬度最大值HV 对应接口 maxhardness
	 */
   	@Column(name = "MAX_HARDNESS" )
	private String maxHardness;

	/**
	 * 抗拉强度最小值MPa 对应接口 mintensile
	 */
   	@Column(name = "MIN_TS" )
	private String minTs;

	/**
	 * 抗拉强度最大值MPa 对应接口 maxtensile
	 */
   	@Column(name = "MAX_TS" )
	private String maxTs;

	/**
	 * 屈服强度最小值MPa 对应接口 minstrength
	 */
   	@Column(name = "MIN_YS" )
	private String minYs;

	/**
	 * 屈服强度最大值MPa 对应接口 maxstrength
	 */
   	@Column(name = "MAX_YS" )
	private String maxYs;

	/**
	 * 伸长率%最小值 对应接口 minelongation
	 */
   	@Column(name = "MIN_ELONGATION" )
	private String minElongation;

	/**
	 * 伸长率%最大值 对应接口 maxelongation  ? naxelongation
	 */
   	@Column(name = "MAX_ELONGATION" )
	private String maxElongation;

	/**
	 * 导电率最小值 对应接口 minconductive
	 */
   	@Column(name = "MIN_CONDTY" )
	private String minCondty;

	/**
	 * 导电率最大值 对应接口 maxconductive
	 */
   	@Column(name = "MAX_CONDTY" )
	private String maxCondty;

	/**
	 * 折弯宽度90（好）对应接口 goodbengnine
	 */
   	@Column(name = "G_BENDING_WIDTH1" )
	private String gBendingWidth1;

	/**
	 * 折弯宽度180（好）对应接口 goodbengeig
	 */
   	@Column(name = "G_BENDING_WIDTH2" )
	private String gBendingWidth2;

	/**
	 * 折弯宽度90（坏）对应接口 badbengnine
	 */
   	@Column(name = "B_BENDING_WIDTH1" )
	private String bBendingWidth1;

	/**
	 * 折弯宽度180（坏）对应接口 badbengeig
	 */
   	@Column(name = "B_BENDING_WIDTH2" )
	private String bBendingWidth2;

	/**
	 * 折弯内R角90（好）对应接口 goodbengninert
	 */
   	@Column(name = "G_BENDING_R1" )
	private String gBendingR1;

	/**
	 * 折弯内R角90（坏）对应接口 badbengninert
	 */
   	@Column(name = "B_BENDING_R1" )
	private String bBendingR1;

	/**
	 * 折弯内R角180（好）对应接口 goodbengeigrt
	 */
   	@Column(name = "G_BENDING_R2" )
	private String gBendingR2;

	/**
	 * 折弯内R角180（坏）对应接口 badbengeigrt
	 */
   	@Column(name = "B_BENDING_R2" )
	private String bBendingR2;

	/**
	 * 高温发黄温度 对应接口 yellowtemp
	 */
   	@Column(name = "HIGH_YEL_TEMP" )
	private String highYelTemp;

	/**
	 * 高温发黄时间 单位min 对应接口 yellowtime
	 */
   	@Column(name = "HIGH_YEL_TIME" )
	private String highYelTime;

	/**
	 * 高温发黄次数 对应接口 yellowqty
	 */
   	@Column(name = "HIGH_YEL_TIMES" )
	private String highYelTimes;

	/**
	 * 备注 对应接口 note
	 */
   	@Column(name = "REMARK" )
	private String remark;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

	/**
	 * 创建者
	 */
   	@Column(name = "CREATOR" )
	private String creator;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

	/**
	 * 修改者
	 */
   	@Column(name = "MODIFIER" )
	private String modifier;

	/**
	 * 修改时间
	 */
   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

	/**
	 * 标志位
	 */
   	@Column(name = "FLAG" )
	private String flag;

	/**
	 * 删除标志位
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 状态(制造规范确认) 1.待评审；2.已评审；3.已转换；4.SAP 确认 5.已计划；6.已生产；7.转换失败SAP传过来是为：1.待评审
制造规范匹配到后为：2.已评审
订单设计转换成功后为：3.已转换转换失败：7.转换失败
转换成功后抛SAP，SAP维护讯息确认后：4.SAP确认
APS排产完成：5：已计划(已有生产订单)
工单上料开始生产：6.已生产 8.已转换未审核 9.已转换已审核
	 */
   	@Column(name = "STATUS" )
	private String status;

	/**
	 * 状态编码 产品规范码查询条件 对应接口 ourstate
	 */
   	@Column(name = "CRM_STATUS" )
	private String crmStatus;

	/**
	 * 客户物料编码
	 */
   	@Column(name = "CUSTOMERMATERIAL" )
	private String customermaterial;

	/**
	 * 客户产品状态 对应接口 accountstate
	 */
   	@Column(name = "ACCOUNTSTATE" )
	private String accountstate;

	/**
	 * 表面光泽度上限 对应接口 maxluster
	 */
   	@Column(name = "MAXLUSTER" )
	private String maxluster;

	/**
	 * 收卷方式  传数字1、2、3、4；对应接口 wind
	 */
   	@Column(name = "WIND" )
	private String wind;

	/**
	 * 传文本，1 纸芯 、2 多连卷、 3 TRW、 4 无纸芯  对应接口 winddes
	 */
   	@Column(name = "WINDDES" )
	private String winddes;

	/**
	 * 毛刺上限mm 如果是厚度百分比，则需要转换成厚度<  0.01  mm  对应接口 burr
	 */
   	@Column(name = "BURR" )
	private String burr;

	/**
	 * 晶粒度类型 传数字：1 留底  2 成品 3 留底+成品 对应接口 graintype
	 */
   	@Column(name = "GRAINTYPE" )
	private String graintype;

	/**
	 * 晶粒度下限 如果晶粒度类型选择了，则必填 对应接口 mingraintype
	 */
   	@Column(name = "MINGRAINTYPE" )
	private String mingraintype;

	/**
	 * 晶粒度上限 如果晶粒度类型选择了，则必填 对应接口 maxgraintype
	 */
   	@Column(name = "MAXGRAINTYPE" )
	private String maxgraintype;

	/**
	 * 盐雾测试时间要求 小时 对应接口 saltfogtimereq
	 */
   	@Column(name = "SALTFOGTIMEREQ" )
	private String saltfogtimereq;

	/**
	 * 盐雾测试等级要求 数字：1、2、3、4、5、6、7、8、9、10 对应接口 saltfoglevelreqno
	 */
   	@Column(name = "SALTFOGLEVELREQNO" )
	private String saltfoglevelreqno;

	/**
	 * 表面粗糙度下限Ra   对应接口 minroughra
	 */
   	@Column(name = "MINROUGHRA" )
	private String minroughra;

	/**
	 * 表面粗糙度上限Ra   对应接口 maxroughra
	 */
   	@Column(name = "MAXROUGHRA" )
	private String maxroughra;

	/**
	 * 表面粗糙度下限Rmax  对应接口 minrough
	 */
   	@Column(name = "MINROUGH" )
	private String minrough;

	/**
	 * 表面粗糙度上限Rmax  对应接口 maxrough
	 */
   	@Column(name = "MAXROUGH" )
	private String maxrough;

	/**
	 * 抗高温软化性能-温度 对应接口 resisthightemp
	 */
   	@Column(name = "RESISTHIGHTEMP" )
	private String resisthightemp;

	/**
	 * 抗高温软化性能-时间 单位min 对应接口 resisthightime
	 */
   	@Column(name = "RESISTHIGHTIME" )
	private String resisthightime;

	/**
	 * 抗高温软化性能-目标值 对应接口 resisthighgoal
	 */
   	@Column(name = "RESISTHIGHGOAL" )
	private String resisthighgoal;

	/**
	 * 表面光泽度下限 对应接口 minluster
	 */
   	@Column(name = "MINLUSTER" )
	private String minluster;

	/**
	 * 牌号编号 产品规范码查询条件 对应接口 brandno
	 */
   	@Column(name = "BRAND_NO" )
	private String brandNo;

	/**
	 * 品名编码 产品规范码查询条件 对应接口 goodsno
	 */
   	@Column(name = "GOODS_NO" )
	private String goodsNo;

	/**
	 * 附加属性编码  产品规范码查询条件 对应接口 addattributeno
	 */
   	@Column(name = "ADDATTRIBUTENO" )
	private String addattributeno;

	/**
	 * 附加属性描述 对应接口 addattributedes
	 */
   	@Column(name = "ADDATTRIBUTEDES" )
	private String addattributedes;

	/**
	 * 附加属性要求 对应接口 addattributedec
	 */
   	@Column(name = "ADDATTRIBUTEDEC" )
	private String addattributedec;

	/**
	 * 交货工厂编码 对应接口 factory_no
	 */
   	@Column(name = "FACTORY_NO" )
	private String factoryNo;

	/**
	 * 产品类型（技术填写）传数字1、2、3、4、5；针对试样订单，传产品类型值：1：H1、 2：H2、 3：H3 、4：其他、 5：工艺改进  对应接口 typeno
	 */
   	@Column(name = "TYPENO" )
	private String typeno;

	/**
	 * 类型 传数字1、2； 对应接口 producttypeno针对试样订单，传产品类型值：1：常规产品、2：研发产品
	 */
   	@Column(name = "PRODUCTTYPENO" )
	private String producttypeno;

	/**
	 * 唛头 对应接口 ismark
	 */
   	@Column(name = "ISMARK" )
	private String ismark;

	/**
	 * 唛头存放地址url  对应接口 ismark
	 */
   	@Column(name = "MARKDESC" )
	private String markdesc;

	/**
	 * 备库订单号    对应接口 ord_saleordertwo
	 */
   	@Column(name = "ORD_SALEORDERTWO" )
	private String ordSaleordertwo;

	/**
	 * 备库订单行号  对应接口 ord_saleorderlinetwo
	 */
   	@Column(name = "ORD_SALEORDERLINETWO" )
	private String ordSaleorderlinetwo;

	/**
	 * 是否参与APS计算 1：是、0 ：否   对应接口 isapsclac
	 */
   	@Column(name = "ISAPSCLAC" )
	private String isapsclac;

	/**
	 * 订货重量最小值 对应接口 minorderweight   提供容差逻辑
	 */
   	@Column(name = "MINORDERWEIGHT" )
	private String minorderweight;

	/**
	 * 订货重量最大值 对应接口 maxorderweight  提供容差逻辑
	 */
   	@Column(name = "MAXORDERWEIGHT" )
	private String maxorderweight;

	/**
	 * 镀层厚度下限 附加属性选择了热浸镀锡，则必填 对应接口 platmin
	 */
   	@Column(name = "PLATMIN" )
	private String platmin;

	/**
	 * 镀层厚度上限 附加属性选择了热浸镀锡，则必填 对应接口 platmax
	 */
   	@Column(name = "PLATMAX" )
	private String platmax;

	/**
	 * 镀材 附加属性选择了电镀，则必填 对应接口 platmaterial
	 */
   	@Column(name = "PLATMATERIAL" )
	private String platmaterial;

	/**
	 * 侧弯测试方式 1：1m、2：1.8m 对应接口 cambertest
	 */
   	@Column(name = "CAMBERTEST" )
	private String cambertest;

	/**
	 * 侧弯值1camber 传数值 对应接口 camber
	 */
   	@Column(name = "CAMBER" )
	private String camber;

	/**
	 * 横弯CrossBow 传数值 对应接口 crossbow
	 */
   	@Column(name = "CROSSBOW" )
	private String crossbow;

	/**
	 * 板型最大波高Flatness 对应接口 flatness
	 */
   	@Column(name = "FLATNESS" )
	private String flatness;

	/**
	 * 波高/波距 对应接口 wavehigh
	 */
   	@Column(name = "WAVEHIGH" )
	private String wavehigh;

	/**
	 * 卷弯测试样品长度 对应接口 coilsetlong
	 */
   	@Column(name = "COILSETLONG" )
	private String coilsetlong;

	/**
	 * 卷弯1CoilSet 对应接口 coilset
	 */
   	@Column(name = "COILSET" )
	private String coilset;

	/**
	 * 扭曲测试方式 传数字：1：扭曲角度、2：扭曲值 对应接口 twisttestno
	 */
   	@Column(name = "TWISTTESTNO" )
	private String twisttestno;

	/**
	 * 扭曲Twist 对应接口 twist
	 */
   	@Column(name = "TWIST" )
	private String twist;

	/**
	 * 包装类型 传数字：1：内贸、2：外贸  对应接口 packtype
	 */
   	@Column(name = "PACKTYPE" )
	private String packtype;

	/**
	 * 包装要求 传数字：1：常规包装 、2：特殊要求 对应接口 packrequire
	 */
   	@Column(name = "PACKREQUIRE" )
	private String packrequire;

	/**
	 * 包装物 传数字：1：八角木托、2：正方形木托、3：圆木托、4：木箱 对应接口 package
	 */
   	@Column(name = "PACKAGE" )
	private String packageCol;

	/**
	 * 采购/回收 传数字： 1：采购、2：回收 3：采购及回收  对应接口 recoveryno
	 */
   	@Column(name = "RECOVERYNO" )
	private String recoveryno;

	/**
	 * 包材物料号 对应接口 producttwo
	 */
   	@Column(name = "PRODUCTTWO" )
	private String producttwo;

	/**
	 * 包材数量 对应接口 packmaterialqty
	 */
   	@Column(name = "PACKMATERIALQTY" )
	private String packmaterialqty;

	/**
	 * 包装要求文本 对应接口 packrequirenex
	 */
   	@Column(name = "PACKREQUIRENEX" )
	private String packrequirenex;

	/**
	 * 产品标识 1：常规标识、2：特殊要求 对应接口 identy
	 */
   	@Column(name = "IDENTY" )
	private String identy;

	/**
	 * 产品标识内容 对应接口 identydesc
	 */
   	@Column(name = "IDENTYDESC" )
	private String identydesc;

	/**
	 * 环境有害物质限制 1：RoHS、2：Reach、3：特殊要求 对应接口 harmenvirlimitno
	 */
   	@Column(name = "HARMENVIRLIMITNO" )
	private String harmenvirlimitno;

	/**
	 * 环境有害物质限制内容 对应接口 harmenvironment
	 */
   	@Column(name = "HARMENVIRONMENT" )
	private String harmenvironment;

	/**
	 * 成分特殊要求 1：是、0 ：否 对应接口 iscomponent
	 */
   	@Column(name = "ISCOMPONENT" )
	private String iscomponent;

	/**
	 * 是否有协议 1 ：是、0： 否 对应接口 isagreement
	 */
   	@Column(name = "ISAGREEMENT" )
	private String isagreement;

	/**
	 * 表面等级代码 1 ：A、2： B 对应接口 surfaceclass
	 */
   	@Column(name = "SURFACECLASS" )
	private String surfaceclass;

	/**
	 * 生产交期
	 */
   	@Column(name = "MAKE_DAY" )
	private Date makeDay;

	/**
	 * 焊锡 对应接口 tinsolder
	 */
   	@Column(name = "TINSOLDER" )
	private String tinsolder;

	/**
	 * 商务计划回复交期
	 */
   	@Column(name = "REPLY_DEL_DATE" )
	private Date replyDelDate;

	/**
	 * 交期变更原因
	 */
   	@Column(name = "JQ_CHANGE_REASON" )
	private String jqChangeReason;

	/**
	 * 生产排产交期
	 */
   	@Column(name = "SCHEDULE_DEL_DATE" )
	private Date scheduleDelDate;

	/**
	 * Y 启用 N 关闭  1：关闭 对应N 2：开启 对应Y（CRM的取消关闭）
	 */
   	@Column(name = "CLOSE_FLAG" )
	private String closeFlag;

	/**
	 * 关闭原因描述
	 */
   	@Column(name = "CLOSE_REASON" )
	private String closeReason;

	/**
	 * 焊锡
	 */
   	@Column(name = "FYYQ" )
	private String fyyq;

	/**
	 * 生产文本
	 */
   	@Column(name = "PRODUCTMEMO" )
	private String productmemo;

	/**
	 * 订单原因编码
	 */
   	@Column(name = "ORDER_CIMT" )
	private String orderCimt;

	/**
	 * 订单原因描述
	 */
   	@Column(name = "ORDER_CIMT_DES" )
	private String orderCimtDes;

	/**
	 * APS排产交期
	 */
   	@Column(name = "APS_DATE" )
	private Date apsDate;

	/**
	 * 正式销售订单号
	 */
   	@Column(name = "ORDER_NO" )
	private String orderNo;

	/**
	 * 中间工序未计划量
	 */
   	@Column(name = "FUTURE_QTY" )
	private String futureQty;

	/**
	 * 模拟标识 Y,N
	 */
   	@Column(name = "MN_FLAG" )
	private String mnFlag;

	/**
	 * 熔铸计划量
	 */
   	@Column(name = "RZ_QTY" )
	private String rzQty;

	/**
	 * 熔铸标识 CRM销售预测类型默认给Y，其它默认给N
	 */
   	@Column(name = "RZ_FLAG" )
	private String rzFlag;

	/**
	 * 是否提交交期
	 */
   	@Column(name = "CRM_FLAG" )
	private String crmFlag;

	/**
	 * 质保书使用标准 对应接口
	 */
   	@Column(name = "ZBS_BJ" )
	private String zbsBj;

	/**
	 * 附样要求 对应接口
	 */
   	@Column(name = "FY_YQ" )
	private String fyYq;

	/**
	 * 附样数量 对应接口
	 */
   	@Column(name = "FY_QTY" )
	private String fyQty;

	/**
	 * 备注1
	 */
   	@Column(name = "BZ1" )
	private String bz1;

	/**
	 * 备注2
	 */
   	@Column(name = "BZ2" )
	private String bz2;

	/**
	 * 备注3
	 */
   	@Column(name = "BZ3" )
	private String bz3;

	/**
	 * 备注4
	 */
   	@Column(name = "BZ4" )
	private String bz4;

	/**
	 * 备注5
	 */
   	@Column(name = "BZ5" )
	private String bz5;

	/**
	 * 0：未评审 1：已评审
	 */
   	@Column(name = "IS_CONFIRM" )
	private String isConfirm;

	/**
	 * 未剪切量
	 */
   	@Column(name = "JQ_QTY" )
	private String jqQty;

	/**
	 * 生产量
	 */
   	@Column(name = "MES_QTY" )
	private String mesQty;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getOrderGuid() {
		return this.orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getPrdNo() {
		return this.prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdGuid() {
		return this.prdGuid;
	}

	public void setPrdGuid(String prdGuid) {
		this.prdGuid = prdGuid;
	}

	public String getFinalUserGuid() {
		return this.finalUserGuid;
	}

	public void setFinalUserGuid(String finalUserGuid) {
		this.finalUserGuid = finalUserGuid;
	}

	public String getFinalFunctionGuid() {
		return this.finalFunctionGuid;
	}

	public void setFinalFunctionGuid(String finalFunctionGuid) {
		this.finalFunctionGuid = finalFunctionGuid;
	}

	public String getSpec1() {
		return this.spec1;
	}

	public void setSpec1(String spec1) {
		this.spec1 = spec1;
	}

	public String getSpec2() {
		return this.spec2;
	}

	public void setSpec2(String spec2) {
		this.spec2 = spec2;
	}

	public String getSpec3() {
		return this.spec3;
	}

	public void setSpec3(String spec3) {
		this.spec3 = spec3;
	}

	public String getQty() {
		return this.qty;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public Date getDeliverydate() {
		return this.deliverydate;
	}

	public void setDeliverydate(Date deliverydate) {
		this.deliverydate = deliverydate;
	}

	public String getUnitGuid() {
		return this.unitGuid;
	}

	public void setUnitGuid(String unitGuid) {
		this.unitGuid = unitGuid;
	}

	public String getItemGuid() {
		return this.itemGuid;
	}

	public void setItemGuid(String itemGuid) {
		this.itemGuid = itemGuid;
	}

	public String getBrandGuid() {
		return this.brandGuid;
	}

	public void setBrandGuid(String brandGuid) {
		this.brandGuid = brandGuid;
	}

	public String getStd() {
		return this.std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductTypeDes() {
		return this.productTypeDes;
	}

	public void setProductTypeDes(String productTypeDes) {
		this.productTypeDes = productTypeDes;
	}

	public String getPSpec1Tol() {
		return this.pSpec1Tol;
	}

	public void setPSpec1Tol(String pSpec1Tol) {
		this.pSpec1Tol = pSpec1Tol;
	}

	public String getNSpec1Tol() {
		return this.nSpec1Tol;
	}

	public void setNSpec1Tol(String nSpec1Tol) {
		this.nSpec1Tol = nSpec1Tol;
	}

	public String getSpec1ConReq() {
		return this.spec1ConReq;
	}

	public void setSpec1ConReq(String spec1ConReq) {
		this.spec1ConReq = spec1ConReq;
	}

	public String getPSpec2Tol() {
		return this.pSpec2Tol;
	}

	public void setPSpec2Tol(String pSpec2Tol) {
		this.pSpec2Tol = pSpec2Tol;
	}

	public String getNSpec2Tol() {
		return this.nSpec2Tol;
	}

	public void setNSpec2Tol(String nSpec2Tol) {
		this.nSpec2Tol = nSpec2Tol;
	}

	public String getSpec2ConReq() {
		return this.spec2ConReq;
	}

	public void setSpec2ConReq(String spec2ConReq) {
		this.spec2ConReq = spec2ConReq;
	}

	public String getPSpec3Tol() {
		return this.pSpec3Tol;
	}

	public void setPSpec3Tol(String pSpec3Tol) {
		this.pSpec3Tol = pSpec3Tol;
	}

	public String getNSpec3Tol() {
		return this.nSpec3Tol;
	}

	public void setNSpec3Tol(String nSpec3Tol) {
		this.nSpec3Tol = nSpec3Tol;
	}

	public String getSpec3ConReq() {
		return this.spec3ConReq;
	}

	public void setSpec3ConReq(String spec3ConReq) {
		this.spec3ConReq = spec3ConReq;
	}

	public String getPaperInnerDia1() {
		return this.paperInnerDia1;
	}

	public void setPaperInnerDia1(String paperInnerDia1) {
		this.paperInnerDia1 = paperInnerDia1;
	}

	public String getPaperInnerDia2() {
		return this.paperInnerDia2;
	}

	public void setPaperInnerDia2(String paperInnerDia2) {
		this.paperInnerDia2 = paperInnerDia2;
	}

	public String getPaperInnerDia3() {
		return this.paperInnerDia3;
	}

	public void setPaperInnerDia3(String paperInnerDia3) {
		this.paperInnerDia3 = paperInnerDia3;
	}

	public String getMinOuterDia() {
		return this.minOuterDia;
	}

	public void setMinOuterDia(String minOuterDia) {
		this.minOuterDia = minOuterDia;
	}

	public String getMaxOuterDia() {
		return this.maxOuterDia;
	}

	public void setMaxOuterDia(String maxOuterDia) {
		this.maxOuterDia = maxOuterDia;
	}

	public String getMinRollWeight() {
		return this.minRollWeight;
	}

	public void setMinRollWeight(String minRollWeight) {
		this.minRollWeight = minRollWeight;
	}

	public String getMaxRollWeight() {
		return this.maxRollWeight;
	}

	public void setMaxRollWeight(String maxRollWeight) {
		this.maxRollWeight = maxRollWeight;
	}

	public String getMinHardness() {
		return this.minHardness;
	}

	public void setMinHardness(String minHardness) {
		this.minHardness = minHardness;
	}

	public String getMaxHardness() {
		return this.maxHardness;
	}

	public void setMaxHardness(String maxHardness) {
		this.maxHardness = maxHardness;
	}

	public String getMinTs() {
		return this.minTs;
	}

	public void setMinTs(String minTs) {
		this.minTs = minTs;
	}

	public String getMaxTs() {
		return this.maxTs;
	}

	public void setMaxTs(String maxTs) {
		this.maxTs = maxTs;
	}

	public String getMinYs() {
		return this.minYs;
	}

	public void setMinYs(String minYs) {
		this.minYs = minYs;
	}

	public String getMaxYs() {
		return this.maxYs;
	}

	public void setMaxYs(String maxYs) {
		this.maxYs = maxYs;
	}

	public String getMinElongation() {
		return this.minElongation;
	}

	public void setMinElongation(String minElongation) {
		this.minElongation = minElongation;
	}

	public String getMaxElongation() {
		return this.maxElongation;
	}

	public void setMaxElongation(String maxElongation) {
		this.maxElongation = maxElongation;
	}

	public String getMinCondty() {
		return this.minCondty;
	}

	public void setMinCondty(String minCondty) {
		this.minCondty = minCondty;
	}

	public String getMaxCondty() {
		return this.maxCondty;
	}

	public void setMaxCondty(String maxCondty) {
		this.maxCondty = maxCondty;
	}

	public String getGBendingWidth1() {
		return this.gBendingWidth1;
	}

	public void setGBendingWidth1(String gBendingWidth1) {
		this.gBendingWidth1 = gBendingWidth1;
	}

	public String getGBendingWidth2() {
		return this.gBendingWidth2;
	}

	public void setGBendingWidth2(String gBendingWidth2) {
		this.gBendingWidth2 = gBendingWidth2;
	}

	public String getBBendingWidth1() {
		return this.bBendingWidth1;
	}

	public void setBBendingWidth1(String bBendingWidth1) {
		this.bBendingWidth1 = bBendingWidth1;
	}

	public String getBBendingWidth2() {
		return this.bBendingWidth2;
	}

	public void setBBendingWidth2(String bBendingWidth2) {
		this.bBendingWidth2 = bBendingWidth2;
	}

	public String getGBendingR1() {
		return this.gBendingR1;
	}

	public void setGBendingR1(String gBendingR1) {
		this.gBendingR1 = gBendingR1;
	}

	public String getBBendingR1() {
		return this.bBendingR1;
	}

	public void setBBendingR1(String bBendingR1) {
		this.bBendingR1 = bBendingR1;
	}

	public String getGBendingR2() {
		return this.gBendingR2;
	}

	public void setGBendingR2(String gBendingR2) {
		this.gBendingR2 = gBendingR2;
	}

	public String getBBendingR2() {
		return this.bBendingR2;
	}

	public void setBBendingR2(String bBendingR2) {
		this.bBendingR2 = bBendingR2;
	}

	public String getHighYelTemp() {
		return this.highYelTemp;
	}

	public void setHighYelTemp(String highYelTemp) {
		this.highYelTemp = highYelTemp;
	}

	public String getHighYelTime() {
		return this.highYelTime;
	}

	public void setHighYelTime(String highYelTime) {
		this.highYelTime = highYelTime;
	}

	public String getHighYelTimes() {
		return this.highYelTimes;
	}

	public void setHighYelTimes(String highYelTimes) {
		this.highYelTimes = highYelTimes;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getModifyTime() {
		return this.modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getDeleteFlag() {
		return this.deleteFlag;
	}

	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCrmStatus() {
		return this.crmStatus;
	}

	public void setCrmStatus(String crmStatus) {
		this.crmStatus = crmStatus;
	}

	public String getCustomermaterial() {
		return this.customermaterial;
	}

	public void setCustomermaterial(String customermaterial) {
		this.customermaterial = customermaterial;
	}

	public String getAccountstate() {
		return this.accountstate;
	}

	public void setAccountstate(String accountstate) {
		this.accountstate = accountstate;
	}

	public String getMaxluster() {
		return this.maxluster;
	}

	public void setMaxluster(String maxluster) {
		this.maxluster = maxluster;
	}

	public String getWind() {
		return this.wind;
	}

	public void setWind(String wind) {
		this.wind = wind;
	}

	public String getWinddes() {
		return this.winddes;
	}

	public void setWinddes(String winddes) {
		this.winddes = winddes;
	}

	public String getBurr() {
		return this.burr;
	}

	public void setBurr(String burr) {
		this.burr = burr;
	}

	public String getGraintype() {
		return this.graintype;
	}

	public void setGraintype(String graintype) {
		this.graintype = graintype;
	}

	public String getMingraintype() {
		return this.mingraintype;
	}

	public void setMingraintype(String mingraintype) {
		this.mingraintype = mingraintype;
	}

	public String getMaxgraintype() {
		return this.maxgraintype;
	}

	public void setMaxgraintype(String maxgraintype) {
		this.maxgraintype = maxgraintype;
	}

	public String getSaltfogtimereq() {
		return this.saltfogtimereq;
	}

	public void setSaltfogtimereq(String saltfogtimereq) {
		this.saltfogtimereq = saltfogtimereq;
	}

	public String getSaltfoglevelreqno() {
		return this.saltfoglevelreqno;
	}

	public void setSaltfoglevelreqno(String saltfoglevelreqno) {
		this.saltfoglevelreqno = saltfoglevelreqno;
	}

	public String getMinroughra() {
		return this.minroughra;
	}

	public void setMinroughra(String minroughra) {
		this.minroughra = minroughra;
	}

	public String getMaxroughra() {
		return this.maxroughra;
	}

	public void setMaxroughra(String maxroughra) {
		this.maxroughra = maxroughra;
	}

	public String getMinrough() {
		return this.minrough;
	}

	public void setMinrough(String minrough) {
		this.minrough = minrough;
	}

	public String getMaxrough() {
		return this.maxrough;
	}

	public void setMaxrough(String maxrough) {
		this.maxrough = maxrough;
	}

	public String getResisthightemp() {
		return this.resisthightemp;
	}

	public void setResisthightemp(String resisthightemp) {
		this.resisthightemp = resisthightemp;
	}

	public String getResisthightime() {
		return this.resisthightime;
	}

	public void setResisthightime(String resisthightime) {
		this.resisthightime = resisthightime;
	}

	public String getResisthighgoal() {
		return this.resisthighgoal;
	}

	public void setResisthighgoal(String resisthighgoal) {
		this.resisthighgoal = resisthighgoal;
	}

	public String getMinluster() {
		return this.minluster;
	}

	public void setMinluster(String minluster) {
		this.minluster = minluster;
	}

	public String getBrandNo() {
		return this.brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getGoodsNo() {
		return this.goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getAddattributeno() {
		return this.addattributeno;
	}

	public void setAddattributeno(String addattributeno) {
		this.addattributeno = addattributeno;
	}

	public String getAddattributedes() {
		return this.addattributedes;
	}

	public void setAddattributedes(String addattributedes) {
		this.addattributedes = addattributedes;
	}

	public String getAddattributedec() {
		return this.addattributedec;
	}

	public void setAddattributedec(String addattributedec) {
		this.addattributedec = addattributedec;
	}

	public String getFactoryNo() {
		return this.factoryNo;
	}

	public void setFactoryNo(String factoryNo) {
		this.factoryNo = factoryNo;
	}

	public String getTypeno() {
		return this.typeno;
	}

	public void setTypeno(String typeno) {
		this.typeno = typeno;
	}

	public String getProducttypeno() {
		return this.producttypeno;
	}

	public void setProducttypeno(String producttypeno) {
		this.producttypeno = producttypeno;
	}

	public String getIsmark() {
		return this.ismark;
	}

	public void setIsmark(String ismark) {
		this.ismark = ismark;
	}

	public String getMarkdesc() {
		return this.markdesc;
	}

	public void setMarkdesc(String markdesc) {
		this.markdesc = markdesc;
	}

	public String getOrdSaleordertwo() {
		return this.ordSaleordertwo;
	}

	public void setOrdSaleordertwo(String ordSaleordertwo) {
		this.ordSaleordertwo = ordSaleordertwo;
	}

	public String getOrdSaleorderlinetwo() {
		return this.ordSaleorderlinetwo;
	}

	public void setOrdSaleorderlinetwo(String ordSaleorderlinetwo) {
		this.ordSaleorderlinetwo = ordSaleorderlinetwo;
	}

	public String getIsapsclac() {
		return this.isapsclac;
	}

	public void setIsapsclac(String isapsclac) {
		this.isapsclac = isapsclac;
	}

	public String getMinorderweight() {
		return this.minorderweight;
	}

	public void setMinorderweight(String minorderweight) {
		this.minorderweight = minorderweight;
	}

	public String getMaxorderweight() {
		return this.maxorderweight;
	}

	public void setMaxorderweight(String maxorderweight) {
		this.maxorderweight = maxorderweight;
	}

	public String getPlatmin() {
		return this.platmin;
	}

	public void setPlatmin(String platmin) {
		this.platmin = platmin;
	}

	public String getPlatmax() {
		return this.platmax;
	}

	public void setPlatmax(String platmax) {
		this.platmax = platmax;
	}

	public String getPlatmaterial() {
		return this.platmaterial;
	}

	public void setPlatmaterial(String platmaterial) {
		this.platmaterial = platmaterial;
	}

	public String getCambertest() {
		return this.cambertest;
	}

	public void setCambertest(String cambertest) {
		this.cambertest = cambertest;
	}

	public String getCamber() {
		return this.camber;
	}

	public void setCamber(String camber) {
		this.camber = camber;
	}

	public String getCrossbow() {
		return this.crossbow;
	}

	public void setCrossbow(String crossbow) {
		this.crossbow = crossbow;
	}

	public String getFlatness() {
		return this.flatness;
	}

	public void setFlatness(String flatness) {
		this.flatness = flatness;
	}

	public String getWavehigh() {
		return this.wavehigh;
	}

	public void setWavehigh(String wavehigh) {
		this.wavehigh = wavehigh;
	}

	public String getCoilsetlong() {
		return this.coilsetlong;
	}

	public void setCoilsetlong(String coilsetlong) {
		this.coilsetlong = coilsetlong;
	}

	public String getCoilset() {
		return this.coilset;
	}

	public void setCoilset(String coilset) {
		this.coilset = coilset;
	}

	public String getTwisttestno() {
		return this.twisttestno;
	}

	public void setTwisttestno(String twisttestno) {
		this.twisttestno = twisttestno;
	}

	public String getTwist() {
		return this.twist;
	}

	public void setTwist(String twist) {
		this.twist = twist;
	}

	public String getPacktype() {
		return this.packtype;
	}

	public void setPacktype(String packtype) {
		this.packtype = packtype;
	}

	public String getPackrequire() {
		return this.packrequire;
	}

	public void setPackrequire(String packrequire) {
		this.packrequire = packrequire;
	}

	public String getPackageCol() {
		return this.packageCol;
	}

	public void setPackageCol(String packageCol) {
		this.packageCol = packageCol;
	}

	public String getRecoveryno() {
		return this.recoveryno;
	}

	public void setRecoveryno(String recoveryno) {
		this.recoveryno = recoveryno;
	}

	public String getProducttwo() {
		return this.producttwo;
	}

	public void setProducttwo(String producttwo) {
		this.producttwo = producttwo;
	}

	public String getPackmaterialqty() {
		return this.packmaterialqty;
	}

	public void setPackmaterialqty(String packmaterialqty) {
		this.packmaterialqty = packmaterialqty;
	}

	public String getPackrequirenex() {
		return this.packrequirenex;
	}

	public void setPackrequirenex(String packrequirenex) {
		this.packrequirenex = packrequirenex;
	}

	public String getIdenty() {
		return this.identy;
	}

	public void setIdenty(String identy) {
		this.identy = identy;
	}

	public String getIdentydesc() {
		return this.identydesc;
	}

	public void setIdentydesc(String identydesc) {
		this.identydesc = identydesc;
	}

	public String getHarmenvirlimitno() {
		return this.harmenvirlimitno;
	}

	public void setHarmenvirlimitno(String harmenvirlimitno) {
		this.harmenvirlimitno = harmenvirlimitno;
	}

	public String getHarmenvironment() {
		return this.harmenvironment;
	}

	public void setHarmenvironment(String harmenvironment) {
		this.harmenvironment = harmenvironment;
	}

	public String getIscomponent() {
		return this.iscomponent;
	}

	public void setIscomponent(String iscomponent) {
		this.iscomponent = iscomponent;
	}

	public String getIsagreement() {
		return this.isagreement;
	}

	public void setIsagreement(String isagreement) {
		this.isagreement = isagreement;
	}

	public String getSurfaceclass() {
		return this.surfaceclass;
	}

	public void setSurfaceclass(String surfaceclass) {
		this.surfaceclass = surfaceclass;
	}

	public Date getMakeDay() {
		return this.makeDay;
	}

	public void setMakeDay(Date makeDay) {
		this.makeDay = makeDay;
	}

	public String getTinsolder() {
		return this.tinsolder;
	}

	public void setTinsolder(String tinsolder) {
		this.tinsolder = tinsolder;
	}

	public Date getReplyDelDate() {
		return this.replyDelDate;
	}

	public void setReplyDelDate(Date replyDelDate) {
		this.replyDelDate = replyDelDate;
	}

	public String getJqChangeReason() {
		return this.jqChangeReason;
	}

	public void setJqChangeReason(String jqChangeReason) {
		this.jqChangeReason = jqChangeReason;
	}

	public Date getScheduleDelDate() {
		return this.scheduleDelDate;
	}

	public void setScheduleDelDate(Date scheduleDelDate) {
		this.scheduleDelDate = scheduleDelDate;
	}

	public String getCloseFlag() {
		return this.closeFlag;
	}

	public void setCloseFlag(String closeFlag) {
		this.closeFlag = closeFlag;
	}

	public String getCloseReason() {
		return this.closeReason;
	}

	public void setCloseReason(String closeReason) {
		this.closeReason = closeReason;
	}

	public String getFyyq() {
		return this.fyyq;
	}

	public void setFyyq(String fyyq) {
		this.fyyq = fyyq;
	}

	public String getProductmemo() {
		return this.productmemo;
	}

	public void setProductmemo(String productmemo) {
		this.productmemo = productmemo;
	}

	public String getOrderCimt() {
		return this.orderCimt;
	}

	public void setOrderCimt(String orderCimt) {
		this.orderCimt = orderCimt;
	}

	public String getOrderCimtDes() {
		return this.orderCimtDes;
	}

	public void setOrderCimtDes(String orderCimtDes) {
		this.orderCimtDes = orderCimtDes;
	}

	public Date getApsDate() {
		return this.apsDate;
	}

	public void setApsDate(Date apsDate) {
		this.apsDate = apsDate;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getFutureQty() {
		return this.futureQty;
	}

	public void setFutureQty(String futureQty) {
		this.futureQty = futureQty;
	}

	public String getMnFlag() {
		return this.mnFlag;
	}

	public void setMnFlag(String mnFlag) {
		this.mnFlag = mnFlag;
	}

	public String getRzQty() {
		return this.rzQty;
	}

	public void setRzQty(String rzQty) {
		this.rzQty = rzQty;
	}

	public String getRzFlag() {
		return this.rzFlag;
	}

	public void setRzFlag(String rzFlag) {
		this.rzFlag = rzFlag;
	}

	public String getCrmFlag() {
		return this.crmFlag;
	}

	public void setCrmFlag(String crmFlag) {
		this.crmFlag = crmFlag;
	}

	public String getZbsBj() {
		return this.zbsBj;
	}

	public void setZbsBj(String zbsBj) {
		this.zbsBj = zbsBj;
	}

	public String getFyYq() {
		return this.fyYq;
	}

	public void setFyYq(String fyYq) {
		this.fyYq = fyYq;
	}

	public String getFyQty() {
		return this.fyQty;
	}

	public void setFyQty(String fyQty) {
		this.fyQty = fyQty;
	}

	public String getBz1() {
		return this.bz1;
	}

	public void setBz1(String bz1) {
		this.bz1 = bz1;
	}

	public String getBz2() {
		return this.bz2;
	}

	public void setBz2(String bz2) {
		this.bz2 = bz2;
	}

	public String getBz3() {
		return this.bz3;
	}

	public void setBz3(String bz3) {
		this.bz3 = bz3;
	}

	public String getBz4() {
		return this.bz4;
	}

	public void setBz4(String bz4) {
		this.bz4 = bz4;
	}

	public String getBz5() {
		return this.bz5;
	}

	public void setBz5(String bz5) {
		this.bz5 = bz5;
	}

	public String getIsConfirm() {
		return this.isConfirm;
	}

	public void setIsConfirm(String isConfirm) {
		this.isConfirm = isConfirm;
	}

	public String getJqQty() {
		return this.jqQty;
	}

	public void setJqQty(String jqQty) {
		this.jqQty = jqQty;
	}

	public String getMesQty() {
		return this.mesQty;
	}

	public void setMesQty(String mesQty) {
		this.mesQty = mesQty;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"orderGuid='" + orderGuid + '\'' +
					"seq='" + seq + '\'' +
					"prdNo='" + prdNo + '\'' +
					"prdGuid='" + prdGuid + '\'' +
					"finalUserGuid='" + finalUserGuid + '\'' +
					"finalFunctionGuid='" + finalFunctionGuid + '\'' +
					"spec1='" + spec1 + '\'' +
					"spec2='" + spec2 + '\'' +
					"spec3='" + spec3 + '\'' +
					"qty='" + qty + '\'' +
					"deliverydate='" + deliverydate + '\'' +
					"unitGuid='" + unitGuid + '\'' +
					"itemGuid='" + itemGuid + '\'' +
					"brandGuid='" + brandGuid + '\'' +
					"std='" + std + '\'' +
					"productType='" + productType + '\'' +
					"productTypeDes='" + productTypeDes + '\'' +
					"pSpec1Tol='" + pSpec1Tol + '\'' +
					"nSpec1Tol='" + nSpec1Tol + '\'' +
					"spec1ConReq='" + spec1ConReq + '\'' +
					"pSpec2Tol='" + pSpec2Tol + '\'' +
					"nSpec2Tol='" + nSpec2Tol + '\'' +
					"spec2ConReq='" + spec2ConReq + '\'' +
					"pSpec3Tol='" + pSpec3Tol + '\'' +
					"nSpec3Tol='" + nSpec3Tol + '\'' +
					"spec3ConReq='" + spec3ConReq + '\'' +
					"paperInnerDia1='" + paperInnerDia1 + '\'' +
					"paperInnerDia2='" + paperInnerDia2 + '\'' +
					"paperInnerDia3='" + paperInnerDia3 + '\'' +
					"minOuterDia='" + minOuterDia + '\'' +
					"maxOuterDia='" + maxOuterDia + '\'' +
					"minRollWeight='" + minRollWeight + '\'' +
					"maxRollWeight='" + maxRollWeight + '\'' +
					"minHardness='" + minHardness + '\'' +
					"maxHardness='" + maxHardness + '\'' +
					"minTs='" + minTs + '\'' +
					"maxTs='" + maxTs + '\'' +
					"minYs='" + minYs + '\'' +
					"maxYs='" + maxYs + '\'' +
					"minElongation='" + minElongation + '\'' +
					"maxElongation='" + maxElongation + '\'' +
					"minCondty='" + minCondty + '\'' +
					"maxCondty='" + maxCondty + '\'' +
					"gBendingWidth1='" + gBendingWidth1 + '\'' +
					"gBendingWidth2='" + gBendingWidth2 + '\'' +
					"bBendingWidth1='" + bBendingWidth1 + '\'' +
					"bBendingWidth2='" + bBendingWidth2 + '\'' +
					"gBendingR1='" + gBendingR1 + '\'' +
					"bBendingR1='" + bBendingR1 + '\'' +
					"gBendingR2='" + gBendingR2 + '\'' +
					"bBendingR2='" + bBendingR2 + '\'' +
					"highYelTemp='" + highYelTemp + '\'' +
					"highYelTime='" + highYelTime + '\'' +
					"highYelTimes='" + highYelTimes + '\'' +
					"remark='" + remark + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"status='" + status + '\'' +
					"crmStatus='" + crmStatus + '\'' +
					"customermaterial='" + customermaterial + '\'' +
					"accountstate='" + accountstate + '\'' +
					"maxluster='" + maxluster + '\'' +
					"wind='" + wind + '\'' +
					"winddes='" + winddes + '\'' +
					"burr='" + burr + '\'' +
					"graintype='" + graintype + '\'' +
					"mingraintype='" + mingraintype + '\'' +
					"maxgraintype='" + maxgraintype + '\'' +
					"saltfogtimereq='" + saltfogtimereq + '\'' +
					"saltfoglevelreqno='" + saltfoglevelreqno + '\'' +
					"minroughra='" + minroughra + '\'' +
					"maxroughra='" + maxroughra + '\'' +
					"minrough='" + minrough + '\'' +
					"maxrough='" + maxrough + '\'' +
					"resisthightemp='" + resisthightemp + '\'' +
					"resisthightime='" + resisthightime + '\'' +
					"resisthighgoal='" + resisthighgoal + '\'' +
					"minluster='" + minluster + '\'' +
					"brandNo='" + brandNo + '\'' +
					"goodsNo='" + goodsNo + '\'' +
					"addattributeno='" + addattributeno + '\'' +
					"addattributedes='" + addattributedes + '\'' +
					"addattributedec='" + addattributedec + '\'' +
					"factoryNo='" + factoryNo + '\'' +
					"typeno='" + typeno + '\'' +
					"producttypeno='" + producttypeno + '\'' +
					"ismark='" + ismark + '\'' +
					"markdesc='" + markdesc + '\'' +
					"ordSaleordertwo='" + ordSaleordertwo + '\'' +
					"ordSaleorderlinetwo='" + ordSaleorderlinetwo + '\'' +
					"isapsclac='" + isapsclac + '\'' +
					"minorderweight='" + minorderweight + '\'' +
					"maxorderweight='" + maxorderweight + '\'' +
					"platmin='" + platmin + '\'' +
					"platmax='" + platmax + '\'' +
					"platmaterial='" + platmaterial + '\'' +
					"cambertest='" + cambertest + '\'' +
					"camber='" + camber + '\'' +
					"crossbow='" + crossbow + '\'' +
					"flatness='" + flatness + '\'' +
					"wavehigh='" + wavehigh + '\'' +
					"coilsetlong='" + coilsetlong + '\'' +
					"coilset='" + coilset + '\'' +
					"twisttestno='" + twisttestno + '\'' +
					"twist='" + twist + '\'' +
					"packtype='" + packtype + '\'' +
					"packrequire='" + packrequire + '\'' +
					"package='" + packageCol + '\'' +
					"recoveryno='" + recoveryno + '\'' +
					"producttwo='" + producttwo + '\'' +
					"packmaterialqty='" + packmaterialqty + '\'' +
					"packrequirenex='" + packrequirenex + '\'' +
					"identy='" + identy + '\'' +
					"identydesc='" + identydesc + '\'' +
					"harmenvirlimitno='" + harmenvirlimitno + '\'' +
					"harmenvironment='" + harmenvironment + '\'' +
					"iscomponent='" + iscomponent + '\'' +
					"isagreement='" + isagreement + '\'' +
					"surfaceclass='" + surfaceclass + '\'' +
					"makeDay='" + makeDay + '\'' +
					"tinsolder='" + tinsolder + '\'' +
					"replyDelDate='" + replyDelDate + '\'' +
					"jqChangeReason='" + jqChangeReason + '\'' +
					"scheduleDelDate='" + scheduleDelDate + '\'' +
					"closeFlag='" + closeFlag + '\'' +
					"closeReason='" + closeReason + '\'' +
					"fyyq='" + fyyq + '\'' +
					"productmemo='" + productmemo + '\'' +
					"orderCimt='" + orderCimt + '\'' +
					"orderCimtDes='" + orderCimtDes + '\'' +
					"apsDate='" + apsDate + '\'' +
					"orderNo='" + orderNo + '\'' +
					"futureQty='" + futureQty + '\'' +
					"mnFlag='" + mnFlag + '\'' +
					"rzQty='" + rzQty + '\'' +
					"rzFlag='" + rzFlag + '\'' +
					"crmFlag='" + crmFlag + '\'' +
					"zbsBj='" + zbsBj + '\'' +
					"fyYq='" + fyYq + '\'' +
					"fyQty='" + fyQty + '\'' +
					"bz1='" + bz1 + '\'' +
					"bz2='" + bz2 + '\'' +
					"bz3='" + bz3 + '\'' +
					"bz4='" + bz4 + '\'' +
					"bz5='" + bz5 + '\'' +
					"isConfirm='" + isConfirm + '\'' +
					"jqQty='" + jqQty + '\'' +
					"mesQty='" + mesQty + '\'' +
				'}';
	}

}
