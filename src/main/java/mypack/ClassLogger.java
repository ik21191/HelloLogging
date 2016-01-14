package mypack;

import org.apache.log4j.Logger;

public class ClassLogger{
	
	final static Logger logger = Logger.getLogger(ClassLogger.class);
	public static void main(String[] args) {
	
		ClassLogger obj = new ClassLogger();
		
		try{
			obj.divide();
		}catch(ArithmeticException ex){
			logger.error("Sorry, something wrong!", ex);
		}
	}
	private void divide(){
		int i = 10 /0;
		System.out.println(i);
	}
	
}