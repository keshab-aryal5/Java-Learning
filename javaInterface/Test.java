package javaInterface;

public class Test {
	public static void main(String[] args) {
		UserService user = new UserClassImpl();
		user.addUser();
		user.deleteUser();
		user.print();
	}
}
