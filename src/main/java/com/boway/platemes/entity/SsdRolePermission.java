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
@Table ( name ="SSD_ROLE_PERMISSION" , schema = "")
public class SsdRolePermission  implements Serializable {

	private static final long serialVersionUID =  8490740350554638453L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 角色guid
	 */
   	@Column(name = "ROLE_GUID" )
	private String roleGuid;

	/**
	 * 权限guid
	 */
   	@Column(name = "PERMISSION_GUID" )
	private String permissionGuid;

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

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getRoleGuid() {
		return this.roleGuid;
	}

	public void setRoleGuid(String roleGuid) {
		this.roleGuid = roleGuid;
	}

	public String getPermissionGuid() {
		return this.permissionGuid;
	}

	public void setPermissionGuid(String permissionGuid) {
		this.permissionGuid = permissionGuid;
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

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"roleGuid='" + roleGuid + '\'' +
					"permissionGuid='" + permissionGuid + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
				'}';
	}

}
