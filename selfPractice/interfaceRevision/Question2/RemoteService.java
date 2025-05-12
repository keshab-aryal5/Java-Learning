package selfPractice.interfaceRevision.Question2;

public interface RemoteService {
	
	//creating a default method
	default void connect()
	{
		System.out.println("Default method of remote interface");
	}
	
	void powerOn();
}
