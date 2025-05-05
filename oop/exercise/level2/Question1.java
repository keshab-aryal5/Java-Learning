package oop.exercise.level2;

import java.util.Scanner;

//Write a program by creating an 'Employee' class having the following methods and print the final salary. 
//1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter 
//2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500. 
//3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 
//6 hours.
public class Question1 {
	public static void main(String[] args) {
		int sal = 0, hours = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the salary of a person: $");
		sal = sc.nextInt();
		System.out.print("Enter the wok hours per day: ");
		hours = sc.nextInt();
		Employee emp1 = new Employee();
		emp1.getInfo(sal, hours);
		emp1.addSal();
		emp1.addWork();
		
		System.out.println(emp1);
		
	}
}

class Employee
{
	int salary,numberOfHours;
	public void getInfo(int sal,int num)
	{
		salary = sal;
		numberOfHours = num;
	}
	
	public void addSal()
	{
		if(this.salary<500)
		{
			salary += 10;
		}
	}
	public void addWork()
	{
		if(numberOfHours > 6)
		{
			salary += 6;
		}
	}
	
	@Override
	public String toString()
	{
		return "Salary = $"+this.salary+" working hours per day = "+numberOfHours;
	}
	
}
