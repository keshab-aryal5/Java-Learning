package selfPractice.interfaceRevision.Question10;

public interface Device {
	default void start()
	{
		System.out.println("Starting device...");
		initHardware();
	}
	private void initHardware()
	{
		System.out.println("Initializing the hardware..");
	}
}
