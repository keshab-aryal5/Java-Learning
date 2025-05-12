package selfPractice.interfaceRevision.Question12;

public interface Game {
	default void startGame()
	{
		System.out.println("Starting game...");
		initialize();
		play();
		end();
	}
	void initialize();
	void play();
	void end();
	
}
