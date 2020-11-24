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
 * @Date 2020-11-24 14:15:36 
 */

@Entity
@Table ( name ="USER_BAS" , schema = "")
public class UserBas  implements Serializable {

	private static final long serialVersionUID =  8938988687528307628L;

	/**
	 * 主键
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

	/**
	 * 用户代号
	 */
   	@Column(name = "USER_NO" )
	private String userNo;

	/**
	 * 用户名
	 */
   	@Column(name = "USER_NAME" )
	private String userName;

	/**
	 * 密码
	 */
   	@Column(name = "PASSWORD" )
	private String password;

	/**
	 * 邮箱
	 */
   	@Column(name = "EMAIL" )
	private String email;

	/**
	 * 联系方式
	 */
   	@Column(name = "TEL" )
	private String tel;

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

	/**
	 * 微信号
	 */
   	@Column(name = "WECHAT_NO" )
	private String wechatNo;

	/**
	 * 状态
	 */
   	@Column(name = "STATUS" )
	private String status;

	/**
	 * 申请重置密码
	 */
   	@Column(name = "RESET_PASSWORD" )
	private String resetPassword;

	/**
	 * 锁定登录
	 */
   	@Column(name = "LOCK_LOGIN" )
	private String lockLogin;

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getUserNo() {
		return this.userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
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

	public String getWechatNo() {
		return this.wechatNo;
	}

	public void setWechatNo(String wechatNo) {
		this.wechatNo = wechatNo;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getResetPassword() {
		return this.resetPassword;
	}

	public void setResetPassword(String resetPassword) {
		this.resetPassword = resetPassword;
	}

	public String getLockLogin() {
		return this.lockLogin;
	}

	public void setLockLogin(String lockLogin) {
		this.lockLogin = lockLogin;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"userNo='" + userNo + '\'' +
					"userName='" + userName + '\'' +
					"password='" + password + '\'' +
					"email='" + email + '\'' +
					"tel='" + tel + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"factory='" + factory + '\'' +
					"wechatNo='" + wechatNo + '\'' +
					"status='" + status + '\'' +
					"resetPassword='" + resetPassword + '\'' +
					"lockLogin='" + lockLogin + '\'' +
				'}';
	}

}
