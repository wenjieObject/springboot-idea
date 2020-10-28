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
@Table ( name ="CPP_ORDER_REFORM" , schema = "")
public class CppOrderReform  implements Serializable {

	private static final long serialVersionUID =  3634882154840444456L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 创建者
	 */
   	@Column(name = "CREATOR" )
	private String creator;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

	/**
	 * 修改者
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
	 * 删除标志位
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

	/**
	 * 物料号
	 */
   	@Column(name = "ITEM_GUID" )
	private String itemGuid;

	/**
	 * 批号
	 */
   	@Column(name = "LOT_NO" )
	private String lotNo;

	/**
	 * 类型
	 */
   	@Column(name = "REFORM_TYPE" )
	private String reformType;

	/**
	 * 询单号
	 */
   	@Column(name = "ORDER_GUID" )
	private String orderGuid;

	/**
	 * 项目行
	 */
   	@Column(name = "ORDER_D_GUID" )
	private String orderDGuid;

	/**
	 * 产线
	 */
   	@Column(name = "PROCESS_DETAIL_GUID" )
	private String processDetailGuid;

	/**
	 * 生效码
	 */
   	@Column(name = "EFFECTIVE" )
	private String effective;

	/**
	 * 原询单号
	 */
   	@Column(name = "SOURCE_ORDER_GUID" )
	private String sourceOrderGuid;

	/**
	 * 原项目行
	 */
   	@Column(name = "SOURCE_ORDER_D_GUID" )
	private String sourceOrderDGuid;

	/**
	 * 来源单据
	 */
   	@Column(name = "SOURCE_GUID" )
	private String sourceGuid;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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

	public String getItemGuid() {
		return this.itemGuid;
	}

	public void setItemGuid(String itemGuid) {
		this.itemGuid = itemGuid;
	}

	public String getLotNo() {
		return this.lotNo;
	}

	public void setLotNo(String lotNo) {
		this.lotNo = lotNo;
	}

	public String getReformType() {
		return this.reformType;
	}

	public void setReformType(String reformType) {
		this.reformType = reformType;
	}

	public String getOrderGuid() {
		return this.orderGuid;
	}

	public void setOrderGuid(String orderGuid) {
		this.orderGuid = orderGuid;
	}

	public String getOrderDGuid() {
		return this.orderDGuid;
	}

	public void setOrderDGuid(String orderDGuid) {
		this.orderDGuid = orderDGuid;
	}

	public String getProcessDetailGuid() {
		return this.processDetailGuid;
	}

	public void setProcessDetailGuid(String processDetailGuid) {
		this.processDetailGuid = processDetailGuid;
	}

	public String getEffective() {
		return this.effective;
	}

	public void setEffective(String effective) {
		this.effective = effective;
	}

	public String getSourceOrderGuid() {
		return this.sourceOrderGuid;
	}

	public void setSourceOrderGuid(String sourceOrderGuid) {
		this.sourceOrderGuid = sourceOrderGuid;
	}

	public String getSourceOrderDGuid() {
		return this.sourceOrderDGuid;
	}

	public void setSourceOrderDGuid(String sourceOrderDGuid) {
		this.sourceOrderDGuid = sourceOrderDGuid;
	}

	public String getSourceGuid() {
		return this.sourceGuid;
	}

	public void setSourceGuid(String sourceGuid) {
		this.sourceGuid = sourceGuid;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
					"itemGuid='" + itemGuid + '\'' +
					"lotNo='" + lotNo + '\'' +
					"reformType='" + reformType + '\'' +
					"orderGuid='" + orderGuid + '\'' +
					"orderDGuid='" + orderDGuid + '\'' +
					"processDetailGuid='" + processDetailGuid + '\'' +
					"effective='" + effective + '\'' +
					"sourceOrderGuid='" + sourceOrderGuid + '\'' +
					"sourceOrderDGuid='" + sourceOrderDGuid + '\'' +
					"sourceGuid='" + sourceGuid + '\'' +
				'}';
	}

}
