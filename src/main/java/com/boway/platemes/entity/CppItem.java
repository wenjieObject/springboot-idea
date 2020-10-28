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
@Table ( name ="CPP_ITEM" , schema = "")
public class CppItem  implements Serializable {

	private static final long serialVersionUID =  1819780323640340714L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "ITEM_CATEGORY_GUID" )
	private String itemCategoryGuid;

   	@Column(name = "VER" )
	private String ver;

   	@Column(name = "BRAND_GUID" )
	private String brandGuid;

   	@Column(name = "STATE_CATEGORY_GUID" )
	private String stateCategoryGuid;

   	@Column(name = "BIG_CATEGORY_GUID" )
	private String bigCategoryGuid;

   	@Column(name = "DESCRIPTION" )
	private String description;

   	@Column(name = "EFFECTIVE" )
	private String effective;

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

   	@Column(name = "ITEM_INDEX_NO" )
	private String itemIndexNo;

   	@Column(name = "CONTROL_STD" )
	private String controlStd;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getItemCategoryGuid() {
		return this.itemCategoryGuid;
	}

	public void setItemCategoryGuid(String itemCategoryGuid) {
		this.itemCategoryGuid = itemCategoryGuid;
	}

	public String getVer() {
		return this.ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getBrandGuid() {
		return this.brandGuid;
	}

	public void setBrandGuid(String brandGuid) {
		this.brandGuid = brandGuid;
	}

	public String getStateCategoryGuid() {
		return this.stateCategoryGuid;
	}

	public void setStateCategoryGuid(String stateCategoryGuid) {
		this.stateCategoryGuid = stateCategoryGuid;
	}

	public String getBigCategoryGuid() {
		return this.bigCategoryGuid;
	}

	public void setBigCategoryGuid(String bigCategoryGuid) {
		this.bigCategoryGuid = bigCategoryGuid;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEffective() {
		return this.effective;
	}

	public void setEffective(String effective) {
		this.effective = effective;
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

	public String getItemIndexNo() {
		return this.itemIndexNo;
	}

	public void setItemIndexNo(String itemIndexNo) {
		this.itemIndexNo = itemIndexNo;
	}

	public String getControlStd() {
		return this.controlStd;
	}

	public void setControlStd(String controlStd) {
		this.controlStd = controlStd;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"itemCategoryGuid='" + itemCategoryGuid + '\'' +
					"ver='" + ver + '\'' +
					"brandGuid='" + brandGuid + '\'' +
					"stateCategoryGuid='" + stateCategoryGuid + '\'' +
					"bigCategoryGuid='" + bigCategoryGuid + '\'' +
					"description='" + description + '\'' +
					"effective='" + effective + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"itemIndexNo='" + itemIndexNo + '\'' +
					"controlStd='" + controlStd + '\'' +
				'}';
	}

}
