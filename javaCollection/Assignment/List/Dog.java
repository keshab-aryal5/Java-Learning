package javaCollection.Assignment.List;

public class Dog {
	private String name;
	private String gender;
	private int age;
	@Override
	public String toString() {
		return "Dog [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	public Dog(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
}
