package oop.exercise.level1;

import java.util.Scanner;

//8. 
//Print the average of three numbers entered by user by creating a class named 'Average' having a method 
//to calculate and print the average. 
public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter your first number: ");
		a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		b = sc.nextInt();
		
		System.out.print("Enter the thrid number: ");
		c = sc.nextInt();
		
		Average avg = new Average(a,b,c);
		
		System.out.println("The average of these number is: "+avg.getAverage());
	}
}

class Average
{
	int firstNum=0,secondNum = 0, thirdNum = 0;
	public Average(int a,int b,int c)
	{
		firstNum = a;
		secondNum = b;
		thirdNum = c;
	}
	
	public float getAverage()
	{
		float average = 0.0f;
		average = (firstNum+secondNum+thirdNum)/(float)3;
		return average;
	}
}