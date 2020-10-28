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
 * @Date 2020-10-28 10:47:09 
 */

@Entity
@Table ( name ="CPP_ORDER_MADE_RULE_ITEM" , schema = "")
public class CppOrderMadeRuleItem  implements Serializable {

	private static final long serialVersionUID =  5919575806056420943L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

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
	 * 修改者
	 */
   	@Column(name = "MODIFIER" )
	private String modifier;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

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
	 * 订单明细GUID
	 */
   	@Column(name = "ORDER_DETAIL_GUID" )
	private String orderDetailGuid;

	/**
	 * 制造规范项目明细GUID
	 */
   	@Column(name = "MADE_RULE_ITEM_DETAIL_GUID" )
	private String madeRuleItemDetailGuid;

	/**
	 * 项目明细GUID
	 */
   	@Column(name = "ITEM_DETAIL_GUID" )
	private String itemDetailGuid;

	/**
	 * 分类GUID
	 */
   	@Column(name = "CATEGORY_GUID" )
	private String categoryGuid;

   	@Column(name = "PRD_GUID" )
	private String prdGuid;

   	@Column(name = "STD_MACHINE_TIME" )
	private String stdMachineTime;

	/**
	 * 上级项目GUID
	 */
   	@Column(name = "HIGHER_ITEM_DETAIL_GUID" )
	private String higherItemDetailGuid;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getOrderDetailGuid() {
		return this.orderDetailGuid;
	}

	public void setOrderDetailGuid(String orderDetailGuid) {
		this.orderDetailGuid = orderDetailGuid;
	}

	public String getMadeRuleItemDetailGuid() {
		return this.madeRuleItemDetailGuid;
	}

	public void setMadeRuleItemDetailGuid(String madeRuleItemDetailGuid) {
		this.madeRuleItemDetailGuid = madeRuleItemDetailGuid;
	}

	public String getItemDetailGuid() {
		return this.itemDetailGuid;
	}

	public void setItemDetailGuid(String itemDetailGuid) {
		this.itemDetailGuid = itemDetailGuid;
	}

	public String getCategoryGuid() {
		return this.categoryGuid;
	}

	public void setCategoryGuid(String categoryGuid) {
		this.categoryGuid = categoryGuid;
	}

	public String getPrdGuid() {
		return this.prdGuid;
	}

	public void setPrdGuid(String prdGuid) {
		this.prdGuid = prdGuid;
	}

	public String getStdMachineTime() {
		return this.stdMachineTime;
	}

	public void setStdMachineTime(String stdMachineTime) {
		this.stdMachineTime = stdMachineTime;
	}

	public String getHigherItemDetailGuid() {
		return this.higherItemDetailGuid;
	}

	public void setHigherItemDetailGuid(String higherItemDetailGuid) {
		this.higherItemDetailGuid = higherItemDetailGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"modifier='" + modifier + '\'' +
					"createTime='" + createTime + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"orderDetailGuid='" + orderDetailGuid + '\'' +
					"madeRuleItemDetailGuid='" + madeRuleItemDetailGuid + '\'' +
					"itemDetailGuid='" + itemDetailGuid + '\'' +
					"categoryGuid='" + categoryGuid + '\'' +
					"prdGuid='" + prdGuid + '\'' +
					"stdMachineTime='" + stdMachineTime + '\'' +
					"higherItemDetailGuid='" + higherItemDetailGuid + '\'' +
				'}';
	}

}
