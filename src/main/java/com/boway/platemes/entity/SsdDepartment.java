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
@Table ( name ="SSD_DEPARTMENT" , schema = "")
public class SsdDepartment  implements Serializable {

	private static final long serialVersionUID =  267954971032746905L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 部门代号
	 */
   	@Column(name = "DEPARTMENT_CODE" )
	private String departmentCode;

	/**
	 * 部门名称
	 */
   	@Column(name = "DEPARTMENT_NAME" )
	private String departmentName;

	/**
	 * 创建人
	 */
   	@Column(name = "CREATOR" )
	private String creator;

	/**
	 * 创建时间
	 */
   	@Column(name = "CREATE_TIME" )
	private Date createTime;

	/**
	 * 修改人
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
	 * 是否有效
	 */
   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "HIGHER_DEPARTMENT" )
	private String higherDepartment;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getHigherDepartment() {
		return this.higherDepartment;
	}

	public void setHigherDepartment(String higherDepartment) {
		this.higherDepartment = higherDepartment;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"departmentCode='" + departmentCode + '\'' +
					"departmentName='" + departmentName + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
					"higherDepartment='" + higherDepartment + '\'' +
				'}';
	}

}
