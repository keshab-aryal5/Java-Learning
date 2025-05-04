package oop.constructor;

public class User {
	String userName;
	String password;
	
	User(String un,String pw)
	{
		userName = un;
		password = pw;
		this.printUser();
	}
	
	void printUser()
	{
		System.out.println("User = "+userName);
		System.out.println("Passwod = "+password);
	}
	public static void main(String[] args)
	{
		User u = new User("Keshab","aryal");
//		u.printUser();
	}
}
