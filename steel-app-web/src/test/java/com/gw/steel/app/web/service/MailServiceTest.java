/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2015 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gw.steel.app.api.mail.service.MailService;
import com.gw.steel.app.api.mail.service.dto.MailInfo;

/**
 * 
 * @author log.yin
 * @version $Id: MailServiceTest.java, v 0.1 2015年2月10日 下午3:24:26 log.yin Exp $
 */
public class MailServiceTest extends AbstractServiceTest {

    @Autowired
    MailService mailService;
    
    @Test
    public void save() throws Exception {
        MailInfo mailInfo=new MailInfo();
        mailInfo.setToAddress("gaowei@gw.com.cn;yinqisheng@gw.com.cn");
        mailInfo.setSubject("test");
        mailInfo.setContent("test mail");
        
        mailService.sendMail(mailInfo, false);
    }
}
