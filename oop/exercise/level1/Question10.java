package oop.exercise.level1;

//
//Write a program that would print the information (name, year of joining, salary, address) of three 
//employees by creating a class named 'Employee'. The output should be as follows: 
//Name       Year of joining  Address  
//Robert            1994 		64C- WallsStreat 
//Sam               2000 		68D- WallsStreat 
//John              1999     26B- WallsStreat 

public class Question10 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Robert",1994,"64C-WallsStreat");
		Employee emp2 = new Employee("Sam",2000,"68D-WallsStreat");
		Employee emp3 = new Employee("John",1999,"26B - WallsStreat");
		System.out.println("Name\t\tYear of Joining\t\tAddress");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}

class Employee
{
	String name,address;
	int yearOfJoining;
	
	public Employee(String naam, int yof,String add)
	{
		name = naam;
		yearOfJoining = yof; 
		address = add; 
	}
	
	@Override
	public String toString()
	{
		return this.name+"\t\t"+this.yearOfJoining+"\t\t\t"+this.address;
	}
	
}