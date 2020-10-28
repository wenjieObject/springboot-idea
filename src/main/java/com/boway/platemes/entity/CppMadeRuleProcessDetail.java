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
@Table ( name ="CPP_MADE_RULE_PROCESS_DETAIL" , schema = "")
public class CppMadeRuleProcessDetail  implements Serializable {

	private static final long serialVersionUID =  1965563362671515551L;

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

   	@Column(name = "MADE_RULE_GUID" )
	private String madeRuleGuid;

   	@Column(name = "PROCESS_NO" )
	private String processNo;

   	@Column(name = "PRIORITY" )
	private String priority;

   	@Column(name = "PROCESS_NAME" )
	private String processName;

	/**
	 * 产线类型
	 */
   	@Column(name = "PROCESS_TYPE" )
	private String processType;

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

	public String getMadeRuleGuid() {
		return this.madeRuleGuid;
	}

	public void setMadeRuleGuid(String madeRuleGuid) {
		this.madeRuleGuid = madeRuleGuid;
	}

	public String getProcessNo() {
		return this.processNo;
	}

	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getProcessName() {
		return this.processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getProcessType() {
		return this.processType;
	}

	public void setProcessType(String processType) {
		this.processType = processType;
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
					"madeRuleGuid='" + madeRuleGuid + '\'' +
					"processNo='" + processNo + '\'' +
					"priority='" + priority + '\'' +
					"processName='" + processName + '\'' +
					"processType='" + processType + '\'' +
				'}';
	}

}
