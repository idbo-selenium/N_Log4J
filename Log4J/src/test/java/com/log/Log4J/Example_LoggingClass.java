package com.log.Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example_LoggingClass {

	final static Logger log = Logger.getLogger(Example_LoggingClass.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		log.info("Information option");
		log.fatal("Fatal option");
		log.debug("Debug option");
		log.warn("Warn option");
		log.error("Error option");//DEBUG < INFO < WARN < ERROR < FATAL
	}
}