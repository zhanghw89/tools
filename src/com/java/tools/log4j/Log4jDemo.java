package com.java.tools.log4j;

import org.apache.log4j.Logger;


public class Log4jDemo {
	private static final Logger logger = Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		logger.info("info...");
		logger.debug("debug...");
		logger.error("error...");
	}
	
}
