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
 * @Author  wenjiejiang
 * @Date 2020-11-24 14:17:11 
 */

@Entity
@Table ( name ="SSD_TABLE_STRUCTURE_SYS" , schema = "")
public class SsdTableStructureSys  implements Serializable {

	private static final long serialVersionUID =  2080858326551856638L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 表名称
	 */
   	@Column(name = "TABLE_NAME" )
	private String tableName;

	/**
	 * 栏位代号
	 */
   	@Column(name = "FIELD" )
	private String field;

	/**
	 * 栏位名称
	 */
   	@Column(name = "NAME" )
	private String name;

	/**
	 * 栏位类型
	 */
   	@Column(name = "FIELD_TYPE" )
	private String fieldType;

	/**
	 * 允许为null
	 */
   	@Column(name = "EMPTY" )
	private String empty;

	/**
	 * key值
	 */
   	@Column(name = "IS_KEY" )
	private String isKey;

	/**
	 * 索引
	 */
   	@Column(name = "IS_INDEX" )
	private String isIndex;

	/**
	 * 默认值
	 */
   	@Column(name = "DEFULT" )
	private String defult;

	/**
	 * 版本
	 */
   	@Column(name = "VERSION" )
	private String version;

	/**
	 * 备注
	 */
   	@Column(name = "DESCRIPTION" )
	private String description;

	/**
	 * 外键
	 */
   	@Column(name = "TABLE_LINK" )
	private String tableLink;

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

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getEmpty() {
		return this.empty;
	}

	public void setEmpty(String empty) {
		this.empty = empty;
	}

	public String getIsKey() {
		return this.isKey;
	}

	public void setIsKey(String isKey) {
		this.isKey = isKey;
	}

	public String getIsIndex() {
		return this.isIndex;
	}

	public void setIsIndex(String isIndex) {
		this.isIndex = isIndex;
	}

	public String getDefult() {
		return this.defult;
	}

	public void setDefult(String defult) {
		this.defult = defult;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTableLink() {
		return this.tableLink;
	}

	public void setTableLink(String tableLink) {
		this.tableLink = tableLink;
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
					"tableName='" + tableName + '\'' +
					"field='" + field + '\'' +
					"name='" + name + '\'' +
					"fieldType='" + fieldType + '\'' +
					"empty='" + empty + '\'' +
					"isKey='" + isKey + '\'' +
					"isIndex='" + isIndex + '\'' +
					"defult='" + defult + '\'' +
					"version='" + version + '\'' +
					"description='" + description + '\'' +
					"tableLink='" + tableLink + '\'' +
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
