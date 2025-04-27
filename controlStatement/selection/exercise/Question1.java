package controlStatement.selection.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
//		1.WAP to check a given number is prime or not
		int number = 0,i=5;
		boolean isPrime = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number: ");
		number = sc.nextInt();
		
		
		// if the number is less than 2 then it is neither prime nor composite...
		if(number < 2)
		{
			isPrime = false;
		}
		if(number==2 || number ==3)
		{
			isPrime = true;
		}
		else
		{
				
			//number divisible by 2 , 3 and multiples of 2 or 3 are also not prime, they are composite.
			if(number%2 == 0 || number%3 ==0)
			{
				isPrime = false;
			}
			else
			{
				isPrime = true;
				// main logic to find the number is prime or not if it cann't be figured out above.
				// check number is divisible by 5 or 7 or not and then see by 11 or 13 then 17 or 19 and so on..
				// if i*i is larger then number then there is no need to check for divisible as it won't happen.
				for(i=5;i*i <= number;i=i+6)
				{
					if(number %i ==0 || number%(i+2)==0)
					{
						isPrime = false;
						break;
					}
					isPrime = true;
				}
								
			}
		}
		if(isPrime)
		{
			System.out.println(number+" is prime");
		}
		else
		{
			System.out.println(number+" is not prime");
		}
	}
}
