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
@Table ( name ="CPP_BOM" , schema = "")
public class CppBom  implements Serializable {

	private static final long serialVersionUID =  3088041005453498226L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 主件
	 */
   	@Column(name = "PRD_MAIN_GUID" )
	private String prdMainGuid;

	/**
	 * 单位
	 */
   	@Column(name = "PRD_MAIN_UNIT_GUID" )
	private String prdMainUnitGuid;

	/**
	 * 批量
	 */
   	@Column(name = "PRD_MAIN_BATCH_QTY" )
	private String prdMainBatchQty;

	/**
	 * 序号
	 */
   	@Column(name = "SEQ" )
	private String seq;

	/**
	 * 元件
	 */
   	@Column(name = "PRD_PART_GUID" )
	private String prdPartGuid;

	/**
	 * 成材率%
	 */
   	@Column(name = "PRD_CHANGE_RATE" )
	private String prdChangeRate;

	/**
	 * 单位
	 */
   	@Column(name = "PRD_PART_UNIT_GUID" )
	private String prdPartUnitGuid;

	/**
	 * 组成用量
	 */
   	@Column(name = "PRD_PART_QTY" )
	private String prdPartQty;

	/**
	 * 底数
	 */
   	@Column(name = "PRD_PART_BATCH_QTY" )
	private String prdPartBatchQty;

	/**
	 * BOM版本号
	 */
   	@Column(name = "VER" )
	private String ver;

	/**
	 * 损耗率
	 */
   	@Column(name = "PRD_LOSS_RATE" )
	private String prdLossRate;

	/**
	 * 创建人
	 */
   	@Column(name = "CREATOR" )
	private String creator;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

	/**
	 * 修改人
	 */
   	@Column(name = "MODIFIER" )
	private String modifier;

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
	 * 是否有效
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "RECORD_TIME" )
	private String recordTime;

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

	public String getPrdPartUnitGuid() {
		return this.prdPartUnitGuid;
	}

	public void setPrdPartUnitGuid(String prdPartUnitGuid) {
		this.prdPartUnitGuid = prdPartUnitGuid;
	}

	public String getPrdPartQty() {
		return this.prdPartQty;
	}

	public void setPrdPartQty(String prdPartQty) {
		this.prdPartQty = prdPartQty;
	}

	public String getPrdPartBatchQty() {
		return this.prdPartBatchQty;
	}

	public void setPrdPartBatchQty(String prdPartBatchQty) {
		this.prdPartBatchQty = prdPartBatchQty;
	}

	public String getVer() {
		return this.ver;
	}

	public void setVer(String ver) {
		this.ver = ver;
	}

	public String getPrdLossRate() {
		return this.prdLossRate;
	}

	public void setPrdLossRate(String prdLossRate) {
		this.prdLossRate = prdLossRate;
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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getRecordTime() {
		return this.recordTime;
	}

	public void setRecordTime(String recordTime) {
		this.recordTime = recordTime;
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
					"prdPartUnitGuid='" + prdPartUnitGuid + '\'' +
					"prdPartQty='" + prdPartQty + '\'' +
					"prdPartBatchQty='" + prdPartBatchQty + '\'' +
					"ver='" + ver + '\'' +
					"prdLossRate='" + prdLossRate + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
					"recordTime='" + recordTime + '\'' +
				'}';
	}

}
