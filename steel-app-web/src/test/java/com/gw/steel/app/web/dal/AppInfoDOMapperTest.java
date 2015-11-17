/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.dal;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.gw.steel.app.dal.mapper.applog.AppInfoDOMapper;
import com.gw.steel.app.dal.model.applog.AppInfoDO;

/**
 * 
 * @author log.yin
 * @version $Id: DbInfoDOMapperTest.java, v 0.1 2014年6月24日 下午12:43:28 log.yin Exp $
 */

public class AppInfoDOMapperTest extends AbstractDaoTest {
    @Autowired
    AppInfoDOMapper appInfoDOMapper;

    @Test
    public void save() {
        AppInfoDO record = new AppInfoDO();
        record.setAppName("appName2");
        record.setContactType("08");
        record.setContactInfo("successful");
        record.setRecordCrtTime(new Date());

        
        int ret=appInfoDOMapper.insert(record);
        
        System.out.print("==========================================================="+ret);

    }

}
