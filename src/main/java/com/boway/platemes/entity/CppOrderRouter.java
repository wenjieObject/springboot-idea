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
@Table ( name ="CPP_ORDER_ROUTER" , schema = "")
public class CppOrderRouter  implements Serializable {

	private static final long serialVersionUID =  3759408289840132909L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "ORDER_DETAIL_GUID" )
	private String orderDetailGuid;

   	@Column(name = "ITEM_GUID" )
	private String itemGuid;

   	@Column(name = "ROUTER_NO" )
	private String routerNo;

   	@Column(name = "OP_GUID" )
	private String opGuid;

   	@Column(name = "SEQ" )
	private String seq;

   	@Column(name = "OP_NO" )
	private String opNo;

   	@Column(name = "OP_NAME" )
	private String opName;

   	@Column(name = "SPEC1" )
	private String spec1;

   	@Column(name = "SPEC2" )
	private String spec2;

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

	public String getOrderDetailGuid() {
		return this.orderDetailGuid;
	}

	public void setOrderDetailGuid(String orderDetailGuid) {
		this.orderDetailGuid = orderDetailGuid;
	}

	public String getItemGuid() {
		return this.itemGuid;
	}

	public void setItemGuid(String itemGuid) {
		this.itemGuid = itemGuid;
	}

	public String getRouterNo() {
		return this.routerNo;
	}

	public void setRouterNo(String routerNo) {
		this.routerNo = routerNo;
	}

	public String getOpGuid() {
		return this.opGuid;
	}

	public void setOpGuid(String opGuid) {
		this.opGuid = opGuid;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getOpNo() {
		return this.opNo;
	}

	public void setOpNo(String opNo) {
		this.opNo = opNo;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getSpec1() {
		return this.spec1;
	}

	public void setSpec1(String spec1) {
		this.spec1 = spec1;
	}

	public String getSpec2() {
		return this.spec2;
	}

	public void setSpec2(String spec2) {
		this.spec2 = spec2;
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
					"orderDetailGuid='" + orderDetailGuid + '\'' +
					"itemGuid='" + itemGuid + '\'' +
					"routerNo='" + routerNo + '\'' +
					"opGuid='" + opGuid + '\'' +
					"seq='" + seq + '\'' +
					"opNo='" + opNo + '\'' +
					"opName='" + opName + '\'' +
					"spec1='" + spec1 + '\'' +
					"spec2='" + spec2 + '\'' +
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
