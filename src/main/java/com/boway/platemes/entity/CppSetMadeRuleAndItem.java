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
 * @Date 2020-10-28 10:47:10 
 */

@Entity
@Table ( name ="CPP_SET_MADE_RULE_AND_ITEM" , schema = "")
public class CppSetMadeRuleAndItem  implements Serializable {

	private static final long serialVersionUID =  6188425330767469065L;

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

   	@Column(name = "GROUP_NO" )
	private String groupNo;

   	@Column(name = "OP_GUID" )
	private String opGuid;

   	@Column(name = "ITEM_CATEGORY_GUID" )
	private String itemCategoryGuid;

   	@Column(name = "ITEM_EMPTY" )
	private String itemEmpty;

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

	public String getGroupNo() {
		return this.groupNo;
	}

	public void setGroupNo(String groupNo) {
		this.groupNo = groupNo;
	}

	public String getOpGuid() {
		return this.opGuid;
	}

	public void setOpGuid(String opGuid) {
		this.opGuid = opGuid;
	}

	public String getItemCategoryGuid() {
		return this.itemCategoryGuid;
	}

	public void setItemCategoryGuid(String itemCategoryGuid) {
		this.itemCategoryGuid = itemCategoryGuid;
	}

	public String getItemEmpty() {
		return this.itemEmpty;
	}

	public void setItemEmpty(String itemEmpty) {
		this.itemEmpty = itemEmpty;
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
					"groupNo='" + groupNo + '\'' +
					"opGuid='" + opGuid + '\'' +
					"itemCategoryGuid='" + itemCategoryGuid + '\'' +
					"itemEmpty='" + itemEmpty + '\'' +
				'}';
	}

}
