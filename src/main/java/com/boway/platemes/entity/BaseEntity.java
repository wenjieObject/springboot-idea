package com.boway.platemes.entity;

import java.util.Date;

public class BaseEntity {

    /**
     * 创建人
     */
    private String creator;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifier;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 标志位
     */
    private String flag;

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    /**
     * 是否有效
     */
    private String deleteFlag;

    public BaseEntity() {
        this.creator = "digiwin001";
        this.createTime = new Date();
        this.modifier = "modifier";
        this.modifyTime = new Date();
        this.flag = "1";
        this.deleteFlag = "N";
        this.factory = "3000";
    }

    public static BaseEntity Build(){
        return new BaseEntity();
    }

    /**
     * 工厂
     */
    private String factory;
}
