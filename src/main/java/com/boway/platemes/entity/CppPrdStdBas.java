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
@Table ( name ="CPP_PRD_STD_BAS" , schema = "")
public class CppPrdStdBas  implements Serializable {

	private static final long serialVersionUID =  2710626674886813671L;

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

   	@Column(name = "STD_RULE_NO" )
	private String stdRuleNo;

   	@Column(name = "STD_DESCRIPTION" )
	private String stdDescription;

   	@Column(name = "STD" )
	private String std;

   	@Column(name = "STD_CHS_NAME" )
	private String stdChsName;

   	@Column(name = "STD_ENG_NAME" )
	private String stdEngName;

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

	public String getStdRuleNo() {
		return this.stdRuleNo;
	}

	public void setStdRuleNo(String stdRuleNo) {
		this.stdRuleNo = stdRuleNo;
	}

	public String getStdDescription() {
		return this.stdDescription;
	}

	public void setStdDescription(String stdDescription) {
		this.stdDescription = stdDescription;
	}

	public String getStd() {
		return this.std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getStdChsName() {
		return this.stdChsName;
	}

	public void setStdChsName(String stdChsName) {
		this.stdChsName = stdChsName;
	}

	public String getStdEngName() {
		return this.stdEngName;
	}

	public void setStdEngName(String stdEngName) {
		this.stdEngName = stdEngName;
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
					"stdRuleNo='" + stdRuleNo + '\'' +
					"stdDescription='" + stdDescription + '\'' +
					"std='" + std + '\'' +
					"stdChsName='" + stdChsName + '\'' +
					"stdEngName='" + stdEngName + '\'' +
				'}';
	}

}
