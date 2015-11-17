package com.gw.steel.app.dal.model.applog;

import java.util.Date;

public class AppInfoDO {
    private Long id;

    private String appName;

    private String contactType;

    private String contactInfo;

    private String subject;

    private Date recordCrtTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getRecordCrtTime() {
        return recordCrtTime;
    }

    public void setRecordCrtTime(Date recordCrtTime) {
        this.recordCrtTime = recordCrtTime;
    }
}