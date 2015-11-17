package com.gw.steel.app.dal.mapper.applog;

import com.gw.steel.app.dal.model.applog.MessageDO;
import com.gw.steel.app.dal.model.applog.MessageDOExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface MessageDOMapper {
    int countByExample(MessageDOExample example);

    int deleteByExample(MessageDOExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MessageDO record);

    int insertSelective(MessageDO record);

    List<MessageDO> selectByExampleWithBLOBs(MessageDOExample example);

    List<MessageDO> selectByExample(MessageDOExample example);

    MessageDO selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MessageDO record, @Param("example") MessageDOExample example);

    int updateByExampleWithBLOBs(@Param("record") MessageDO record, @Param("example") MessageDOExample example);

    int updateByExample(@Param("record") MessageDO record, @Param("example") MessageDOExample example);

    int updateByPrimaryKeySelective(MessageDO record);

    int updateByPrimaryKeyWithBLOBs(MessageDO record);

    int updateByPrimaryKey(MessageDO record);
}