package controlStatement.selection.exercise;

import java.util.Scanner;

public class Question4 {
public static void main(String[] args) {
//	4.WAP to reverse a given number
	int number = 0;
	int reverse = 0;
	int remainder = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your number: ");
	number = sc.nextInt();
	
	/*
	 *  logic to find reverse of number
	 *  		perform the modulo operation of number with 10 to get the last digit.
	 *  		take another variable and initialize it with 0 and then on every iteration multiply it with 0 and add the remainder.
	 *  		divide the number with 10 to remove the last number.
	 *  perform this operation while n is greater than 0;
	 */
	while(number > 0)
	{
		remainder = number %10;
		reverse = reverse*10 + remainder;
		number /= 10;
	}
	
	System.out.println("Revers number is: "+reverse);
}
}
