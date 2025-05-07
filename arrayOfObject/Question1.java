package arrayOfObject;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Q> WAP to store and print data 
 *    of 10 Employees(id,name,company,salary,department,post,city):
 *    
 *    a> find total salary of employee.
 *    b> print employees of IT department.
 *    c> count employees of Admin department.
 *    d> count and print employees of particular city.
 *    e> calculate total salary of particular department.
 *    f> find highest and lowest salary of employee.
 */
public class Question1 {
	public static void main(String[] args) {
		
		//creating an array of Employee class to store 10 employees data... 
		Employee[] emp = new Employee[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<emp.length;i++)
		{
			
			emp[i] = new Employee();
			
			System.out.println("Enter the data for employee "+(i+1)+"\n");
			System.out.print("Enter id of employee: ");
			emp[i].setId(sc.nextInt());
			
			//to skip the enter pressed
			sc.nextLine();
			System.out.print("Enter name: ");
			emp[i].setName(sc.nextLine());
			
		
			System.out.print("Enter comapny: ");
			emp[i].setCompany(sc.nextLine());
			
			System.out.print("Enter salary: ");
			emp[i].setSalary(sc.nextInt());
			
			//to skip the enter pressed
			sc.nextLine();
			System.out.print("Enter department: ");
			emp[i].setDepartment(sc.nextLine());
			
			
	
			System.out.print("Enter post: ");
			emp[i].setPost(sc.nextLine());
			
		
			System.out.print("Enter city: ");
			emp[i].setCity(sc.nextLine());
			
			System.out.println("******************************************");
		}
		
//		 a> find total salary of employee.
		findTotalSalary(emp);
//		 *    b> print employees of IT department.
		countAndPrintEmployeeOfDepartment(emp,"IT");
//		 *    c> count employees of Admin department.
		countAndPrintEmployeeOfDepartment(emp,"Admin");
//		 *    d> count and print employees of particular city.
		countAndPrintEmployeeOfCity(emp,"kathmandu");
//		 *    e> calculate total salary of particular department.
		findTotalSalaryOfDepartment(emp,"IT");
//		 *    f> find highest and lowest salary of employee.
		findHighestSalary(emp);
		findLowestSalary(emp);
		
	}
	
	//total salary;
	public static void findTotalSalary(Employee[] emp)
	{
		int total = 0;
		for(Employee e: emp)
		{
			total += e.getSalary();
		}
		
		System.out.println("The total salary of employee is: "+NumberFormat.getCurrencyInstance(Locale.US).format(total));
		
	}
	
	
//	count and print employee of department 
	public static void countAndPrintEmployeeOfDepartment(Employee[] emp,String deptName)
	{
		int count = 0;
		System.out.println("Employees of "+deptName+" department are as follow: ");
		for(Employee e:emp)
		{
			if(e.getDepartment().equalsIgnoreCase(deptName))
			{
				count++;
				System.out.println(e.getName());
			}
		}
		System.out.println("Total Employee: "+count);
	}
	
	
//	count and print employee of city
	public static void countAndPrintEmployeeOfCity(Employee[] emp,String city)
	{
		int count = 0;
		System.out.println("Employees of "+city+" city are as follow: ");
		for(Employee e:emp)
		{
			if(e.getCity().equalsIgnoreCase(city))
			{
				count++;
				System.out.println(e.getName());
			}
		}
		System.out.println("Total Employee from city "+city+" "+count);
	}
	
	
	// print total Salary of department
	public static void findTotalSalaryOfDepartment(Employee[] emp,String dept)
	{
		int total  = 0;
		for(Employee e:emp)
		{
			if(e.getDepartment().equalsIgnoreCase(dept))
			{
				total += e.getSalary();
			}
		}
		System.out.println("Total Salary of "+dept+" department is: "+NumberFormat.getCurrencyInstance(Locale.US).format(total));
	}
	
	//print highest salary;
	public static void findHighestSalary(Employee[] emp)
	{
		
		Employee em = emp[0];
		for(Employee e: emp)
		{
			if(e.getSalary()>em.getSalary())
			{
				em = e;
			}
		}
		System.out.println("The highest salary is: "+em.getSalary()+" of employee "+em.getName()+" from the department "+em.getDepartment());
	}
	
	//print the lowest salary
	public static void findLowestSalary(Employee[] emp)
	{
	
		Employee em = emp[0];
		for(Employee e: emp)
		{
			if(e.getSalary()<em.getSalary())
			{
				
				em = e;
			}
		}
		System.out.println("The lowest salary is: "+em.getSalary()+" of employee "+em.getName()+" from the department "+em.getDepartment());
	}

	
	
	

}

class Employee
{
	private int id;
	private String name;
	private String company;
	private int salary;
	private String department;
	private String post;
	private String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", company=" + company + ", salary=" + salary + ", department="
				+ department + ", post=" + post + ", city=" + city + "]";
	}
	
	
}