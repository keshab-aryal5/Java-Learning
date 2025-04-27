package controlStatement.selection.exercise;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
//		WAP to find sum of digits of given number
		int number = 0;
		int sum = 0;
		int remainder = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		number = sc.nextInt();
		
		// logic to find the reverse of number:
		// 		perform modulo operation to get last digit
		//		then add that digit in the other variable.
		//		divide the number by 10 to remove the last number (integer / integer --> integer)
		//	perform this operations until the the number is greater than 0;
		while(number > 0)
		while(number >0)
		{
			remainder = number % 10;
			sum += remainder;
			number /= 10;
		}
		System.out.println("The sum of digit is: "+ sum);
	}
}
