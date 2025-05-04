package oop.exercise.level1;

import java.util.Scanner;

//Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. 
//First method named as 'setDim' takes length and breadth of rectangle as parameters and the second 
//method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered 
//through keyboard.

public class Question1 {
	
	public static void main(String[] args) {
		int length = 0, breadth = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of rectangle: ");
		length = sc.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		breadth = sc.nextInt();
		
		Area a = new Area();
		a.setDim(length, breadth);
		
		System.out.println("The are of rectangle is "+a.getArea()+"sq.units");
	}
}

class Area{
	int length;
	int breadth;
	void setDim(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	int getArea()
	{
		return this.length*this.breadth;
	}
	
}