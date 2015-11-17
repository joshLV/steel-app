package com.gw.steel.app.web.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gw.steel.app.api.applog.service.dto.AppLog;
import com.gw.steel.app.web.facade.impl.applog.AppLoggerService;

public class AppLoggerServiceTest extends AbstractServiceTest {

    @Autowired
    private AppLoggerService appLoggerService;

    @Test
    public void save() throws Exception {
        AppLog appLog = new AppLog();
        appLog.setAppName("bizmonitor");
        appLog.setMessage("hello word");
        appLog.setNode("10.15.201.22");

        appLoggerService.info(appLog);
    }
}
