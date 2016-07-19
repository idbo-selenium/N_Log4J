package com.log.Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class Sample_Logging {

	final static Logger log = Logger.getLogger(Sample_Logging.class);
	@Test
	public void Log4J_Sample_Method(){
		PropertyConfigurator.configure("log4j.properties");
	    log.info("Hello this is an info message");	
	    log.debug("Hello this is an debug message");
	}	
}