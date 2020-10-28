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
@Table ( name ="CPP_ORDER_BOM" , schema = "")
public class CppOrderBom  implements Serializable {

	private static final long serialVersionUID =  7214596802931500522L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "PRD_MAIN_GUID" )
	private String prdMainGuid;

   	@Column(name = "PRD_MAIN_UNIT_GUID" )
	private String prdMainUnitGuid;

   	@Column(name = "PRD_MAIN_BATCH_QTY" )
	private String prdMainBatchQty;

   	@Column(name = "SEQ" )
	private String seq;

   	@Column(name = "PRD_PART_GUID" )
	private String prdPartGuid;

   	@Column(name = "PRD_CHANGE_RATE" )
	private String prdChangeRate;

   	@Column(name = "PRD_PART_QTY" )
	private String prdPartQty;

   	@Column(name = "PRD_PART_UNIT_GUID" )
	private String prdPartUnitGuid;

   	@Column(name = "PRD_PART_BATCH_QTY" )
	private String prdPartBatchQty;

   	@Column(name = "ORDER_DETAIL_GUID" )
	private String orderDetailGuid;

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

	/**
	 * 损耗率
	 */
   	@Column(name = "PRD_LOSS_RATE" )
	private String prdLossRate;

   	@Column(name = "BOM_VER" )
	private String bomVer;

   	@Column(name = "OP_DETAIL_GUID" )
	private String opDetailGuid;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getPrdMainGuid() {
		return this.prdMainGuid;
	}

	public void setPrdMainGuid(String prdMainGuid) {
		this.prdMainGuid = prdMainGuid;
	}

	public String getPrdMainUnitGuid() {
		return this.prdMainUnitGuid;
	}

	public void setPrdMainUnitGuid(String prdMainUnitGuid) {
		this.prdMainUnitGuid = prdMainUnitGuid;
	}

	public String getPrdMainBatchQty() {
		return this.prdMainBatchQty;
	}

	public void setPrdMainBatchQty(String prdMainBatchQty) {
		this.prdMainBatchQty = prdMainBatchQty;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getPrdPartGuid() {
		return this.prdPartGuid;
	}

	public void setPrdPartGuid(String prdPartGuid) {
		this.prdPartGuid = prdPartGuid;
	}

	public String getPrdChangeRate() {
		return this.prdChangeRate;
	}

	public void setPrdChangeRate(String prdChangeRate) {
		this.prdChangeRate = prdChangeRate;
	}

	public String getPrdPartQty() {
		return this.prdPartQty;
	}

	public void setPrdPartQty(String prdPartQty) {
		this.prdPartQty = prdPartQty;
	}

	public String getPrdPartUnitGuid() {
		return this.prdPartUnitGuid;
	}

	public void setPrdPartUnitGuid(String prdPartUnitGuid) {
		this.prdPartUnitGuid = prdPartUnitGuid;
	}

	public String getPrdPartBatchQty() {
		return this.prdPartBatchQty;
	}

	public void setPrdPartBatchQty(String prdPartBatchQty) {
		this.prdPartBatchQty = prdPartBatchQty;
	}

	public String getOrderDetailGuid() {
		return this.orderDetailGuid;
	}

	public void setOrderDetailGuid(String orderDetailGuid) {
		this.orderDetailGuid = orderDetailGuid;
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

	public String getPrdLossRate() {
		return this.prdLossRate;
	}

	public void setPrdLossRate(String prdLossRate) {
		this.prdLossRate = prdLossRate;
	}

	public String getBomVer() {
		return this.bomVer;
	}

	public void setBomVer(String bomVer) {
		this.bomVer = bomVer;
	}

	public String getOpDetailGuid() {
		return this.opDetailGuid;
	}

	public void setOpDetailGuid(String opDetailGuid) {
		this.opDetailGuid = opDetailGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"prdMainGuid='" + prdMainGuid + '\'' +
					"prdMainUnitGuid='" + prdMainUnitGuid + '\'' +
					"prdMainBatchQty='" + prdMainBatchQty + '\'' +
					"seq='" + seq + '\'' +
					"prdPartGuid='" + prdPartGuid + '\'' +
					"prdChangeRate='" + prdChangeRate + '\'' +
					"prdPartQty='" + prdPartQty + '\'' +
					"prdPartUnitGuid='" + prdPartUnitGuid + '\'' +
					"prdPartBatchQty='" + prdPartBatchQty + '\'' +
					"orderDetailGuid='" + orderDetailGuid + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"prdLossRate='" + prdLossRate + '\'' +
					"bomVer='" + bomVer + '\'' +
					"opDetailGuid='" + opDetailGuid + '\'' +
				'}';
	}

}
