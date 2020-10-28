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
@Table ( name ="CODE_RULE_DETAIL" , schema = "")
public class CodeRuleDetail  implements Serializable {

	private static final long serialVersionUID =  7910557203488413771L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 规则编号
	 */
   	@Column(name = "FROM_GUID" )
	private String fromGuid;

	/**
	 * 段次号
	 */
   	@Column(name = "PART_NO" )
	private String partNo;

	/**
	 * 编码要素
	 */
   	@Column(name = "CODE_FACTOR_GUID" )
	private String codeFactorGuid;

	/**
	 * 栏位长度
	 */
   	@Column(name = "FIELD_LEN" )
	private String fieldLen;

	/**
	 * 栏位值
	 */
   	@Column(name = "FIELD_VALUE" )
	private String fieldValue;

	/**
	 * 备注
	 */
   	@Column(name = "DESCRIPTION" )
	private String description;

	/**
	 * 起始位
	 */
   	@Column(name = "CODE_START" )
	private String codeStart;

	/**
	 * 截止位
	 */
   	@Column(name = "CODE_END" )
	private String codeEnd;

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

	/**
	 * 删除标志位
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

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

	public String getPartNo() {
		return this.partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getCodeFactorGuid() {
		return this.codeFactorGuid;
	}

	public void setCodeFactorGuid(String codeFactorGuid) {
		this.codeFactorGuid = codeFactorGuid;
	}

	public String getFieldLen() {
		return this.fieldLen;
	}

	public void setFieldLen(String fieldLen) {
		this.fieldLen = fieldLen;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCodeStart() {
		return this.codeStart;
	}

	public void setCodeStart(String codeStart) {
		this.codeStart = codeStart;
	}

	public String getCodeEnd() {
		return this.codeEnd;
	}

	public void setCodeEnd(String codeEnd) {
		this.codeEnd = codeEnd;
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
					"fromGuid='" + fromGuid + '\'' +
					"partNo='" + partNo + '\'' +
					"codeFactorGuid='" + codeFactorGuid + '\'' +
					"fieldLen='" + fieldLen + '\'' +
					"fieldValue='" + fieldValue + '\'' +
					"description='" + description + '\'' +
					"codeStart='" + codeStart + '\'' +
					"codeEnd='" + codeEnd + '\'' +
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
