package oop.exercise.level1;

import java.util.Scanner;

//7. 
//Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its 
//length and breadth as parameters of its constructor and having a method named 'returnArea' which returns 
//the area of the rectangle. Length and breadth of rectangle are entered through keyboard. 
public class Question7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 0, b = 0;
		System.out.print("Enter the length of rectangle: ");
		l = sc.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		b = sc.nextInt();
		
		
		
		//creating an anonymous object and printing its area
		/*
		 * new Area7(l,b).returnArea()
		 * is equivalent to (functionality wis)
		 * Area7 area = new Area7(l,b);
		 * area.returnArea();
		 * 
		 * only difference is that the anonymous object created below cann't be referred in future but the object assigned to variable can be referenced in near future.
		 */
		System.out.println("The are is: "+new Area7(l,b).returnArea()+"sq.units");
	}

}

class Area7{
	int length;
	int breadth;
	public Area7(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	
	public int returnArea()
	{
		return this.length*this.breadth;
	}
	
	
}