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
@Table ( name ="CPP_FINAL_USER" , schema = "")
public class CppFinalUser  implements Serializable {

	private static final long serialVersionUID =  8487045438552281081L;

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
	 * 最终用户编号
	 */
   	@Column(name = "FINAL_USER_NO" )
	private String finalUserNo;

	/**
	 * FINAL_USER_NAME
	 */
   	@Column(name = "FINAL_USER_NAME" )
	private String finalUserName;

	/**
	 * 重要度
	 */
   	@Column(name = "FINAL_USER_LEVEL" )
	private String finalUserLevel;

	/**
	 * 启用状态
	 */
   	@Column(name = "STATE" )
	private String state;

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

	public String getFinalUserNo() {
		return this.finalUserNo;
	}

	public void setFinalUserNo(String finalUserNo) {
		this.finalUserNo = finalUserNo;
	}

	public String getFinalUserName() {
		return this.finalUserName;
	}

	public void setFinalUserName(String finalUserName) {
		this.finalUserName = finalUserName;
	}

	public String getFinalUserLevel() {
		return this.finalUserLevel;
	}

	public void setFinalUserLevel(String finalUserLevel) {
		this.finalUserLevel = finalUserLevel;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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
					"finalUserNo='" + finalUserNo + '\'' +
					"finalUserName='" + finalUserName + '\'' +
					"finalUserLevel='" + finalUserLevel + '\'' +
					"state='" + state + '\'' +
				'}';
	}

}
