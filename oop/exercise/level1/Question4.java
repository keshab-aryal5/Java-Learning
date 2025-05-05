package oop.exercise.level1;

//. 
//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
//class named 'Triangle' without any parameter in its constructor. 
public class Question4 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		System.out.println("The area of triangle "+t1.area()+"sq.units");
		System.out.println("The perimiter of triangle "+t1.perimter()+"units");
	}
}

class Triangle{
	int sideA;
	int sideB;
	int sideC;
	
	public Triangle()
	{
		sideA = 3;
		sideB = 4;
		sideC = 5;
	}
	
	public int perimter()
	{
		return sideA+sideB+sideC;
	}
	public double area()
	{
		float sp = this.perimter()/(float)2;
		return Math.sqrt(sp*(sp-sideA)*(sp-sideB)*(sp-sideC));
	}
	
	
	
	
}
