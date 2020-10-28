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
 * @Date 2020-10-28 11:01:04 
 */

@Entity
@Table ( name ="WIP_ORDER" , schema = "")
public class WipOrder  implements Serializable {

	private static final long serialVersionUID =  9128642497381573915L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 询单号
	 */
   	@Column(name = "INQUIRIES_NO" )
	private String inquiriesNo;

	/**
	 * 订单类型:1 常规订单
2 试样订单
3 厂内试样订单
4 厂内预测订单
5 厂内备库订单 
6 模拟订单
	 */
   	@Column(name = "ORDER_TYPE" )
	private String orderType;

	/**
	 * 客户编号
	 */
   	@Column(name = "CUSTOMER_NO" )
	private String customerNo;

	/**
	 * 客户名称
	 */
   	@Column(name = "CUSTOMER_NAME" )
	private String customerName;

	/**
	 * 例如：ZR01
	 */
   	@Column(name = "SAP_ORDER_TYPE" )
	private String sapOrderType;

	/**
	 * 交期确认状态 Y/N
	 */
   	@Column(name = "CONFIRM_STATUS" )
	private String confirmStatus;

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
	 * 订单类型描述:常规订单
试样订单
厂内试样订单
厂内预测订单
厂内备库订单 
模拟订单
	 */
   	@Column(name = "ORDER_TYPE_DESC" )
	private String orderTypeDesc;

	/**
	 * 是否收费:0 是；1 否
	 */
   	@Column(name = "ISCHARGE" )
	private String ischarge;

	/**
	 * 例如：外贸销售订单
	 */
   	@Column(name = "SAP_ORDER_TYPE_DES" )
	private String sapOrderTypeDes;

	/**
	 * 销售询单状态：0启动 1关闭
	 */
   	@Column(name = "ORDER_STATE" )
	private String orderState;

	/**
	 * 销售询单关闭原因
	 */
   	@Column(name = "ORDER_SEASON" )
	private String orderSeason;

	/**
	 * 销售员工的工号
	 */
   	@Column(name = "SALES_MAN_NO" )
	private String salesManNo;

	/**
	 * 销售员工的名称
	 */
   	@Column(name = "SALES_MAN_NAME" )
	private String salesManName;

	/**
	 * 010：委外加工
020：外购材料
	 */
   	@Column(name = "OUTSOURCE_TYPE" )
	private String outsourceType;

	/**
	 * 委外加工；
外购材料
	 */
   	@Column(name = "OUTSOURCE_TYPE_DES" )
	private String outsourceTypeDes;

	/**
	 * 事业部名称
	 */
   	@Column(name = "BUSINESS_UNIT_NAME" )
	private String businessUnitName;

	/**
	 * 商务助理工号
	 */
   	@Column(name = "BUSINESS_NO" )
	private String businessNo;

	/**
	 * 商务助理名称
	 */
   	@Column(name = "BUSINESS_NAME" )
	private String businessName;

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
	 * 客户订单号
	 */
   	@Column(name = "CUS_DOC_NO" )
	private String cusDocNo;

	/**
	 * 客户组编号
	 */
   	@Column(name = "CUS_TYPE_CODE" )
	private String cusTypeCode;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getInquiriesNo() {
		return this.inquiriesNo;
	}

	public void setInquiriesNo(String inquiriesNo) {
		this.inquiriesNo = inquiriesNo;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getCustomerNo() {
		return this.customerNo;
	}

	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSapOrderType() {
		return this.sapOrderType;
	}

	public void setSapOrderType(String sapOrderType) {
		this.sapOrderType = sapOrderType;
	}

	public String getConfirmStatus() {
		return this.confirmStatus;
	}

	public void setConfirmStatus(String confirmStatus) {
		this.confirmStatus = confirmStatus;
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

	public String getOrderTypeDesc() {
		return this.orderTypeDesc;
	}

	public void setOrderTypeDesc(String orderTypeDesc) {
		this.orderTypeDesc = orderTypeDesc;
	}

	public String getIscharge() {
		return this.ischarge;
	}

	public void setIscharge(String ischarge) {
		this.ischarge = ischarge;
	}

	public String getSapOrderTypeDes() {
		return this.sapOrderTypeDes;
	}

	public void setSapOrderTypeDes(String sapOrderTypeDes) {
		this.sapOrderTypeDes = sapOrderTypeDes;
	}

	public String getOrderState() {
		return this.orderState;
	}

	public void setOrderState(String orderState) {
		this.orderState = orderState;
	}

	public String getOrderSeason() {
		return this.orderSeason;
	}

	public void setOrderSeason(String orderSeason) {
		this.orderSeason = orderSeason;
	}

	public String getSalesManNo() {
		return this.salesManNo;
	}

	public void setSalesManNo(String salesManNo) {
		this.salesManNo = salesManNo;
	}

	public String getSalesManName() {
		return this.salesManName;
	}

	public void setSalesManName(String salesManName) {
		this.salesManName = salesManName;
	}

	public String getOutsourceType() {
		return this.outsourceType;
	}

	public void setOutsourceType(String outsourceType) {
		this.outsourceType = outsourceType;
	}

	public String getOutsourceTypeDes() {
		return this.outsourceTypeDes;
	}

	public void setOutsourceTypeDes(String outsourceTypeDes) {
		this.outsourceTypeDes = outsourceTypeDes;
	}

	public String getBusinessUnitName() {
		return this.businessUnitName;
	}

	public void setBusinessUnitName(String businessUnitName) {
		this.businessUnitName = businessUnitName;
	}

	public String getBusinessNo() {
		return this.businessNo;
	}

	public void setBusinessNo(String businessNo) {
		this.businessNo = businessNo;
	}

	public String getBusinessName() {
		return this.businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
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

	public String getCusDocNo() {
		return this.cusDocNo;
	}

	public void setCusDocNo(String cusDocNo) {
		this.cusDocNo = cusDocNo;
	}

	public String getCusTypeCode() {
		return this.cusTypeCode;
	}

	public void setCusTypeCode(String cusTypeCode) {
		this.cusTypeCode = cusTypeCode;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"inquiriesNo='" + inquiriesNo + '\'' +
					"orderType='" + orderType + '\'' +
					"customerNo='" + customerNo + '\'' +
					"customerName='" + customerName + '\'' +
					"sapOrderType='" + sapOrderType + '\'' +
					"confirmStatus='" + confirmStatus + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"orderTypeDesc='" + orderTypeDesc + '\'' +
					"ischarge='" + ischarge + '\'' +
					"sapOrderTypeDes='" + sapOrderTypeDes + '\'' +
					"orderState='" + orderState + '\'' +
					"orderSeason='" + orderSeason + '\'' +
					"salesManNo='" + salesManNo + '\'' +
					"salesManName='" + salesManName + '\'' +
					"outsourceType='" + outsourceType + '\'' +
					"outsourceTypeDes='" + outsourceTypeDes + '\'' +
					"businessUnitName='" + businessUnitName + '\'' +
					"businessNo='" + businessNo + '\'' +
					"businessName='" + businessName + '\'' +
					"orderCimt='" + orderCimt + '\'' +
					"orderCimtDes='" + orderCimtDes + '\'' +
					"cusDocNo='" + cusDocNo + '\'' +
					"cusTypeCode='" + cusTypeCode + '\'' +
				'}';
	}

}
