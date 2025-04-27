package controlStatement.selection.exercise;

import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
//	2.WAP to print prime numbers between given range
	int lowerRange = 0;
	int higherRange = 0;
	boolean isPrime = false;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the lower range: ");
	lowerRange = sc.nextInt();
	
	System.out.print("Enter the higher range: ");
	higherRange = sc.nextInt();
	
	if(lowerRange<2)
	{
		lowerRange = 2;
	}
	if(higherRange<2)
	{
		System.out.println("No prime number in the given range");
	}
	else
	{
		System.out.println("Prime number in given range ");
		for(int i=lowerRange;i<=higherRange;i++)
		{
			if(i<=3)
			{
				isPrime = true;
			}
			else if(i%2 == 0 || i%3 ==0)
			{
				isPrime = false;
			}
			else
			{
				isPrime = true;
				//logic explained in question 1
				for(int j=5;j*j <= i;j=j+6)
				{
					if(i %j ==0 || i%(j+2)==0)
					{
						isPrime = false;
						break;
					}
					isPrime = true;
				}
				
			}
			if(isPrime)
			{
				System.out.print(i+ ",");
			}
			
		}
	}
	
}
}
