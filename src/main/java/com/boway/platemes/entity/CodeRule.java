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
@Table ( name ="CODE_RULE" , schema = "")
public class CodeRule  implements Serializable {

	private static final long serialVersionUID =  3835052120901503267L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 规则编号
	 */
   	@Column(name = "CODE_RULE_NO" )
	private String codeRuleNo;

	/**
	 * 编码类型
	 */
   	@Column(name = "CODE_TYPE" )
	private String codeType;

	/**
	 * 条码类型
	 */
   	@Column(name = "BAR_TYPE" )
	private String barType;

	/**
	 * 要素说明
	 */
   	@Column(name = "FACTOR_DESC" )
	private String factorDesc;

	/**
	 * 备注
	 */
   	@Column(name = "DESCRIPTION" )
	private String description;

	/**
	 * 编码总段数
	 */
   	@Column(name = "CODE_TOTAL" )
	private String codeTotal;

	/**
	 * 默认
	 */
   	@Column(name = "IS_DEFAULT" )
	private String isDefault;

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

	public String getCodeRuleNo() {
		return this.codeRuleNo;
	}

	public void setCodeRuleNo(String codeRuleNo) {
		this.codeRuleNo = codeRuleNo;
	}

	public String getCodeType() {
		return this.codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getBarType() {
		return this.barType;
	}

	public void setBarType(String barType) {
		this.barType = barType;
	}

	public String getFactorDesc() {
		return this.factorDesc;
	}

	public void setFactorDesc(String factorDesc) {
		this.factorDesc = factorDesc;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCodeTotal() {
		return this.codeTotal;
	}

	public void setCodeTotal(String codeTotal) {
		this.codeTotal = codeTotal;
	}

	public String getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
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
					"codeRuleNo='" + codeRuleNo + '\'' +
					"codeType='" + codeType + '\'' +
					"barType='" + barType + '\'' +
					"factorDesc='" + factorDesc + '\'' +
					"description='" + description + '\'' +
					"codeTotal='" + codeTotal + '\'' +
					"isDefault='" + isDefault + '\'' +
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
