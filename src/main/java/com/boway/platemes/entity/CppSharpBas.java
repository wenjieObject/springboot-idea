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
@Table ( name ="CPP_SHARP_BAS" , schema = "")
public class CppSharpBas  implements Serializable {

	private static final long serialVersionUID =  6944188619209330593L;

	@Id
   	@Column(name = "GUID" )
	private String guid;

   	@Column(name = "CREATOR" )
	private String creator;

   	@Column(name = "CREATE_TIME" )
	private Date createTime;

   	@Column(name = "FACTORY" )
	private String factory;

   	@Column(name = "MODIFIER" )
	private String modifier;

   	@Column(name = "MODIFY_TIME" )
	private Date modifyTime;

   	@Column(name = "FLAG" )
	private String flag;

   	@Column(name = "DELETE_FLAG" )
	private String deleteFlag;

   	@Column(name = "SHARP_NO" )
	private String sharpNo;

   	@Column(name = "SHARP_NAME" )
	private String sharpName;

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

	public String getFactory() {
		return this.factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
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

	public String getSharpNo() {
		return this.sharpNo;
	}

	public void setSharpNo(String sharpNo) {
		this.sharpNo = sharpNo;
	}

	public String getSharpName() {
		return this.sharpName;
	}

	public void setSharpName(String sharpName) {
		this.sharpName = sharpName;
	}

	@Override
	public String toString() {
		return "{" +
					"guid='" + guid + '\'' +
					"creator='" + creator + '\'' +
					"createTime='" + createTime + '\'' +
					"factory='" + factory + '\'' +
					"modifier='" + modifier + '\'' +
					"modifyTime='" + modifyTime + '\'' +
					"flag='" + flag + '\'' +
					"deleteFlag='" + deleteFlag + '\'' +
					"sharpNo='" + sharpNo + '\'' +
					"sharpName='" + sharpName + '\'' +
				'}';
	}

}
