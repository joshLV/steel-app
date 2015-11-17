--AppLog init data 

--default
INSERT INTO T_APP_INFO (ID,APP_NAME,CONTACT_TYPE,CONTACT_INFO,SUBJECT,RECORD_CRT_TIME)
VALUES(1,'AppLog','EMAIL','admin@xeams.com','AppLog系统通知', now());


--add config

INSERT INTO T_APP_INFO (APP_NAME,CONTACT_TYPE,CONTACT_INFO,SUBJECT,RECORD_CRT_TIME)
VALUES('bizmonitor','EMAIL','gaowei@xeams.com','bizmonitor通知', now());

INSERT INTO T_APP_INFO (APP_NAME,CONTACT_TYPE,CONTACT_INFO,SUBJECT,RECORD_CRT_TIME)
VALUES('cmobile','EMAIL','caiwei@xeams.com','cmobile通知', now());