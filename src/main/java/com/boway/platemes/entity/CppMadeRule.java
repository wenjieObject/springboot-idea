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
@Table ( name ="CPP_MADE_RULE" , schema = "")
public class CppMadeRule  implements Serializable {

	private static final long serialVersionUID =  1444520638615240812L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "MADE_RULE_NO" )
	private String madeRuleNo;

   	@Column(name = "MADE_RULE_NAME" )
	private String madeRuleName;

   	@Column(name = "MADE_RULE_VER" )
	private String madeRuleVer;

   	@Column(name = "DESCRIPTION" )
	private String description;

   	@Column(name = "MADE_RULE_CHECK" )
	private String madeRuleCheck;

   	@Column(name = "EFFECTIVE" )
	private String effective;

   	@Column(name = "TYPE" )
	private String type;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "FACTORY" )
	private String factory;

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

	public String getMadeRuleNo() {
		return this.madeRuleNo;
	}

	public void setMadeRuleNo(String madeRuleNo) {
		this.madeRuleNo = madeRuleNo;
	}

	public String getMadeRuleName() {
		return this.madeRuleName;
	}

	public void setMadeRuleName(String madeRuleName) {
		this.madeRuleName = madeRuleName;
	}

	public String getMadeRuleVer() {
		return this.madeRuleVer;
	}

	public void setMadeRuleVer(String madeRuleVer) {
		this.madeRuleVer = madeRuleVer;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMadeRuleCheck() {
		return this.madeRuleCheck;
	}

	public void setMadeRuleCheck(String madeRuleCheck) {
		this.madeRuleCheck = madeRuleCheck;
	}

	public String getEffective() {
		return this.effective;
	}

	public void setEffective(String effective) {
		this.effective = effective;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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
					"madeRuleNo='" + madeRuleNo + '\'' +
					"madeRuleName='" + madeRuleName + '\'' +
					"madeRuleVer='" + madeRuleVer + '\'' +
					"description='" + description + '\'' +
					"madeRuleCheck='" + madeRuleCheck + '\'' +
					"effective='" + effective + '\'' +
					"type='" + type + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"factory='" + factory + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
				'}';
	}

}
