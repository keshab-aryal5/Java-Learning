package oop.exercise.Practice3;

import java.text.NumberFormat;

public class Employee
{
	private int empId;
	private String name;
	private String ssn;
	private double salary;
	
	public Employee(int empId,String name,String ssn,double salary)
	{
		this.empId = empId;
		this.name = name;
		this.ssn = ssn;
		this.salary = salary;
	}
	
	public void setName(String name)
	{
		if(name.equals(null) || name.equals(""))
		{
			System.out.println("Name cann't be null or empty");
		}
		else
		this.name = name;
	}
	public void raiseSalary(double salary)
	{
		if(salary<0.0)
		{
			System.out.println("Salary cann't be negative");
		}
		else
		this.salary += salary;
	}
	public int getEmpId() {
		return empId;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}
	
	public void printEmployee()
	{
		System.out.println("Employee [ empId- "+empId+" Name: "+name+" ssn: "+ssn+" salary: "+NumberFormat.getCurrencyInstance().format(getSalary())+"]");
	}
}
