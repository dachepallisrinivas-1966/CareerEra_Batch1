package com.ce.ui;
import org.apache.log4j.Logger;

public final class LoggingDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger("UI");
		
		logger.fatal("a sample critical error message");
		logger.error("a sample error message");
		logger.info("a sample info message");
		logger.debug("a sample debug message");
		logger.warn("a sample warn message");
		
		System.out.println("Program terminated");
		
	}

}