/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.api.applog.service;

import steel.spring.mdp.annotation.MdpMethod;
import steel.spring.mdp.annotation.MdpService;

import com.gw.steel.app.api.applog.service.dto.AppLog;
import com.gw.steel.app.api.constants.QueueNames;

/**
 * 
 * @author log.yin
 * @version $Id: AppLoggerClient.java, v 0.1 2014年8月8日 下午3:42:37 log.yin Exp $
 */
@MdpService(queueNames = QueueNames.STEEL_APP_MDP_REQUEST)
public interface AppLogger {

    @MdpMethod(asynchronous = true)
    public void info(AppLog appLog) throws Exception;

    @MdpMethod(asynchronous = true)
    public void error(AppLog appLog) throws Exception;

}
