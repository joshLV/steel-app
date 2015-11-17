package com.gw.steel.app.api.mail.service.dto;

import java.io.Serializable;

public class MailInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String toAddress;
	private String subject;
	private String content;
	private String templateFileName;
	private Object templateParamObject;

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getTemplateFileName() {
		return templateFileName;
	}

	public void setTemplateFileName(String templateFileName) {
		this.templateFileName = templateFileName;
	}

	public Object getTemplateParamObject() {
		return templateParamObject;
	}

	public void setTemplateParamObject(Object templateParamObject) {
		this.templateParamObject = templateParamObject;
	}

	@Override
	public String toString() {
		return "MailInfo [toAddress=" + toAddress + ", subject=" + subject
				+ ", content=" + content + "]";
	}
}
