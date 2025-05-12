package selfPractice.interfaceRevision.Question7;

public interface Flyable {
	default void move()
	{
		System.out.println("Moving from Flyable....");
	}
}
