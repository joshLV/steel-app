package com.gw.steel.app.dal.model.applog;

import java.util.Date;

public class MessageDO {
    private Long id;

    private String appName;

    private String node;

    private String level;

    private Date recordCrtTime;

    private String message;

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

    public String getNode() {
        return node;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getRecordCrtTime() {
        return recordCrtTime;
    }

    public void setRecordCrtTime(Date recordCrtTime) {
        this.recordCrtTime = recordCrtTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}