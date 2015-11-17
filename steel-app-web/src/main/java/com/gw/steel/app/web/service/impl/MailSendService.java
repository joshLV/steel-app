package com.gw.steel.app.web.service.impl;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.gw.steel.app.api.mail.service.dto.MailInfo;

import freemarker.template.Template;

@Service("mailSendService")
public class MailSendService {
    private static Logger        logger = LoggerFactory.getLogger(MailSendService.class);

    @Autowired
    private JavaMailSenderImpl   mailSender;

    @Resource(name = "freeMarkerConfigurer")
    private FreeMarkerConfigurer freeMarkerConfigurer;

    private String               from;

    public void sendMail(MailInfo mailInfo, boolean isHtml) throws MessagingException {
        from = mailSender.getUsername();
        String toAddress = mailInfo.getToAddress();
        if (StringUtils.isBlank(toAddress)) {
            logger.warn("email to address is blank");
            return;
        }
        String subject = mailInfo.getSubject();
        String templateFileName = mailInfo.getTemplateFileName();
        if (StringUtils.isEmpty(templateFileName)) {
            sendSimpleMail(toAddress, subject, mailInfo.getContent(), isHtml);
        } else {
            // Send mail with template
            sendMailWithTemplate(toAddress, subject, templateFileName,
                mailInfo.getTemplateParamObject());
        }
    }

    private void sendSimpleMail(String to, String subject, String msg, boolean isHtml)
                                                                                      throws MessagingException {

        logger.info("host: {}, username: {}", mailSender.getHost(), mailSender.getUsername());
        sendMail(to, subject, msg, isHtml);
    }

    /**
     * 根据模板来发送邮件
     * 
     * @param to
     *            收件人的邮箱
     * @param subject
     *            邮件主题
     * @param messageBean
     *            freemarker模板参数对象
     * @throws MessagingException
     */
    private void sendMailWithTemplate(String to, String subject, String templateFileName,
                                      Object templateParamObject) throws MessagingException {
        String htmlText = generateMailContent(templateFileName, templateParamObject);
        sendMail(to, subject, htmlText, true);
    }

    private void sendMail(String to, String subject, String content, boolean isHtml)
                                                                                    throws MessagingException {
        MimeMessage msg = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(msg, true, "utf-8");
        if (to.indexOf(";") != -1) {
            helper.setTo(to.split(";"));
        } else {
            helper.setTo(to);
        }
        helper.setFrom(from);
        helper.setSubject(subject);
        helper.setText(content, isHtml);
        mailSender.send(msg);
    }

    /**
     * 根据freemarker模板文件生成邮件内容
     * 
     * @param messageBean
     *            模板参数， 在模板文件中被使用。 例如${content}
     * @return
     */
    private String generateMailContent(String templateFileName, Object templateParamObject) {
        String content = "";
        Template tpl = null;
        try {
            tpl = freeMarkerConfigurer.getConfiguration().getTemplate(templateFileName);// 加载资源文件
            content = FreeMarkerTemplateUtils.processTemplateIntoString(tpl, templateParamObject);
        } catch (Exception e) {
            logger.error("generate mail content fail", e);
        }
        return content;
    }
}
