package selfPractice.interfaceRevision.Question2;

public class Main {
	public static void main(String[] args) {
		RemoteService remote = new TV();
		remote.connect();
		remote.powerOn();
	}
}
