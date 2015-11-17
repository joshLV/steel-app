package com.gw.steel.app.dal.mapper.applog;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gw.steel.app.dal.model.applog.AppInfoDO;

public interface AppInfoDOMapperExt {

    AppInfoDO selectByAppName(@Param("appName") String appName);

    List<AppInfoDO> selectAll();

}