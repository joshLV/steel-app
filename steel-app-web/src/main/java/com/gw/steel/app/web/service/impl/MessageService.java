/**
 * 
 *大智慧股份有限公司
 * Copyright (c) 2006-2014 DZH,Inc.All Rights Reserved.
 */
package com.gw.steel.app.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gw.steel.app.dal.mapper.applog.MessageDOMapper;
import com.gw.steel.app.dal.model.applog.MessageDO;

/**
 * 
 * @author log.yin
 * @version $Id: MessageService.java, v 0.1 2014年8月8日 下午6:02:59 log.yin Exp $
 */
@Service("messageService")
public class MessageService {
	@Autowired
	MessageDOMapper messageDOMapper;

	public void insert(MessageDO record) {
		messageDOMapper.insert(record);
	}
}
