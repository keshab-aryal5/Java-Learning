package oop.exercise.Inheritance_Practice;
//4.
//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to
//print the area and perimeter of the rectangle respectively. Its constructor having parameters for length
//and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the
//'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor
//of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

public class Question4 {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(4,5);
		Square sq = new Square(5);
		
		
		System.out.println("Area and perimter of rectangle");
		rect.area();
		rect.perimeter();
		
		
		System.out.println("Area and perimter of square");
		sq.area();
		sq.perimeter();
		
		
		
		//for question 5
		Square[] tensquare = new Square[10];
		for(int i=0;i<tensquare.length;i++)
		{
			// creating new instance of square, storing it in array and assigning the length as 5 times the value of (i+1)
			tensquare[i] = new Square((i+1)*5);
		}
		
		// printing area
		System.out.println("Printing area of 10 square");
		for(int i=0;i<tensquare.length;i++)
		{
			tensquare[i].area();
		}
	}
}

class Rectangle
{
	int length;
	int breadth;
	
	Rectangle(int l,int b)
	{
		length = l;
		breadth = b;
	}
	
	public void area()
	{
		System.out.println("Area = "+(length*breadth)+"sq.units");
	}
	
	public void perimeter()
	{
		System.out.println("Perimter = "+(2*(length+breadth))+"units");
	}
}

class Square extends Rectangle
{
	public Square(int s)
	{
		super(s,s);
	}
}


