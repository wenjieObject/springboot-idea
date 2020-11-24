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
@Table ( name ="SSD_UNIT_CHANGE_BAS" , schema = "")
public class SsdUnitChangeBas  implements Serializable {

	private static final long serialVersionUID =  8860116870606538681L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "UNIT_FROM_GUID" )
	private String unitFromGuid;

   	@Column(name = "UNIT_TOGUID" )
	private String unitToguid;

   	@Column(name = "UNIT_FROM_BATCH" )
	private String unitFromBatch;

   	@Column(name = "UNIT_TO_BATCH" )
	private String unitToBatch;

   	@Column(name = "CHANGE_RATE" )
	private String changeRate;

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

	public String getUnitFromGuid() {
		return this.unitFromGuid;
	}

	public void setUnitFromGuid(String unitFromGuid) {
		this.unitFromGuid = unitFromGuid;
	}

	public String getUnitToguid() {
		return this.unitToguid;
	}

	public void setUnitToguid(String unitToguid) {
		this.unitToguid = unitToguid;
	}

	public String getUnitFromBatch() {
		return this.unitFromBatch;
	}

	public void setUnitFromBatch(String unitFromBatch) {
		this.unitFromBatch = unitFromBatch;
	}

	public String getUnitToBatch() {
		return this.unitToBatch;
	}

	public void setUnitToBatch(String unitToBatch) {
		this.unitToBatch = unitToBatch;
	}

	public String getChangeRate() {
		return this.changeRate;
	}

	public void setChangeRate(String changeRate) {
		this.changeRate = changeRate;
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
					"unitFromGuid='" + unitFromGuid + '\'' +
					"unitToguid='" + unitToguid + '\'' +
					"unitFromBatch='" + unitFromBatch + '\'' +
					"unitToBatch='" + unitToBatch + '\'' +
					"changeRate='" + changeRate + '\'' +
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
