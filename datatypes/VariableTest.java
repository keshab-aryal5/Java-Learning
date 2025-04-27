package datatypes;

import java.util.Scanner;

public class VariableTest {
public static void main(String[] args) {
	/*
	 * *****************Variable***********************
	 * use to store values.
	 * value stored for processing
	 * 
	 * syntax
	 *  data_type var_name
	 */
	int l ;
	int b ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length of rectanlge: ");
	l = sc.nextInt();
	System.out.println("Enter breadth of rectangle: ");
	b = sc.nextInt();
	int area = l*b;
	System.out.println("Area of rectangle is "+area);
}
}
