package selfPractice.interfaceRevision.Question10;

public interface SmartDevice extends Device {
	public default void connectToWiFi()
	{
		System.out.println("SmartDevice is connecting to wifi");
		checkSignalStrength();
	}
	private void checkSignalStrength()
	{
		System.out.println("Checking your signal strength.");
	}
}
