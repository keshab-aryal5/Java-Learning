package selfPractice.interfaceRevision.Question5;

public interface DatabaseConfig {
	static void printSettings()
	{
		System.out.println("Printing database configuration.");
		loadDefaults();
	}
	
	private static void loadDefaults()
	{
		System.out.println("Loading default configuration of database...");
	}
}
