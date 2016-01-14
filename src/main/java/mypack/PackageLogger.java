package mypack;
import org.apache.log4j.Logger;
public class PackageLogger{
	
	//DEBUG < INFO < WARN < ERROR < FATAL
	final static Logger logger = Logger.getLogger("mypack");//using package

	//final static Logger logger = Logger.getLogger(HelloExample.class);//using class
	
	public static void main(String[] args) {
		
		PackageLogger obj = new PackageLogger();
		obj.runMe("Imran Khan");
		
	}
	
	private void runMe(String parameter){
		
		if(logger.isDebugEnabled()){
			logger.debug("This is debug : " + parameter);
		}
		
		if(logger.isInfoEnabled()){
			logger.info("This is info : " + parameter);
		}
		
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
		
	}
	
}