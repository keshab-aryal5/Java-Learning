package controlStatement.selection;

import java.util.Scanner;

public class NestedIfElseTest {
	public static void main(String[] args) {
		String naltionality="";
		int age = 0;
		char haveVoterId = 'n';
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your nationality: ");
		naltionality = sc.next().trim().toLowerCase();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		
		System.out.print("Do you have voterCard? y/n: ");
		haveVoterId = sc.next().trim().toLowerCase().charAt(0);
		if(naltionality.equals("nepali")) {
			if(age >= 18)
			{
				if(haveVoterId == 'y')
				{
					System.out.println("You can vote");
				}
				else
				{
					System.out.println("You don't have voter ID");
				}
			}
			else
			{
				System.out.println("You're under age");
			}
		}
		else
		{
			System.out.println("Invalid citizen");
		}
	}
}

/*
 * 
 * ----------------- Nested if-else -----------------------------
 *#syntax:
 *	if(condition1)
 *	{
 * 		if(condition2)
 * 			{ 
 * 			if(condition 3)
 * 				{
 * 				//code to execute if all conditions 1,2 and 3 are evaluated as true.
 * 				}
 * 			else
 * 			{
 * 				//code to execute if condition1 and condition2 are true but condition 3 is false
 * 			}
 * 			}
 * 		else
 * 			{
 * 				//code to execute if condition 1 is true but conditioon2 is false
 * 			}
 * 	}
 * else
 * {
 *  	//code to execute if condition1 is false.
 *  } 
 *  	
 */