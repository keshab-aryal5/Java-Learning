package oop.exercise.level1;

//6
//Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a 
//class named 'Rectangle' with a method named 'Area' which returns the area and length and breadth passed 
//as parameters to its constructor. 
public class Question6 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		
		System.out.println("The area of rectangle with length "+r1.length+" and breadth "+r1.breadth+" is "+r1.area()+"sq.units");
		System.out.println("The area of rectangle with length "+r2.length+" and breadth "+r2.breadth+" is "+r2.area()+"sq.units");
	}
}

class Rectangle{
	int length;
	int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}
	public int area()
	{
		return this.length*this.breadth;
	}
}
