package selfPractice.interfaceRevision.Question10;

public class SmartPhone implements Device,SmartDevice{
	public static void main(String[] args) {
		SmartPhone smart = new SmartPhone();
		smart.start();
		smart.connectToWiFi();
	}
}
