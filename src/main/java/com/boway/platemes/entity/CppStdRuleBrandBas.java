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
@Table ( name ="CPP_STD_RULE_BRAND_BAS" , schema = "")
public class CppStdRuleBrandBas  implements Serializable {

	private static final long serialVersionUID =  5742083682762192326L;

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
	 * 标准牌号编号
	 */
   	@Column(name = "STD_BRAND_NO" )
	private String stdBrandNo;

	/**
	 * 标准guid
	 */
   	@Column(name = "STD_RULE_GUID" )
	private String stdRuleGuid;

	/**
	 * 牌号guid
	 */
   	@Column(name = "BRAND_GUID" )
	private String brandGuid;

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

	public String getStdBrandNo() {
		return this.stdBrandNo;
	}

	public void setStdBrandNo(String stdBrandNo) {
		this.stdBrandNo = stdBrandNo;
	}

	public String getStdRuleGuid() {
		return this.stdRuleGuid;
	}

	public void setStdRuleGuid(String stdRuleGuid) {
		this.stdRuleGuid = stdRuleGuid;
	}

	public String getBrandGuid() {
		return this.brandGuid;
	}

	public void setBrandGuid(String brandGuid) {
		this.brandGuid = brandGuid;
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
					"stdBrandNo='" + stdBrandNo + '\'' +
					"stdRuleGuid='" + stdRuleGuid + '\'' +
					"brandGuid='" + brandGuid + '\'' +
				'}';
	}

}
