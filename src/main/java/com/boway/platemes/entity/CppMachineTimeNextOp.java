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
@Table ( name ="CPP_MACHINE_TIME_NEXT_OP" , schema = "")
public class CppMachineTimeNextOp  implements Serializable {

	private static final long serialVersionUID =  2562090799523859157L;

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

   	@Column(name = "OP_GUID_A" )
	private String opGuidA;

   	@Column(name = "OP_GUID_B" )
	private String opGuidB;

   	@Column(name = "EQP_GUID" )
	private String eqpGuid;

   	@Column(name = "TYPE" )
	private String type;

   	@Column(name = "MACHINE_TIME" )
	private String machineTime;

   	@Column(name = "DESCRIPTION" )
	private String description;

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

	public String getOpGuidA() {
		return this.opGuidA;
	}

	public void setOpGuidA(String opGuidA) {
		this.opGuidA = opGuidA;
	}

	public String getOpGuidB() {
		return this.opGuidB;
	}

	public void setOpGuidB(String opGuidB) {
		this.opGuidB = opGuidB;
	}

	public String getEqpGuid() {
		return this.eqpGuid;
	}

	public void setEqpGuid(String eqpGuid) {
		this.eqpGuid = eqpGuid;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMachineTime() {
		return this.machineTime;
	}

	public void setMachineTime(String machineTime) {
		this.machineTime = machineTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
					"opGuidA='" + opGuidA + '\'' +
					"opGuidB='" + opGuidB + '\'' +
					"eqpGuid='" + eqpGuid + '\'' +
					"type='" + type + '\'' +
					"machineTime='" + machineTime + '\'' +
					"description='" + description + '\'' +
				'}';
	}

}
