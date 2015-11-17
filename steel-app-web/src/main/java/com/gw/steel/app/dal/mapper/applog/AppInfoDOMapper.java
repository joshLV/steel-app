package com.gw.steel.app.dal.mapper.applog;

import com.gw.steel.app.dal.model.applog.AppInfoDO;
import com.gw.steel.app.dal.model.applog.AppInfoDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AppInfoDOMapper {
    int countByExample(AppInfoDOExample example);

    int deleteByExample(AppInfoDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppInfoDO record);

    int insertSelective(AppInfoDO record);

    List<AppInfoDO> selectByExample(AppInfoDOExample example);

    AppInfoDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppInfoDO record, @Param("example") AppInfoDOExample example);

    int updateByExample(@Param("record") AppInfoDO record, @Param("example") AppInfoDOExample example);

    int updateByPrimaryKeySelective(AppInfoDO record);

    int updateByPrimaryKey(AppInfoDO record);
}