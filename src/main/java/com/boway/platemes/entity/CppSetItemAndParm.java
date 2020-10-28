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
@Table ( name ="CPP_SET_ITEM_AND_PARM" , schema = "")
public class CppSetItemAndParm  implements Serializable {

	private static final long serialVersionUID =  4629708179968871770L;

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
	 * 项目分类主键
	 */
   	@Column(name = "ITEM_BAS_GUID" )
	private String itemBasGuid;

	/**
	 * 项目参数主键
	 */
   	@Column(name = "ITEM_PARM_GUID" )
	private String itemParmGuid;

	/**
	 * 必须输入
	 */
   	@Column(name = "ITEM_PARM_EMPTY" )
	private String itemParmEmpty;

	/**
	 * 显示顺序
	 */
   	@Column(name = "ITEM_SEQ" )
	private String itemSeq;

	/**
	 * 订单栏位显示
	 */
   	@Column(name = "ORDER_FIELD_NO" )
	private String orderFieldNo;

	/**
	 * 订单栏位显示
	 */
   	@Column(name = "ORDER_FIELD_NAME" )
	private String orderFieldName;

	/**
	 * 检验项目guid
	 */
   	@Column(name = "INSPECTION_ITEM_GUID" )
	private String inspectionItemGuid;

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

	public String getItemBasGuid() {
		return this.itemBasGuid;
	}

	public void setItemBasGuid(String itemBasGuid) {
		this.itemBasGuid = itemBasGuid;
	}

	public String getItemParmGuid() {
		return this.itemParmGuid;
	}

	public void setItemParmGuid(String itemParmGuid) {
		this.itemParmGuid = itemParmGuid;
	}

	public String getItemParmEmpty() {
		return this.itemParmEmpty;
	}

	public void setItemParmEmpty(String itemParmEmpty) {
		this.itemParmEmpty = itemParmEmpty;
	}

	public String getItemSeq() {
		return this.itemSeq;
	}

	public void setItemSeq(String itemSeq) {
		this.itemSeq = itemSeq;
	}

	public String getOrderFieldNo() {
		return this.orderFieldNo;
	}

	public void setOrderFieldNo(String orderFieldNo) {
		this.orderFieldNo = orderFieldNo;
	}

	public String getOrderFieldName() {
		return this.orderFieldName;
	}

	public void setOrderFieldName(String orderFieldName) {
		this.orderFieldName = orderFieldName;
	}

	public String getInspectionItemGuid() {
		return this.inspectionItemGuid;
	}

	public void setInspectionItemGuid(String inspectionItemGuid) {
		this.inspectionItemGuid = inspectionItemGuid;
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
					"itemBasGuid='" + itemBasGuid + '\'' +
					"itemParmGuid='" + itemParmGuid + '\'' +
					"itemParmEmpty='" + itemParmEmpty + '\'' +
					"itemSeq='" + itemSeq + '\'' +
					"orderFieldNo='" + orderFieldNo + '\'' +
					"orderFieldName='" + orderFieldName + '\'' +
					"inspectionItemGuid='" + inspectionItemGuid + '\'' +
				'}';
	}

}
