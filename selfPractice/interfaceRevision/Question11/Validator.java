package selfPractice.interfaceRevision.Question11;

public interface Validator {
	static void isValidEmail(String email, String password)
	{
		System.out.println("vaid email");
		isValidPassword(password);
	}
	private static void isValidPassword(String password)
	{
		System.out.println("Valid password ");
	}
}
