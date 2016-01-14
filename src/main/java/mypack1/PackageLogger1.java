package mypack1;

import org.apache.log4j.Logger;

public class PackageLogger1{
	
	//DEBUG < INFO < WARN < ERROR < FATAL
	final static Logger logger = Logger.getLogger("mypack1");//using package
	//final static Logger logger = Logger.getLogger(HelloExample.class);//using class
	
	public static void main(String[] args) {
	
		PackageLogger1 obj = new PackageLogger1();
		obj.runMe("Imran Khan");
		
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn PackageLogger1 : " + parameter);
		logger.error("This is error PackageLogger1 : " + parameter);
		logger.fatal("This is fatal PackageLogger1 : " + parameter);
		
	}
	
}