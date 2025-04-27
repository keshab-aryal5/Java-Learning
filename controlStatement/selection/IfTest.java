package controlStatement.selection;

public class IfTest {
	public static void main(String[] args) {
		/*
		 * if(condition)
		 * {
		 *  // code to execute if the condition is true
		 *  }
		 */
		int salary = 25000;
		if(salary < 40000)
		{
			salary = salary + 9000;
		}
		System.out.println("Your total salary = "+salary);
	
	}
}
