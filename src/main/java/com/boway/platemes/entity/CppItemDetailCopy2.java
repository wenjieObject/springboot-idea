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
@Table ( name ="CPP_ITEM_DETAIL_copy2" , schema = "")
public class CppItemDetailCopy2  implements Serializable {

	private static final long serialVersionUID =  3811440958410373908L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "FROM_GUID" )
	private String fromGuid;

   	@Column(name = "ITEM_INDEX_SEQ" )
	private String itemIndexSeq;

   	@Column(name = "SPECS_MIN1" )
	private String specsMin1;

   	@Column(name = "SPECS_MAX1" )
	private String specsMax1;

   	@Column(name = "SPECS_STD1" )
	private String specsStd1;

   	@Column(name = "SPECS_MIN2" )
	private String specsMin2;

   	@Column(name = "SPECS_MAX2" )
	private String specsMax2;

   	@Column(name = "SPECS_STD2" )
	private String specsStd2;

   	@Column(name = "SPECS_MIN3" )
	private String specsMin3;

   	@Column(name = "SPECS_MAX3" )
	private String specsMax3;

   	@Column(name = "SPECS_STD3" )
	private String specsStd3;

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

   	@Column(name = "FINAL_USER_GUID" )
	private String finalUserGuid;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getFromGuid() {
		return this.fromGuid;
	}

	public void setFromGuid(String fromGuid) {
		this.fromGuid = fromGuid;
	}

	public String getItemIndexSeq() {
		return this.itemIndexSeq;
	}

	public void setItemIndexSeq(String itemIndexSeq) {
		this.itemIndexSeq = itemIndexSeq;
	}

	public String getSpecsMin1() {
		return this.specsMin1;
	}

	public void setSpecsMin1(String specsMin1) {
		this.specsMin1 = specsMin1;
	}

	public String getSpecsMax1() {
		return this.specsMax1;
	}

	public void setSpecsMax1(String specsMax1) {
		this.specsMax1 = specsMax1;
	}

	public String getSpecsStd1() {
		return this.specsStd1;
	}

	public void setSpecsStd1(String specsStd1) {
		this.specsStd1 = specsStd1;
	}

	public String getSpecsMin2() {
		return this.specsMin2;
	}

	public void setSpecsMin2(String specsMin2) {
		this.specsMin2 = specsMin2;
	}

	public String getSpecsMax2() {
		return this.specsMax2;
	}

	public void setSpecsMax2(String specsMax2) {
		this.specsMax2 = specsMax2;
	}

	public String getSpecsStd2() {
		return this.specsStd2;
	}

	public void setSpecsStd2(String specsStd2) {
		this.specsStd2 = specsStd2;
	}

	public String getSpecsMin3() {
		return this.specsMin3;
	}

	public void setSpecsMin3(String specsMin3) {
		this.specsMin3 = specsMin3;
	}

	public String getSpecsMax3() {
		return this.specsMax3;
	}

	public void setSpecsMax3(String specsMax3) {
		this.specsMax3 = specsMax3;
	}

	public String getSpecsStd3() {
		return this.specsStd3;
	}

	public void setSpecsStd3(String specsStd3) {
		this.specsStd3 = specsStd3;
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

	public String getFinalUserGuid() {
		return this.finalUserGuid;
	}

	public void setFinalUserGuid(String finalUserGuid) {
		this.finalUserGuid = finalUserGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"fromGuid='" + fromGuid + '\'' +
					"itemIndexSeq='" + itemIndexSeq + '\'' +
					"specsMin1='" + specsMin1 + '\'' +
					"specsMax1='" + specsMax1 + '\'' +
					"specsStd1='" + specsStd1 + '\'' +
					"specsMin2='" + specsMin2 + '\'' +
					"specsMax2='" + specsMax2 + '\'' +
					"specsStd2='" + specsStd2 + '\'' +
					"specsMin3='" + specsMin3 + '\'' +
					"specsMax3='" + specsMax3 + '\'' +
					"specsStd3='" + specsStd3 + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"finalUserGuid='" + finalUserGuid + '\'' +
				'}';
	}

}
