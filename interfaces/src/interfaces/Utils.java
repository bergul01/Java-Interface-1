package interfaces;

public class Utils {//araçlar
	/*
		public void runLoggers(Logger[] loggers, String message) {
			
			for(Logger logger: loggers) {
				logger.log(message);
			}
		}
		statik olmayan metottur
		new lenerek kullanılır
	*/
	
	public static void runLoggers(Logger[] loggers, String message) {
		
		for(Logger logger: loggers) {
			logger.log(message);
		}
	}
}
