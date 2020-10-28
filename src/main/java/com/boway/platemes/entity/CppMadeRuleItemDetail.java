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
@Table ( name ="CPP_MADE_RULE_ITEM_DETAIL" , schema = "")
public class CppMadeRuleItemDetail  implements Serializable {

	private static final long serialVersionUID =  5900352680601292376L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "CATEGORY_GUID" )
	private String categoryGuid;

   	@Column(name = "CATEGORY_NO" )
	private String categoryNo;

   	@Column(name = "ITEM_GUID" )
	private String itemGuid;

   	@Column(name = "ITEM_DETAIL_GUID" )
	private String itemDetailGuid;

   	@Column(name = "ITEM_CATEGORY_GUID" )
	private String itemCategoryGuid;

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

	public String getCategoryGuid() {
		return this.categoryGuid;
	}

	public void setCategoryGuid(String categoryGuid) {
		this.categoryGuid = categoryGuid;
	}

	public String getCategoryNo() {
		return this.categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getItemGuid() {
		return this.itemGuid;
	}

	public void setItemGuid(String itemGuid) {
		this.itemGuid = itemGuid;
	}

	public String getItemDetailGuid() {
		return this.itemDetailGuid;
	}

	public void setItemDetailGuid(String itemDetailGuid) {
		this.itemDetailGuid = itemDetailGuid;
	}

	public String getItemCategoryGuid() {
		return this.itemCategoryGuid;
	}

	public void setItemCategoryGuid(String itemCategoryGuid) {
		this.itemCategoryGuid = itemCategoryGuid;
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
					"categoryGuid='" + categoryGuid + '\'' +
					"categoryNo='" + categoryNo + '\'' +
					"itemGuid='" + itemGuid + '\'' +
					"itemDetailGuid='" + itemDetailGuid + '\'' +
					"itemCategoryGuid='" + itemCategoryGuid + '\'' +
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
