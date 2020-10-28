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
@Table ( name ="CPP_PRD_MADE_RULE_RELATION_BAS" , schema = "")
public class CppPrdMadeRuleRelationBas  implements Serializable {

	private static final long serialVersionUID =  1644166778445379098L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "PRD_GUID" )
	private String prdGuid;

   	@Column(name = "FINAL_USER_GUID" )
	private String finalUserGuid;

   	@Column(name = "FINAL_FUNCTION_GUID" )
	private String finalFunctionGuid;

   	@Column(name = "MADE_RULE_GUID" )
	private String madeRuleGuid;

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

	public String getPrdGuid() {
		return this.prdGuid;
	}

	public void setPrdGuid(String prdGuid) {
		this.prdGuid = prdGuid;
	}

	public String getFinalUserGuid() {
		return this.finalUserGuid;
	}

	public void setFinalUserGuid(String finalUserGuid) {
		this.finalUserGuid = finalUserGuid;
	}

	public String getFinalFunctionGuid() {
		return this.finalFunctionGuid;
	}

	public void setFinalFunctionGuid(String finalFunctionGuid) {
		this.finalFunctionGuid = finalFunctionGuid;
	}

	public String getMadeRuleGuid() {
		return this.madeRuleGuid;
	}

	public void setMadeRuleGuid(String madeRuleGuid) {
		this.madeRuleGuid = madeRuleGuid;
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
					"prdGuid='" + prdGuid + '\'' +
					"finalUserGuid='" + finalUserGuid + '\'' +
					"finalFunctionGuid='" + finalFunctionGuid + '\'' +
					"madeRuleGuid='" + madeRuleGuid + '\'' +
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
