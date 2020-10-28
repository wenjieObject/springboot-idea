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
@Table ( name ="CPP_ORDER_MADE_RULE" , schema = "")
public class CppOrderMadeRule  implements Serializable {

	private static final long serialVersionUID =  3505350736238561819L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

   	@Column(name = "ORDER_DETAIL_GUID" )
	private String orderDetailGuid;

   	@Column(name = "MADE_RULE_GUID" )
	private String madeRuleGuid;

   	@Column(name = "PROCESS_GUID" )
	private String processGuid;

   	@Column(name = "PROCESS_OP_GUID" )
	private String processOpGuid;

   	@Column(name = "OP_GUID" )
	private String opGuid;

   	@Column(name = "SEQ" )
	private String seq;

   	@Column(name = "OP_NO" )
	private String opNo;

   	@Column(name = "OP_NAME" )
	private String opName;

   	@Column(name = "SPEC1" )
	private String spec1;

   	@Column(name = "IS_CHECK" )
	private String isCheck;

   	@Column(name = "SPEC2" )
	private String spec2;

   	@Column(name = "APPROVER_GUID" )
	private String approverGuid;

   	@Column(name = "APPROVE_DATE" )
	private Date approveDate;

   	@Column(name = "APPROVE_STATUS" )
	private String approveStatus;

   	@Column(name = "CHECKER_GUID" )
	private String checkerGuid;

   	@Column(name = "CHECK_DATE" )
	private Date checkDate;

   	@Column(name = "MATERIAL_GUID" )
	private String materialGuid;

   	@Column(name = "BOM_VER" )
	private String bomVer;

   	@Column(name = "SPEC3" )
	private String spec3;

   	@Column(name = "SPEC4" )
	private String spec4;

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

	public String getOrderDetailGuid() {
		return this.orderDetailGuid;
	}

	public void setOrderDetailGuid(String orderDetailGuid) {
		this.orderDetailGuid = orderDetailGuid;
	}

	public String getMadeRuleGuid() {
		return this.madeRuleGuid;
	}

	public void setMadeRuleGuid(String madeRuleGuid) {
		this.madeRuleGuid = madeRuleGuid;
	}

	public String getProcessGuid() {
		return this.processGuid;
	}

	public void setProcessGuid(String processGuid) {
		this.processGuid = processGuid;
	}

	public String getProcessOpGuid() {
		return this.processOpGuid;
	}

	public void setProcessOpGuid(String processOpGuid) {
		this.processOpGuid = processOpGuid;
	}

	public String getOpGuid() {
		return this.opGuid;
	}

	public void setOpGuid(String opGuid) {
		this.opGuid = opGuid;
	}

	public String getSeq() {
		return this.seq;
	}

	public void setSeq(String seq) {
		this.seq = seq;
	}

	public String getOpNo() {
		return this.opNo;
	}

	public void setOpNo(String opNo) {
		this.opNo = opNo;
	}

	public String getOpName() {
		return this.opName;
	}

	public void setOpName(String opName) {
		this.opName = opName;
	}

	public String getSpec1() {
		return this.spec1;
	}

	public void setSpec1(String spec1) {
		this.spec1 = spec1;
	}

	public String getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}

	public String getSpec2() {
		return this.spec2;
	}

	public void setSpec2(String spec2) {
		this.spec2 = spec2;
	}

	public String getApproverGuid() {
		return this.approverGuid;
	}

	public void setApproverGuid(String approverGuid) {
		this.approverGuid = approverGuid;
	}

	public Date getApproveDate() {
		return this.approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	public String getApproveStatus() {
		return this.approveStatus;
	}

	public void setApproveStatus(String approveStatus) {
		this.approveStatus = approveStatus;
	}

	public String getCheckerGuid() {
		return this.checkerGuid;
	}

	public void setCheckerGuid(String checkerGuid) {
		this.checkerGuid = checkerGuid;
	}

	public Date getCheckDate() {
		return this.checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getMaterialGuid() {
		return this.materialGuid;
	}

	public void setMaterialGuid(String materialGuid) {
		this.materialGuid = materialGuid;
	}

	public String getBomVer() {
		return this.bomVer;
	}

	public void setBomVer(String bomVer) {
		this.bomVer = bomVer;
	}

	public String getSpec3() {
		return this.spec3;
	}

	public void setSpec3(String spec3) {
		this.spec3 = spec3;
	}

	public String getSpec4() {
		return this.spec4;
	}

	public void setSpec4(String spec4) {
		this.spec4 = spec4;
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
					"orderDetailGuid='" + orderDetailGuid + '\'' +
					"madeRuleGuid='" + madeRuleGuid + '\'' +
					"processGuid='" + processGuid + '\'' +
					"processOpGuid='" + processOpGuid + '\'' +
					"opGuid='" + opGuid + '\'' +
					"seq='" + seq + '\'' +
					"opNo='" + opNo + '\'' +
					"opName='" + opName + '\'' +
					"spec1='" + spec1 + '\'' +
					"isCheck='" + isCheck + '\'' +
					"spec2='" + spec2 + '\'' +
					"approverGuid='" + approverGuid + '\'' +
					"approveDate='" + approveDate + '\'' +
					"approveStatus='" + approveStatus + '\'' +
					"checkerGuid='" + checkerGuid + '\'' +
					"checkDate='" + checkDate + '\'' +
					"materialGuid='" + materialGuid + '\'' +
					"bomVer='" + bomVer + '\'' +
					"spec3='" + spec3 + '\'' +
					"spec4='" + spec4 + '\'' +
				'}';
	}

}
