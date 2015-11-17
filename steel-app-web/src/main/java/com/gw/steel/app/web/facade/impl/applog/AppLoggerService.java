/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.facade.impl.applog;

import java.text.MessageFormat;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import steel.spring.mdp.annotation.MdpService;

import com.gw.steel.app.api.applog.service.AppLogger;
import com.gw.steel.app.api.applog.service.dto.AppLog;
import com.gw.steel.app.api.mail.service.dto.MailInfo;
import com.gw.steel.app.dal.model.applog.AppInfoDO;
import com.gw.steel.app.dal.model.applog.MessageDO;
import com.gw.steel.app.web.facade.impl.applog.type.Level;
import com.gw.steel.app.web.service.impl.AppInfoService;
import com.gw.steel.app.web.service.impl.MailSendService;
import com.gw.steel.app.web.service.impl.MessageService;

/**
 * 
 * @author log.yin
 * @version $Id: LogSubmitServiceImpl.java, v 0.1 2014年8月8日 下午3:45:46 log.yin
 *          Exp $
 */
@Service
@MdpService(serviceInterfaceClass = AppLogger.class)
public class AppLoggerService implements AppLogger {
    private static Logger       logger           = LoggerFactory.getLogger(AppLoggerService.class);

    @Autowired
    private MessageService      messageService;

    @Autowired
    private MailSendService     mailSendService;

    @Autowired
    AppInfoService              appInfoService;

    @Resource(name = "noticeForMailAdmin")
    private String              noticeForMailAdmin;

    private final static String DEFAULT_APP_NAME = "AppLog";

    public void info(AppLog appLog) throws Exception {
        log(appLog, Level.INFO.getCode());

        MailInfo mailInfo = buildMailInfo(appLog);

        mailSendService.sendMail(mailInfo, false);
    };

    public void error(AppLog appLog) throws Exception {
        log(appLog, Level.ERROR.getCode());

        MailInfo mailInfo = buildMailInfo(appLog);

        mailSendService.sendMail(mailInfo, false);
    };

    /**
     * 
     * @param appLog
     * @return
     */
    private MailInfo buildMailInfo(AppLog appLog) {
        logger.info("request params: {}", ToStringBuilder.reflectionToString(appLog));

        MailInfo mailInfo = new MailInfo();
        mailInfo.setContent(appLog.getMessage());

        AppInfoDO record = appInfoService.selectByAppName(appLog.getAppName());

        // app未配置联系方式，默认发送到AppLog Admin
        if (record == null || StringUtils.isBlank(record.getContactInfo())) {
            logger.info("未查询到appName: {} 对应的配置，发送到默认app：{}", appLog.getAppName(), DEFAULT_APP_NAME);
            record = appInfoService.selectByAppName(DEFAULT_APP_NAME);
            String mailMessage = MessageFormat.format(noticeForMailAdmin, appLog.getAppName());
            mailInfo.setContent(mailMessage);
        }

        logger.info("Send message to :{}", record.getContactInfo());
        mailInfo.setToAddress(record.getContactInfo());
        mailInfo.setSubject(record.getSubject());

        return mailInfo;
    }

    /**
     * 记录数据到message表
     * 
     * @param appLog
     */
    private void log(AppLog appLog, String level) {
        MessageDO record = new MessageDO();
        record.setAppName(appLog.getAppName());
        record.setLevel(level);
        record.setMessage(appLog.getMessage());
        record.setNode(appLog.getNode());
        record.setRecordCrtTime(new Date());
        messageService.insert(record);
    }
}
