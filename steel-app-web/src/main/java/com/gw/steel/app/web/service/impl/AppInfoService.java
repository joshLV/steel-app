/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gw.steel.app.dal.mapper.applog.AppInfoDOMapperExt;
import com.gw.steel.app.dal.model.applog.AppInfoDO;

/**
 * 
 * @author log.yin
 * @version $Id: AppInfoService.java, v 0.1 2014年8月12日 上午9:16:55 log.yin Exp $
 */
@Service("appInfoService")
public class AppInfoService {
    private static Logger logger = LoggerFactory.getLogger(AppInfoService.class);

    @Autowired
    AppInfoDOMapperExt    appInfoDOMapperExt;

    /**
     * 根据appName查询
     * 
     * @param appName
     * @return
     */
    public AppInfoDO selectByAppName(String appName) {
        if (appName == null) {
            return null;
        }
        logger.info("appName: {}", appName);

        return appInfoDOMapperExt.selectByAppName(appName);
    };

    /**
     * 查询所有
     * 
     * @return
     */
    public List<AppInfoDO> selectAll() {
        List<AppInfoDO> recordlist = appInfoDOMapperExt.selectAll();
        if (recordlist != null && recordlist.size() >= 0) {
            logger.info("size: {}", recordlist.size());
        }
        return recordlist;
    };
}
