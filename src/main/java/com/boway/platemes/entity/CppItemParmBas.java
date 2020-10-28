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
@Table ( name ="CPP_ITEM_PARM_BAS" , schema = "")
public class CppItemParmBas  implements Serializable {

	private static final long serialVersionUID =  2834109417521716635L;

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

   	@Column(name = "ITEM_PARM_NO" )
	private String itemParmNo;

   	@Column(name = "ITEM_PARM_NAME" )
	private String itemParmName;

   	@Column(name = "ITEM_PARM_TYPE" )
	private String itemParmType;

   	@Column(name = "ITEM_PARM_SOURCE" )
	private String itemParmSource;

   	@Column(name = "ORDER_SEQ" )
	private String orderSeq;

	/**
	 * 参数标识
	 */
   	@Column(name = "ITEM_PARM_LABEL" )
	private String itemParmLabel;

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

	public String getItemParmNo() {
		return this.itemParmNo;
	}

	public void setItemParmNo(String itemParmNo) {
		this.itemParmNo = itemParmNo;
	}

	public String getItemParmName() {
		return this.itemParmName;
	}

	public void setItemParmName(String itemParmName) {
		this.itemParmName = itemParmName;
	}

	public String getItemParmType() {
		return this.itemParmType;
	}

	public void setItemParmType(String itemParmType) {
		this.itemParmType = itemParmType;
	}

	public String getItemParmSource() {
		return this.itemParmSource;
	}

	public void setItemParmSource(String itemParmSource) {
		this.itemParmSource = itemParmSource;
	}

	public String getOrderSeq() {
		return this.orderSeq;
	}

	public void setOrderSeq(String orderSeq) {
		this.orderSeq = orderSeq;
	}

	public String getItemParmLabel() {
		return this.itemParmLabel;
	}

	public void setItemParmLabel(String itemParmLabel) {
		this.itemParmLabel = itemParmLabel;
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
					"itemParmNo='" + itemParmNo + '\'' +
					"itemParmName='" + itemParmName + '\'' +
					"itemParmType='" + itemParmType + '\'' +
					"itemParmSource='" + itemParmSource + '\'' +
					"orderSeq='" + orderSeq + '\'' +
					"itemParmLabel='" + itemParmLabel + '\'' +
				'}';
	}

}
