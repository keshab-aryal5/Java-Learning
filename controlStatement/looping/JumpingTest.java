package controlStatement.looping;

public class JumpingTest {
	public static void main(String[] args) {
		/*
		 * Jumping statement
		 * a. break ---> exit from loop
		 * b. continue ---> skip current iteration
		 * c. return ---> return control to function control
		 * 
		 */
		for(int i=1;i<=10;i++)
		{
			if(i==4 || i== 8)
				continue;
			System.out.println(i);
		}
		System.out.println("End of for loop");
	}
}