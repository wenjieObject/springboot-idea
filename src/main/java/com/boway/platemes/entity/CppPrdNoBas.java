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
@Table ( name ="CPP_PRD_NO_BAS" , schema = "")
public class CppPrdNoBas  implements Serializable {

	private static final long serialVersionUID =  4327624448024865325L;

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
	 * 产品规范码
	 */
   	@Column(name = "PRD_NO" )
	private String prdNo;

	/**
	 * 产品名称
	 */
   	@Column(name = "PRD_NAME" )
	private String prdName;

	/**
	 * 产品大类GUID
	 */
   	@Column(name = "PRD_CATEGORY_GUID" )
	private String prdCategoryGuid;

	/**
	 * 品名GUID
	 */
   	@Column(name = "PRD_NAME_GUID" )
	private String prdNameGuid;

	/**
	 * 标准牌号GUID
	 */
   	@Column(name = "STD_BRAND_GUID" )
	private String stdBrandGuid;

	/**
	 * 状态GUID
	 */
   	@Column(name = "STATE_GUID" )
	private String stateGuid;

	/**
	 * 附加属性GUID
	 */
   	@Column(name = "ADD_PROPERTY_GUID" )
	private String addPropertyGuid;

	/**
	 * 流水号
	 */
   	@Column(name = "SEQ" )
	private String seq;

	/**
	 * 形状GUID
	 */
   	@Column(name = "SHARP_GUID" )
	private String sharpGuid;

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

	public String getPrdNo() {
		return this.prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return this.prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdCategoryGuid() {
		return this.prdCategoryGuid;
	}

	public void setPrdCategoryGuid(String prdCategoryGuid) {
		this.prdCategoryGuid = prdCategoryGuid;
	}

	public String getPrdNameGuid() {
		return this.prdNameGuid;
	}

	public void setPrdNameGuid(String prdNameGuid) {
		this.prdNameGuid = prdNameGuid;
	}

	public String getStdBrandGuid() {
		return this.stdBrandGuid;
	}

	public void setStdBrandGuid(String stdBrandGuid) {
		this.stdBrandGuid = stdBrandGuid;
	}

	public String getStateGuid() {
		return this.stateGuid;
	}

	public void setStateGuid(String stateGuid) {
		this.stateGuid = stateGuid;
	}

	public String getAddPropertyGuid() {
		return this.addPropertyGuid;
	}

	public void setAddPropertyGuid(String addPropertyGuid) {
		this.addPropertyGuid = addPropertyGuid;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getSharpGuid() {
		return this.sharpGuid;
	}

	public void setSharpGuid(String sharpGuid) {
		this.sharpGuid = sharpGuid;
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
					"prdNo='" + prdNo + '\'' +
					"prdName='" + prdName + '\'' +
					"prdCategoryGuid='" + prdCategoryGuid + '\'' +
					"prdNameGuid='" + prdNameGuid + '\'' +
					"stdBrandGuid='" + stdBrandGuid + '\'' +
					"stateGuid='" + stateGuid + '\'' +
					"addPropertyGuid='" + addPropertyGuid + '\'' +
					"seq='" + seq + '\'' +
					"sharpGuid='" + sharpGuid + '\'' +
				'}';
	}

}
