package com.atguigu.surveypark.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.atguigu.surveypark.dao.BaseDao;
import com.atguigu.surveypark.model.Message;
import com.atguigu.surveypark.service.MessageService;

@Service("messageService")
public class MessageServiceImpl extends BaseServiceImpl<Message> implements
		MessageService {
	
	@Resource(name="messageDao")
	public void setDao(BaseDao<Message> dao) {
		super.setDao(dao);
	}
}
