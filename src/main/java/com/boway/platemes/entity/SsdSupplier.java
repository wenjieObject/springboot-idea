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
 * @Author  wenjiejiang
 * @Date 2020-11-24 14:17:11 
 */

@Entity
@Table ( name ="SSD_SUPPLIER" , schema = "")
public class SsdSupplier  implements Serializable {

	private static final long serialVersionUID =  7004973844564362026L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

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

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "SUPPLIER_NO" )
	private String supplierNo;

   	@Column(name = "SUPPLIER_NAME" )
	private String supplierName;

   	@Column(name = "SUPPLIER_TPYE" )
	private String supplierTpye;

   	@Column(name = "REMARK" )
	private String remark;

   	@Column(name = "SUPPLIER_CATEGORY" )
	private String supplierCategory;

   	@Column(name = "CATEGORY_DESCRIPTION" )
	private String categoryDescription;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getSupplierNo() {
		return this.supplierNo;
	}

	public void setSupplierNo(String supplierNo) {
		this.supplierNo = supplierNo;
	}

	public String getSupplierName() {
		return this.supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierTpye() {
		return this.supplierTpye;
	}

	public void setSupplierTpye(String supplierTpye) {
		this.supplierTpye = supplierTpye;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSupplierCategory() {
		return this.supplierCategory;
	}

	public void setSupplierCategory(String supplierCategory) {
		this.supplierCategory = supplierCategory;
	}

	public String getCategoryDescription() {
		return this.categoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
					"supplierNo='" + supplierNo + '\'' +
					"supplierName='" + supplierName + '\'' +
					"supplierTpye='" + supplierTpye + '\'' +
					"remark='" + remark + '\'' +
					"supplierCategory='" + supplierCategory + '\'' +
					"categoryDescription='" + categoryDescription + '\'' +
				'}';
	}

}
