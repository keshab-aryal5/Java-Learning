package oop.exercise.level1;

//Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a 
//class named 'Triangle' with constructor having the three sides as its parameters. 
public class Question5 {
	public static void main(String[] args) {
		Triangle5 t1 = new Triangle5(3,4,5);
		System.out.println("The area of triangle "+t1.area()+"sq.units");
		System.out.println("The perimiter of triangle "+t1.perimter()+"units");
		
	}
}


class Triangle5{
	int sideA;
	int sideB;
	int sideC;
	
	public Triangle5(int a, int b, int c)
	{
		sideA = a;
		sideB = b;
		sideC = c;
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