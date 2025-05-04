package oop;
//Assign and print the roll number, phone number and address of two students having names "Sam" and 
//"John" respectively by creating two objects of class 'Student'.
public class Question3 {
	public static void main(String[] args) {
		
		//creating instances of Student
		Student s1 = new Student("Sam",5,9869393678l,"New Baneshwor Kathmandu");
		Student s2 = new Student("John",6,9863442163l,"Tinkunea Kathmandu");
		
		System.out.println(s1);
		System.out.println(s2);
	}
}

class Student{
	String name;
	int rollNumber;
	long phoneNumber;
	String address;
	
	public Student(String name, int r,long phone,String address)
	{
		this.name = name;
		this.rollNumber = r;
		this.phoneNumber = phone;
		this.address = address;
	}
	
	@Override
	public String toString()
	{
		return this.name+" rollNumber: "+this.rollNumber+"\n phoneNumber: "+this.phoneNumber+"\n address: "+this.address;
	}
}