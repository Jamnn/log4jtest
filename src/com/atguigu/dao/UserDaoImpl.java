package com.atguigu.dao;

import org.apache.log4j.Logger;

public class UserDaoImpl {
	
	//第一行永远是他
	private static final Logger logger = Logger.getLogger(UserDaoImpl.class);

	
	public void getUserInfo(){
		if (logger.isDebugEnabled()) {
			logger.debug("getUserInfo() - start");
			logger.debug("gitlianxi11");
			logger.debug("gitlianxi22");
			logger.debug("gitlianxi33");
			logger.debug("gitlianxi44");
			logger.debug("gitlianxi55");
		}

		if (logger.isDebugEnabled()) {
			logger.debug("getUserInfo() - end");
		}
	}
	
	public static void main(String[] args){
		
		logger.debug("-------debug");
		logger.info("---------info");
		logger.warn("---------warn");
		logger.error("--------error");
		
		try {
			
			logger.debug("-----age come here");			
			int age = 10/2;
			if (logger.isInfoEnabled()) {
				logger.info("main(String[]) - int age=" + age);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage(),e);
		}
		
	}
	
}
