
public class Application {

	static Logger logger;
	
	public static void main(String[] args) {

		Logger logger = new FileLogger(); 
		
		logger.info("Hello");
		logger.warning("This is a warning");
		logger.error("This is an error!");
		logger.fatal("Fatal error");
		
		logger.close(); 
		
		setLogger (new FileLogger()); 
		setLogger(new ConsoleLogger()); 
		
		
	}
	
	private static void setLogger(Logger l) {
		logger = l; 
	}

}
