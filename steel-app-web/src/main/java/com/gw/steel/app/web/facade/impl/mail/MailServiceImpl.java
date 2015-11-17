package com.gw.steel.app.web.facade.impl.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import steel.spring.mdp.annotation.MdpService;

import com.gw.steel.app.api.mail.service.MailService;
import com.gw.steel.app.api.mail.service.dto.MailInfo;
import com.gw.steel.app.web.service.impl.MailSendService;

@Service("mailService")
@MdpService(serviceInterfaceClass = MailService.class)
public class MailServiceImpl implements MailService {

	@Autowired
	private MailSendService mailSendService;

	@Override
	public void sendMail(MailInfo mailInfo, boolean isHtml) throws Exception {
		mailSendService.sendMail(mailInfo, isHtml);
	}
}
