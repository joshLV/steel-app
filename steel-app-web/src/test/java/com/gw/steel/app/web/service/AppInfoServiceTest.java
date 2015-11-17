/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gw.steel.app.dal.model.applog.AppInfoDO;
import com.gw.steel.app.web.service.impl.AppInfoService;

/**
 * 
 * @author log.yin
 * @version $Id: AppInfoServiceTest.java, v 0.1 2014年8月12日 上午9:39:26 log.yin Exp $
 */


public class AppInfoServiceTest extends AbstractServiceTest{
    
    @Autowired
    private AppInfoService appInfoService;
    @Test
    public void selectAppInfo(){
        
        AppInfoDO record= appInfoService.selectByAppName("appName1");
        
        List<AppInfoDO> list= appInfoService.selectAll();
        
        for(AppInfoDO appInfo : list)
        {
            System.out.println("============================="+appInfo.getAppName()+"=="+appInfo.getContactType()+"=="+appInfo.getId());
        }
        
        System.out.print("=============================="+record.getAppName());
        System.out.println("=============================="+record.getContactInfo());
        
        System.out.print(String.valueOf(null));
        
        
        
    }
    


}
