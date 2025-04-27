package controlStatement.selection.exercise;

import java.util.Scanner;

public class Question3 {
//	WAP to count prime numbers between given range
public static void main(String[] args) {
	int lowerRange = 0;
	int higherRange = 0;
	boolean isPrime = false;
	int count = 0;
	
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
		count = 0;
	}
	else
	{
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
				count ++;
			}
			
		}
		System.out.println("Total prime number in given range is: "+count);
	}
	
}
}
