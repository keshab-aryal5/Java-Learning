package coreJava;

public class Area {
public static void main(String[] args) {
	int area=0;
	int length = 5;
	int breadth = 10;
	if(length>0 && breadth>0)
	{
		area = length*breadth;
	}
	else
	{
		System.out.println("Invalid dimensions given");
	}
	
	System.out.println("The area is "+area+"sq.units");
}
}
