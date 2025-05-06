package oop.exercise.Inheritance_Practice;

import java.text.NumberFormat;
import java.util.Locale;

//3.
//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'printSalary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes
//have data members 'specialization' and 'department' respectively. Now, assign name, age, phone
//number, address and salary to an employee and a manager by making an object of both of these classes
//and print the same.

public class Question3 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Keshab Aryal",23,"9869393678",78540.45,"Java","IT and Department");
		Manager mg1 = new Manager("Ashok Aryal",46,"9848424224",84542.45,"Python","IT and Department");
		
		
		emp1.printSalary();
		mg1.printSalary();
		
		
		System.out.println("Details of employee "+emp1);
		System.out.println("Details of manager: "+mg1);
		
	}
}


class Member
{
	String name;
	int age;
	String phoneNumber;
	double salary;
	
	public Member(String name,int age,String phoneNumber,double salary)
	{
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
	}
	
	public void printSalary()
	{
		System.out.println("The salary is "+NumberFormat.getCurrencyInstance(Locale.US).format(salary));
	}
	
	
}

class Employee extends Member
{
	String specialization;
	String department;
	
	public Employee(String name,int age,String phoneNumber,double salary,String specialization,String department)
	{
		super(name,age,phoneNumber,salary);
		this.specialization = specialization;
		this.department = department;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age+"\nPhoneNumber: "+phoneNumber+"\nSalary: "+salary+"\nSpecialization: "+specialization+"\nDepartment: "+department;
	}
	
}

class Manager extends Member
{
	String specialization;
	String department;
	
	public Manager(String name,int age,String phoneNumber,double salary,String specialization,String department)
	{
		super(name,age,phoneNumber,salary);
		this.specialization = specialization;
		this.department = department;
	}
	@Override
	public String toString()
	{
		return "Name: "+name+"\nAge: "+age+"\nPhoneNumber: "+phoneNumber+"\nSalary: "+salary+"\nSpecialization: "+specialization+"\nDepartment: "+department;
	}
}