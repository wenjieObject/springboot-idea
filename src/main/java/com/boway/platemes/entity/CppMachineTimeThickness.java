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
@Table ( name ="CPP_MACHINE_TIME_THICKNESS" , schema = "")
public class CppMachineTimeThickness  implements Serializable {

	private static final long serialVersionUID =  4177969533082926202L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

   	@Column(name = "OP_GUID" )
	private String opGuid;

   	@Column(name = "EQP_GUID" )
	private String eqpGuid;

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

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
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

	public String getOpGuid() {
		return this.opGuid;
	}

	public void setOpGuid(String opGuid) {
		this.opGuid = opGuid;
	}

	public String getEqpGuid() {
		return this.eqpGuid;
	}

	public void setEqpGuid(String eqpGuid) {
		this.eqpGuid = eqpGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"factory='" + factory + '\'' +
					"modifier='" + modifier + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"opGuid='" + opGuid + '\'' +
					"eqpGuid='" + eqpGuid + '\'' +
				'}';
	}

}
