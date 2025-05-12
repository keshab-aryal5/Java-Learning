package selfPractice.interfaceRevision.Question4;

public class ConsoleLogger implements LoggerService{
	public static void main(String[] args) {
		LoggerService logger = new ConsoleLogger();
		
		logger.logInfo();
	}
}
