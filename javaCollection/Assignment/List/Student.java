package javaCollection.Assignment.List;

public class Student {
	private int sid;
	private String name;
	private int age;

	public Student(int sid, String name, int age) {
		super();
		this.sid = sid;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", age=" + age + "]";
	}
	
}
