/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.api.applog.service.dto;

import java.io.Serializable;

/**
 * 
 * @author log.yin
 * @version $Id: AppLog.java, v 0.1 2014年8月8日 下午3:37:48 log.yin Exp $
 */
public class AppLog implements Serializable {
    
	/**  */
    private static final long serialVersionUID = -2152148166133059476L;
    private String appName;
    private String node;
    private String message;

    /**
     * Getter method for property <tt>appName</tt>.
     * 
     * @return property value of appName
     */
    public String getAppName() {
        return appName;
    }

    /**
     * Setter method for property <tt>appName</tt>.
     * 
     * @param appName value to be assigned to property appName
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * Getter method for property <tt>node</tt>.
     * 
     * @return property value of node
     */
    public String getNode() {
        return node;
    }

    /**
     * Setter method for property <tt>node</tt>.
     * 
     * @param node value to be assigned to property node
     */
    public void setNode(String node) {
        this.node = node;
    }


    /**
     * Getter method for property <tt>message</tt>.
     * 
     * @return property value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Setter method for property <tt>message</tt>.
     * 
     * @param message value to be assigned to property message
     */
    public void setMessage(String message) {
        this.message = message;
    }

}
