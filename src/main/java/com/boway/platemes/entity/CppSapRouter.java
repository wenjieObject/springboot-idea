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
@Table ( name ="CPP_SAP_ROUTER" , schema = "")
public class CppSapRouter  implements Serializable {

	private static final long serialVersionUID =  5700545812185627876L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "ITEM_NO" )
	private String itemNo;

   	@Column(name = "WORK_CENTER" )
	private String workCenter;

   	@Column(name = "GROUP_SEQ" )
	private String groupSeq;

   	@Column(name = "OP_NAME" )
	private String opName;

   	@Column(name = "PUBLIC_TIME" )
	private String publicTime;

   	@Column(name = "LABOR_TIME" )
	private String laborTime;

   	@Column(name = "DEPRECIATION_TIME" )
	private String depreciationTime;

   	@Column(name = "ELECTRICITY_QTY" )
	private String electricityQty;

   	@Column(name = "GAS_QTY" )
	private String gasQty;

   	@Column(name = "ACCESSORIES_QTY" )
	private String accessoriesQty;

   	@Column(name = "OTHER_QTY" )
	private String otherQty;

   	@Column(name = "SAP_LABOR_TIME" )
	private String sapLaborTime;

   	@Column(name = "SAP_DEPRECIATION_TIME" )
	private String sapDepreciationTime;

   	@Column(name = "SAP_ELECTRICITY_QTY" )
	private String sapElectricityQty;

   	@Column(name = "SAP_GAS_QTY" )
	private String sapGasQty;

   	@Column(name = "SAP_ACCESSORIES_QTY" )
	private String sapAccessoriesQty;

   	@Column(name = "SAP_OTHER_QTY" )
	private String sapOtherQty;

   	@Column(name = "RESERVE1" )
	private String reserve1;

   	@Column(name = "RESERVE2" )
	private String reserve2;

   	@Column(name = "RESERVE3" )
	private String reserve3;

   	@Column(name = "RESERVE4" )
	private String reserve4;

   	@Column(name = "RESERVE5" )
	private String reserve5;

   	@Column(name = "RESERVE6" )
	private String reserve6;

   	@Column(name = "RESERVE7" )
	private String reserve7;

   	@Column(name = "RECORD_TIME" )
	private String recordTime;

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

	public String getItemNo() {
		return this.itemNo;
	}

	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getWorkCenter() {
		return this.workCenter;
	}

	public void setWorkCenter(String workCenter) {
		this.workCenter = workCenter;
	}

	public String getGroupSeq() {
		return this.groupSeq;
	}

	public void setGroupSeq(String groupSeq) {
		this.groupSeq = groupSeq;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getPublicTime() {
		return this.publicTime;
	}

	public void setPublicTime(String publicTime) {
		this.publicTime = publicTime;
	}

	public String getLaborTime() {
		return this.laborTime;
	}

	public void setLaborTime(String laborTime) {
		this.laborTime = laborTime;
	}

	public String getDepreciationTime() {
		return this.depreciationTime;
	}

	public void setDepreciationTime(String depreciationTime) {
		this.depreciationTime = depreciationTime;
	}

	public String getElectricityQty() {
		return this.electricityQty;
	}

	public void setElectricityQty(String electricityQty) {
		this.electricityQty = electricityQty;
	}

	public String getGasQty() {
		return this.gasQty;
	}

	public void setGasQty(String gasQty) {
		this.gasQty = gasQty;
	}

	public String getAccessoriesQty() {
		return this.accessoriesQty;
	}

	public void setAccessoriesQty(String accessoriesQty) {
		this.accessoriesQty = accessoriesQty;
	}

	public String getOtherQty() {
		return this.otherQty;
	}

	public void setOtherQty(String otherQty) {
		this.otherQty = otherQty;
	}

	public String getSapLaborTime() {
		return this.sapLaborTime;
	}

	public void setSapLaborTime(String sapLaborTime) {
		this.sapLaborTime = sapLaborTime;
	}

	public String getSapDepreciationTime() {
		return this.sapDepreciationTime;
	}

	public void setSapDepreciationTime(String sapDepreciationTime) {
		this.sapDepreciationTime = sapDepreciationTime;
	}

	public String getSapElectricityQty() {
		return this.sapElectricityQty;
	}

	public void setSapElectricityQty(String sapElectricityQty) {
		this.sapElectricityQty = sapElectricityQty;
	}

	public String getSapGasQty() {
		return this.sapGasQty;
	}

	public void setSapGasQty(String sapGasQty) {
		this.sapGasQty = sapGasQty;
	}

	public String getSapAccessoriesQty() {
		return this.sapAccessoriesQty;
	}

	public void setSapAccessoriesQty(String sapAccessoriesQty) {
		this.sapAccessoriesQty = sapAccessoriesQty;
	}

	public String getSapOtherQty() {
		return this.sapOtherQty;
	}

	public void setSapOtherQty(String sapOtherQty) {
		this.sapOtherQty = sapOtherQty;
	}

	public String getReserve1() {
		return this.reserve1;
	}

	public void setReserve1(String reserve1) {
		this.reserve1 = reserve1;
	}

	public String getReserve2() {
		return this.reserve2;
	}

	public void setReserve2(String reserve2) {
		this.reserve2 = reserve2;
	}

	public String getReserve3() {
		return this.reserve3;
	}

	public void setReserve3(String reserve3) {
		this.reserve3 = reserve3;
	}

	public String getReserve4() {
		return this.reserve4;
	}

	public void setReserve4(String reserve4) {
		this.reserve4 = reserve4;
	}

	public String getReserve5() {
		return this.reserve5;
	}

	public void setReserve5(String reserve5) {
		this.reserve5 = reserve5;
	}

	public String getReserve6() {
		return this.reserve6;
	}

	public void setReserve6(String reserve6) {
		this.reserve6 = reserve6;
	}

	public String getReserve7() {
		return this.reserve7;
	}

	public void setReserve7(String reserve7) {
		this.reserve7 = reserve7;
	}

	public String getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
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
					"itemNo='" + itemNo + '\'' +
					"workCenter='" + workCenter + '\'' +
					"groupSeq='" + groupSeq + '\'' +
					"opName='" + opName + '\'' +
					"publicTime='" + publicTime + '\'' +
					"laborTime='" + laborTime + '\'' +
					"depreciationTime='" + depreciationTime + '\'' +
					"electricityQty='" + electricityQty + '\'' +
					"gasQty='" + gasQty + '\'' +
					"accessoriesQty='" + accessoriesQty + '\'' +
					"otherQty='" + otherQty + '\'' +
					"sapLaborTime='" + sapLaborTime + '\'' +
					"sapDepreciationTime='" + sapDepreciationTime + '\'' +
					"sapElectricityQty='" + sapElectricityQty + '\'' +
					"sapGasQty='" + sapGasQty + '\'' +
					"sapAccessoriesQty='" + sapAccessoriesQty + '\'' +
					"sapOtherQty='" + sapOtherQty + '\'' +
					"reserve1='" + reserve1 + '\'' +
					"reserve2='" + reserve2 + '\'' +
					"reserve3='" + reserve3 + '\'' +
					"reserve4='" + reserve4 + '\'' +
					"reserve5='" + reserve5 + '\'' +
					"reserve6='" + reserve6 + '\'' +
					"reserve7='" + reserve7 + '\'' +
					"recordTime='" + recordTime + '\'' +
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
