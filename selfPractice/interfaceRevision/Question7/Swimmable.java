package selfPractice.interfaceRevision.Question7;

public interface Swimmable {
	default void move()
	{
		System.out.println("Moving from swimmable");
	}
}
