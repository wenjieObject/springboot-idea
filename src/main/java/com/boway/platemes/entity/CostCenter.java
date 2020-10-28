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
@Table ( name ="COST_CENTER" , schema = "")
public class CostCenter  implements Serializable {

	private static final long serialVersionUID =  4813260787469392614L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "COST_CENTER_NO" )
	private String costCenterNo;

   	@Column(name = "COST_CENTER_NAME" )
	private String costCenterName;

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

	public String getCostCenterNo() {
		return this.costCenterNo;
	}

	public void setCostCenterNo(String costCenterNo) {
		this.costCenterNo = costCenterNo;
	}

	public String getCostCenterName() {
		return this.costCenterName;
	}

	public void setCostCenterName(String costCenterName) {
		this.costCenterName = costCenterName;
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
					"costCenterNo='" + costCenterNo + '\'' +
					"costCenterName='" + costCenterName + '\'' +
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
