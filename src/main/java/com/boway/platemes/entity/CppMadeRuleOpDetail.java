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
@Table ( name ="CPP_MADE_RULE_OP_DETAIL" , schema = "")
public class CppMadeRuleOpDetail  implements Serializable {

	private static final long serialVersionUID =  449919153303873540L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

	/**
	 * 创建者
	 */
   	@Column(name = "CREATOR" )
	private String creator;

	/**
	 * 修改者
	 */
   	@Column(name = "MODIFIER" )
	private String modifier;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

	/**
	 * 修改时间
	 */
   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

	/**
	 * 标志位
	 */
   	@Column(name = "FLAG" )
	private String flag;

	/**
	 * 删除标志位
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 工序流程GUID
	 */
   	@Column(name = "PROCESS_GUID" )
	private String processGuid;

	/**
	 * 工序顺序
	 */
   	@Column(name = "OP_SEQ" )
	private String opSeq;

	/**
	 * 工序GUID
	 */
   	@Column(name = "OP_GUID" )
	private String opGuid;

   	@Column(name = "CHANGE_STATE" )
	private String changeState;

   	@Column(name = "CHANGE_ADD_PROPERTY" )
	private String changeAddProperty;

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

	public String getProcessGuid() {
		return this.processGuid;
	}

	public void setProcessGuid(String processGuid) {
		this.processGuid = processGuid;
	}

	public String getOpSeq() {
		return this.opSeq;
	}

	public void setOpSeq(String opSeq) {
		this.opSeq = opSeq;
	}

	public String getOpGuid() {
		return this.opGuid;
	}

	public void setOpGuid(String opGuid) {
		this.opGuid = opGuid;
	}

	public String getChangeState() {
		return this.changeState;
	}

	public void setChangeState(String changeState) {
		this.changeState = changeState;
	}

	public String getChangeAddProperty() {
		return this.changeAddProperty;
	}

	public void setChangeAddProperty(String changeAddProperty) {
		this.changeAddProperty = changeAddProperty;
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
					"processGuid='" + processGuid + '\'' +
					"opSeq='" + opSeq + '\'' +
					"opGuid='" + opGuid + '\'' +
					"changeState='" + changeState + '\'' +
					"changeAddProperty='" + changeAddProperty + '\'' +
				'}';
	}

}
