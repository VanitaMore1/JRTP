package com.example.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MsgService {

private	Logger logger=LoggerFactory.getLogger(MsgService.class);

	public String getWelcomeMsg() {
		
		logger.info("getWelcomeMsg() started");
		String msg="Welcome Java";
		
		logger.info("getWelcomeMsg() ended");
		return msg;
	}
}
