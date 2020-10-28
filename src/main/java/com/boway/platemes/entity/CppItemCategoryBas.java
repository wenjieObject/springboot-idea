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
@Table ( name ="CPP_ITEM_CATEGORY_BAS" , schema = "")
public class CppItemCategoryBas  implements Serializable {

	private static final long serialVersionUID =  595069253021559944L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

   	@Column(name = "ITEM_CATEGORY_NO" )
	private String itemCategoryNo;

   	@Column(name = "ITEM_CATEGOR_NAME" )
	private String itemCategorName;

   	@Column(name = "DESCRIPTION" )
	private String description;

   	@Column(name = "PAGE_GUID" )
	private String pageGuid;

   	@Column(name = "ITEM_CATEGORY_TYPE" )
	private String itemCategoryType;

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

	public String getItemCategoryNo() {
		return this.itemCategoryNo;
	}

	public void setItemCategoryNo(String itemCategoryNo) {
		this.itemCategoryNo = itemCategoryNo;
	}

	public String getItemCategorName() {
		return this.itemCategorName;
	}

	public void setItemCategorName(String itemCategorName) {
		this.itemCategorName = itemCategorName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPageGuid() {
		return this.pageGuid;
	}

	public void setPageGuid(String pageGuid) {
		this.pageGuid = pageGuid;
	}

	public String getItemCategoryType() {
		return this.itemCategoryType;
	}

	public void setItemCategoryType(String itemCategoryType) {
		this.itemCategoryType = itemCategoryType;
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
					"itemCategoryNo='" + itemCategoryNo + '\'' +
					"itemCategorName='" + itemCategorName + '\'' +
					"description='" + description + '\'' +
					"pageGuid='" + pageGuid + '\'' +
					"itemCategoryType='" + itemCategoryType + '\'' +
				'}';
	}

}
