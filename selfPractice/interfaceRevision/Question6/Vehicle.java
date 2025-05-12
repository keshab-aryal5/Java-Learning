package selfPractice.interfaceRevision.Question6;

public interface Vehicle {
	int MAX_SPEED = 90;
	
	void drive();
	
	default void start()
	{
		System.out.println("Starting vehicle");
		logStart();
	}
	
	static void serviceInfo()
	{
		System.out.println("This is a a service info of vehicle.");
		loadServiceCenter();
	}
	private void logStart()
	{
		System.out.println("Starting the log of vehicle");
	}
	private static void loadServiceCenter()
	{
		System.out.println("Loading service center...");
	}
}
