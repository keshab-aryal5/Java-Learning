package controlStatement.looping;

public class WhileTest {
/*
 * *********************************While loop ***********************************
 * #syntax
 * 			while(condition)
 * 			{
 * 				//statements
 * 				updation;
 * 			}
 */
	public static void main(String[] args) {
		int fact = 1;
		int number = 5;
		while(number>1)
		{
			fact *= number;
			number --;
		}
		System.out.println(fact);
	}
}
