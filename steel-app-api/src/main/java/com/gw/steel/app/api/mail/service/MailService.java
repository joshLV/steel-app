package com.gw.steel.app.api.mail.service;

import steel.spring.mdp.annotation.MdpMethod;
import steel.spring.mdp.annotation.MdpService;

import com.gw.steel.app.api.constants.QueueNames;
import com.gw.steel.app.api.mail.service.dto.MailInfo;

@MdpService(queueNames = QueueNames.STEEL_APP_MDP_REQUEST)
public interface MailService {

	@MdpMethod(asynchronous = true)
	void sendMail(MailInfo mailInfo, boolean isHtml) throws Exception;
}
