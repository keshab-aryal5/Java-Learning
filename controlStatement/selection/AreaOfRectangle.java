package controlStatement.selection;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length, breadth;
		System.out.print("Enter the length  of rectangle: ");
		length = sc.nextInt();
		System.out.print("Enter the breadth of rectangle: ");
		breadth = sc.nextInt();
		
		if(length!=0 && breadth!=0)
		{
			System.out.println(length*breadth);
		}
		else
		{
			System.out.println("Invalid measurements given");
		}
	}
}
