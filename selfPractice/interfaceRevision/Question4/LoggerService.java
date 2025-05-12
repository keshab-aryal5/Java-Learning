package selfPractice.interfaceRevision.Question4;

public interface LoggerService {
	default void logInfo()
	{
		System.out.println("LogInfo of logger.....");
		getTimeStamp();
	}
	private void getTimeStamp()
	{
		System.out.println("I haven't covered the topic timeStamp.");
	}
}
