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
@Table ( name ="CPP_OP_BAS" , schema = "")
public class CppOpBas  implements Serializable {

	private static final long serialVersionUID =  1516853348804333849L;

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
	 * 工序编号
	 */
   	@Column(name = "OP_NO" )
	private String opNo;

	/**
	 * 工序名称
	 */
   	@Column(name = "OP_NAME" )
	private String opName;

	/**
	 * 备注
	 */
   	@Column(name = "DESCRIPTION" )
	private String description;

	/**
	 * 生成半成品
	 */
   	@Column(name = "CREATE_MATERIEL" )
	private String createMateriel;

	/**
	 * 默认仓库
	 */
   	@Column(name = "WAREHOUSE_GUID" )
	private String warehouseGuid;

	/**
	 * 是否检验
	 */
   	@Column(name = "IS_QUALITY_TEST" )
	private String isQualityTest;

	/**
	 * 是否需实验室检验
	 */
   	@Column(name = "IS_LAB_TEST" )
	private String isLabTest;

	/**
	 * 库存单位
	 */
   	@Column(name = "UNIT_GUID" )
	private String unitGuid;

	/**
	 * 委外类型
	 */
   	@Column(name = "MADE_TYPE" )
	private String madeType;

	/**
	 * 是否产出自检
	 */
   	@Column(name = "IS_OUT_QUALITY_TEST" )
	private String isOutQualityTest;

	/**
	 * 1.标准 2.熔铸 3.剪切 4.包装 5.热轧 6.铣面 7.厚剪 8.多连卷
	 */
   	@Column(name = "OP_TYPE" )
	private String opType;

	/**
	 * 默认储位
	 */
   	@Column(name = "BIN_GUID" )
	private String binGuid;

   	@Column(name = "CODE_TYPE_GUID" )
	private String codeTypeGuid;

   	@Column(name = "CODE_RULE_GUID" )
	private String codeRuleGuid;

   	@Column(name = "LOTCODE_TYPE_GUID" )
	private String lotcodeTypeGuid;

   	@Column(name = "LOTCODE_RULE_GUID" )
	private String lotcodeRuleGuid;

   	@Column(name = "LOT_CONTROL" )
	private String lotControl;

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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCreateMateriel() {
		return this.createMateriel;
	}

	public void setCreateMateriel(String createMateriel) {
		this.createMateriel = createMateriel;
	}

	public String getWarehouseGuid() {
		return this.warehouseGuid;
	}

	public void setWarehouseGuid(String warehouseGuid) {
		this.warehouseGuid = warehouseGuid;
	}

	public String getIsQualityTest() {
		return this.isQualityTest;
	}

	public void setIsQualityTest(String isQualityTest) {
		this.isQualityTest = isQualityTest;
	}

	public String getIsLabTest() {
		return this.isLabTest;
	}

	public void setIsLabTest(String isLabTest) {
		this.isLabTest = isLabTest;
	}

	public String getUnitGuid() {
		return this.unitGuid;
	}

	public void setUnitGuid(String unitGuid) {
		this.unitGuid = unitGuid;
	}

	public String getMadeType() {
		return this.madeType;
	}

	public void setMadeType(String madeType) {
		this.madeType = madeType;
	}

	public String getIsOutQualityTest() {
		return this.isOutQualityTest;
	}

	public void setIsOutQualityTest(String isOutQualityTest) {
		this.isOutQualityTest = isOutQualityTest;
	}

	public String getOpType() {
		return this.opType;
	}

	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getBinGuid() {
		return this.binGuid;
	}

	public void setBinGuid(String binGuid) {
		this.binGuid = binGuid;
	}

	public String getCodeTypeGuid() {
		return this.codeTypeGuid;
	}

	public void setCodeTypeGuid(String codeTypeGuid) {
		this.codeTypeGuid = codeTypeGuid;
	}

	public String getCodeRuleGuid() {
		return this.codeRuleGuid;
	}

	public void setCodeRuleGuid(String codeRuleGuid) {
		this.codeRuleGuid = codeRuleGuid;
	}

	public String getLotcodeTypeGuid() {
		return this.lotcodeTypeGuid;
	}

	public void setLotcodeTypeGuid(String lotcodeTypeGuid) {
		this.lotcodeTypeGuid = lotcodeTypeGuid;
	}

	public String getLotcodeRuleGuid() {
		return this.lotcodeRuleGuid;
	}

	public void setLotcodeRuleGuid(String lotcodeRuleGuid) {
		this.lotcodeRuleGuid = lotcodeRuleGuid;
	}

	public String getLotControl() {
		return this.lotControl;
	}

	public void setLotControl(String lotControl) {
		this.lotControl = lotControl;
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
					"opNo='" + opNo + '\'' +
					"opName='" + opName + '\'' +
					"description='" + description + '\'' +
					"createMateriel='" + createMateriel + '\'' +
					"warehouseGuid='" + warehouseGuid + '\'' +
					"isQualityTest='" + isQualityTest + '\'' +
					"isLabTest='" + isLabTest + '\'' +
					"unitGuid='" + unitGuid + '\'' +
					"madeType='" + madeType + '\'' +
					"isOutQualityTest='" + isOutQualityTest + '\'' +
					"opType='" + opType + '\'' +
					"binGuid='" + binGuid + '\'' +
					"codeTypeGuid='" + codeTypeGuid + '\'' +
					"codeRuleGuid='" + codeRuleGuid + '\'' +
					"lotcodeTypeGuid='" + lotcodeTypeGuid + '\'' +
					"lotcodeRuleGuid='" + lotcodeRuleGuid + '\'' +
					"lotControl='" + lotControl + '\'' +
				'}';
	}

}
