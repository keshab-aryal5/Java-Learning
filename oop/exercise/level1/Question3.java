package oop.exercise.level1;

//3. 
//Assign and print the roll number, phone number and address of two students having names "Sam" and 
//"John" respectively by creating two objects of class 'Student'.
public class Question3 {
	public static void main(String[] args) {
		//creating instance/object of class Student
		Student3 Sam = new Student3(2,"986912343434","New Baneshwor");
		Student3 John = new Student3(3,"9851047529","Kupondol imadol");
		System.out.println(Sam);
		System.out.println(John);
	}
	
}


class Student3{
	int rollNumber;
	String phoneNumber;
	String address;
	
	
	//defining constructor accepting rollNumber,phoneNumber,address
	public Student3(int rollNumber,String phoneNumber,String address)
	{
		this.rollNumber = rollNumber;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return "The roll number of student is "+rollNumber+" phone number is "+phoneNumber+" address is "+address;
	}
}