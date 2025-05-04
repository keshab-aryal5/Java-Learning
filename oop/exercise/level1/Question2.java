package oop.exercise.level1;

//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value 
//of roll_no as '2' and that of name as "John" by creating an object of the class Student. 
public class Question2 {
	public static void main(String[] args) {
		Student s1 = new Student("John",2);
		System.out.println(s1);
	}
}

class Student
{
	String name;
	int roll_no;
	
	//creating constructor
	public Student(String name,int rollNo)
	{
		this.name = name;
		this.roll_no = rollNo;
	}
	@Override
	public String toString()
	{
		return "Student name: "+this.name+" Studnet roll.no "+this.roll_no;
	}

}