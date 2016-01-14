package mypack1.test;

import org.apache.log4j.Logger;

public class PackageLogger3{
	
	//DEBUG < INFO < WARN < ERROR < FATAL
	final static Logger logger = Logger.getLogger("abcxyz");//default logger will be called
	//final static Logger logger = Logger.getLogger(HelloExample.class);//using class
	
	public static void main(String[] args) {
	
		PackageLogger3 obj = new PackageLogger3();
		obj.runMe("Imran Khan");
		
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn PackageLogger3 : " + parameter);
		logger.error("This is error PackageLogger3 : " + parameter);
		logger.fatal("This is fatal PackageLogger3 : " + parameter);
		
	}
	
}