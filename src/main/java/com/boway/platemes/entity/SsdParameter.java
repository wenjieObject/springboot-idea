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
@Table ( name ="SSD_PARAMETER" , schema = "")
public class SsdParameter  implements Serializable {

	private static final long serialVersionUID =  860108981177300050L;

	/**
	 * 启用转移规则
	 */
   	@Column(name = "ALLOWANCE_RULES_ACTI" )
	private String allowanceRulesActi;

	/**
	 * 连续(正常>放宽)
	 */
   	@Column(name = "CONTINUE_NORMAL_TO_DECR" )
	private String continueNormalToDecr;

	/**
	 * 拒收(正常>放宽)
	 */
   	@Column(name = "REJECT_NORMAL_TO_DECR" )
	private String rejectNormalToDecr;

	/**
	 * 连续(正常>加严)
	 */
   	@Column(name = "CONTINUE_NORMAL_TO_STRI" )
	private String continueNormalToStri;

	/**
	 * 拒收(正常>加严)
	 */
   	@Column(name = "REJECT_NORMAL_TO_STRI" )
	private String rejectNormalToStri;

	/**
	 * 连续(放宽>正常)
	 */
   	@Column(name = "CONTINUE_DECR_TO_NORMAL" )
	private String continueDecrToNormal;

	/**
	 * 拒收(放宽>正常)
	 */
   	@Column(name = "REJECT_DECR_TO_NORMAL" )
	private String rejectDecrToNormal;

	/**
	 * 连续(加严>正常)
	 */
   	@Column(name = "CONTINUE_STRI_TO_NORMAL" )
	private String continueStriToNormal;

	/**
	 * 拒收(加严>正常)
	 */
   	@Column(name = "REJECT_STRI_TO_NORMAL" )
	private String rejectStriToNormal;

	/**
	 * 连续(加严>暂停检验)
	 */
   	@Column(name = "CONTINUE_STRI_TO_STOP" )
	private String continueStriToStop;

	/**
	 * 拒收(加严>暂停检验)
	 */
   	@Column(name = "REJECT_STRI_TO_STOP" )
	private String rejectStriToStop;

	/**
	 * Guid
	 */
	@Id
   	@Column(name = "GUID" )
	private String guid;

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

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

	/**
	 * 工厂
	 */
   	@Column(name = "FACTORY" )
	private String factory;

	public String getAllowanceRulesActi() {
		return this.allowanceRulesActi;
	}

	public void setAllowanceRulesActi(String allowanceRulesActi) {
		this.allowanceRulesActi = allowanceRulesActi;
	}

	public String getContinueNormalToDecr() {
		return this.continueNormalToDecr;
	}

	public void setContinueNormalToDecr(String continueNormalToDecr) {
		this.continueNormalToDecr = continueNormalToDecr;
	}

	public String getRejectNormalToDecr() {
		return this.rejectNormalToDecr;
	}

	public void setRejectNormalToDecr(String rejectNormalToDecr) {
		this.rejectNormalToDecr = rejectNormalToDecr;
	}

	public String getContinueNormalToStri() {
		return this.continueNormalToStri;
	}

	public void setContinueNormalToStri(String continueNormalToStri) {
		this.continueNormalToStri = continueNormalToStri;
	}

	public String getRejectNormalToStri() {
		return this.rejectNormalToStri;
	}

	public void setRejectNormalToStri(String rejectNormalToStri) {
		this.rejectNormalToStri = rejectNormalToStri;
	}

	public String getContinueDecrToNormal() {
		return this.continueDecrToNormal;
	}

	public void setContinueDecrToNormal(String continueDecrToNormal) {
		this.continueDecrToNormal = continueDecrToNormal;
	}

	public String getRejectDecrToNormal() {
		return this.rejectDecrToNormal;
	}

	public void setRejectDecrToNormal(String rejectDecrToNormal) {
		this.rejectDecrToNormal = rejectDecrToNormal;
	}

	public String getContinueStriToNormal() {
		return this.continueStriToNormal;
	}

	public void setContinueStriToNormal(String continueStriToNormal) {
		this.continueStriToNormal = continueStriToNormal;
	}

	public String getRejectStriToNormal() {
		return this.rejectStriToNormal;
	}

	public void setRejectStriToNormal(String rejectStriToNormal) {
		this.rejectStriToNormal = rejectStriToNormal;
	}

	public String getContinueStriToStop() {
		return this.continueStriToStop;
	}

	public void setContinueStriToStop(String continueStriToStop) {
		this.continueStriToStop = continueStriToStop;
	}

	public String getRejectStriToStop() {
		return this.rejectStriToStop;
	}

	public void setRejectStriToStop(String rejectStriToStop) {
		this.rejectStriToStop = rejectStriToStop;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
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
					"allowanceRulesActi='" + allowanceRulesActi + '\'' +
					"continueNormalToDecr='" + continueNormalToDecr + '\'' +
					"rejectNormalToDecr='" + rejectNormalToDecr + '\'' +
					"continueNormalToStri='" + continueNormalToStri + '\'' +
					"rejectNormalToStri='" + rejectNormalToStri + '\'' +
					"continueDecrToNormal='" + continueDecrToNormal + '\'' +
					"rejectDecrToNormal='" + rejectDecrToNormal + '\'' +
					"continueStriToNormal='" + continueStriToNormal + '\'' +
					"rejectStriToNormal='" + rejectStriToNormal + '\'' +
					"continueStriToStop='" + continueStriToStop + '\'' +
					"rejectStriToStop='" + rejectStriToStop + '\'' +
					"guid='" + guid + '\'' +
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
