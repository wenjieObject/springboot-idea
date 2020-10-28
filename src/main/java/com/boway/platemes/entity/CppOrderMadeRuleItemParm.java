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
@Table ( name ="CPP_ORDER_MADE_RULE_ITEM_PARM" , schema = "")
public class CppOrderMadeRuleItemParm  implements Serializable {

	private static final long serialVersionUID =  3019589736210462891L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "ORDER_MADE_RULE_ITEM_GUID" )
	private String orderMadeRuleItemGuid;

   	@Column(name = "ITEM_PARM_GUID" )
	private String itemParmGuid;

   	@Column(name = "ITEM_PARM_VALUE" )
	private String itemParmValue;

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getOrderMadeRuleItemGuid() {
		return this.orderMadeRuleItemGuid;
	}

	public void setOrderMadeRuleItemGuid(String orderMadeRuleItemGuid) {
		this.orderMadeRuleItemGuid = orderMadeRuleItemGuid;
	}

	public String getItemParmGuid() {
		return this.itemParmGuid;
	}

	public void setItemParmGuid(String itemParmGuid) {
		this.itemParmGuid = itemParmGuid;
	}

	public String getItemParmValue() {
		return this.itemParmValue;
	}

	public void setItemParmValue(String itemParmValue) {
		this.itemParmValue = itemParmValue;
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

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"orderMadeRuleItemGuid='" + orderMadeRuleItemGuid + '\'' +
					"itemParmGuid='" + itemParmGuid + '\'' +
					"itemParmValue='" + itemParmValue + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
				'}';
	}

}
