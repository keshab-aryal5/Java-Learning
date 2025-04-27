package controlStatement.selection;

public class LadderTest {
	public static void main(String[] args) {
		int marks = 79;
		if(marks >= 80)
		{
			System.out.println("Distinction");
		}
		else if(marks>=70)
		{
			System.out.println("First");
		}
		else if(marks>=60)
		{
			System.out.println("Second");
		}
		else if(marks>=50)
		{
			System.out.println("Third");
		}
		else if(marks>=33)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}

/*
 *  ----------------------------------- else if -----------------------------
 * # syntax:
 * if(condition 1)
 * {
 * code to execute if condition1 evaluates to true
 * }
 * else if(condition 2)
 * {
 *   code to execute if condition2 evaluates to true
 *   }
 *   else if(condition 3)
 *   {
 *   code to execute if condition3 evaluates to true.
 *   }
 *   ......
 *   else
 *   {
 *   code to execute of none of the condition evaluates to true.
 *   }
 *   
 * 
 * 
 */
