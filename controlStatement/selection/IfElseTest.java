package controlStatement.selection;

public class IfElseTest {
	/*
	 * ----------------------- if-else
	 * # use to implement exactly two conditions.
	 * 
	 * syntax:
	 * 	if(condition)
	 * {
	 * 		//code to execute if the condition evaluates true
	 * }
	 * else
	 * {
	 * 	//code to execute if the condition evaluates to false
	 * }
	 */
	
	public static void main(String[] args) {
		//program to check if the condition is even or false.
		int n = 34545;
		if(n%2 == 0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
	}
}
