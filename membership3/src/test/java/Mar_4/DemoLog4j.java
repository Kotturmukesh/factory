package Mar_4;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLog4j {
	public static Logger log;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		log = LogManager.getLogger(DemoLog4j.class);
		
		log.debug("this is debug msg");
		log.info("this is an info");
		log.warn("this is warning msg");
		log.error("this is error msg");
		log.fatal("this is fatal msg");
	

		System.out.println("prg started");
		
		System.out.println("user entered0");
		
		System.out.println("pwd entered");
		
		System.out.println("log clicked");
		
		System.out.println("done");
	}

}
