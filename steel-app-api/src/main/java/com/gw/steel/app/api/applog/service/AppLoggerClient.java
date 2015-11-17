/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.api.applog.service;

import steel.spring.mdp.annotation.Mdpwired;

import com.gw.steel.app.api.applog.service.dto.AppLog;
import com.gw.steel.app.api.constants.QueueNames;

/**
 * 
 * @author log.yin
 * @version $Id: AppLogger.java, v 0.1 2014年12月1日 下午4:18:22 log.yin Exp $
 */
public class AppLoggerClient {

    private String    appName;
    private String    node;
    private AppLog    appLog;

    private AppLogger appLogger;

    @Mdpwired(queueName = QueueNames.STEEL_APP_MDP_REQUEST)
    public void setAppLogger(AppLogger appLogger) {
        this.appLogger = appLogger;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public void setNode(String node) {
        this.node = node;
    }

    public void info(String message) {
        try {
            appLog = new AppLog();
            appLog.setAppName(appName);
            appLog.setMessage(message);
            appLog.setNode(node);
            appLogger.info(appLog);
        } catch (Exception e) {
        }

    }

    public void error(String message) {
        try {
            appLog = new AppLog();
            appLog.setAppName(appName);
            appLog.setMessage(message);
            appLog.setNode(node);
            appLogger.error(appLog);
        } catch (Exception e) {
        }
    }
}
