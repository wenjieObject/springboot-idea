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
@Table ( name ="CPP_PRD_BRAND_BAS" , schema = "")
public class CppPrdBrandBas  implements Serializable {

	private static final long serialVersionUID =  8364925083186391439L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "FACTORY" )
	private String factory;

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

   	@Column(name = "BRAND_NO" )
	private String brandNo;

   	@Column(name = "BRAND_NAME" )
	private String brandName;

   	@Column(name = "DENSITY" )
	private String density;

   	@Column(name = "UNIT_GUID" )
	private String unitGuid;

   	@Column(name = "ITEM_GUID" )
	private String itemGuid;

	/**
	 * 副产出的物料的GUID
	 */
   	@Column(name = "MAT_F_GUID" )
	private String matFGuid;

	/**
	 * 炉灰的物料的GUID
	 */
   	@Column(name = "MAT_LH_GUID" )
	private String matLhGuid;

	/**
	 * 副产物料GUID
	 */
   	@Column(name = "MAT_TB_GUID" )
	private String matTbGuid;

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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
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

	public String getBrandNo() {
		return this.brandNo;
	}

	public void setBrandNo(String brandNo) {
		this.brandNo = brandNo;
	}

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getDensity() {
		return this.density;
	}

	public void setDensity(String density) {
		this.density = density;
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

	public String getMatFGuid() {
		return this.matFGuid;
	}

	public void setMatFGuid(String matFGuid) {
		this.matFGuid = matFGuid;
	}

	public String getMatLhGuid() {
		return this.matLhGuid;
	}

	public void setMatLhGuid(String matLhGuid) {
		this.matLhGuid = matLhGuid;
	}

	public String getMatTbGuid() {
		return this.matTbGuid;
	}

	public void setMatTbGuid(String matTbGuid) {
		this.matTbGuid = matTbGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"creator='" + creator + '\'' +
					"factory='" + factory + '\'' +
					"modifier='" + modifier + '\'' +
					"createTime='" + createTime + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"brandNo='" + brandNo + '\'' +
					"brandName='" + brandName + '\'' +
					"density='" + density + '\'' +
					"unitGuid='" + unitGuid + '\'' +
					"itemGuid='" + itemGuid + '\'' +
					"matFGuid='" + matFGuid + '\'' +
					"matLhGuid='" + matLhGuid + '\'' +
					"matTbGuid='" + matTbGuid + '\'' +
				'}';
	}

}
