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
@Table ( name ="CODE_FACTOR_DETAIL" , schema = "")
public class CodeFactorDetail  implements Serializable {

	private static final long serialVersionUID =  6472399446982042929L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 编码类别
	 */
   	@Column(name = "FROM_GUID" )
	private String fromGuid;

	/**
	 * 编码要素
	 */
   	@Column(name = "CODE_FACTOR_NO" )
	private String codeFactorNo;

	/**
	 * 说明
	 */
   	@Column(name = "CODE_FACTOR_NAME" )
	private String codeFactorName;

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

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

   	@Column(name = "ELEMENT_TYPE" )
	private String elementType;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getFromGuid() {
		return this.fromGuid;
	}

	public void setFromGuid(String fromGuid) {
		this.fromGuid = fromGuid;
	}

	public String getCodeFactorNo() {
		return this.codeFactorNo;
	}

	public void setCodeFactorNo(String codeFactorNo) {
		this.codeFactorNo = codeFactorNo;
	}

	public String getCodeFactorName() {
		return this.codeFactorName;
	}

	public void setCodeFactorName(String codeFactorName) {
		this.codeFactorName = codeFactorName;
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

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"fromGuid='" + fromGuid + '\'' +
					"codeFactorNo='" + codeFactorNo + '\'' +
					"codeFactorName='" + codeFactorName + '\'' +
					"factory='" + factory + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"elementType='" + elementType + '\'' +
				'}';
	}

}
