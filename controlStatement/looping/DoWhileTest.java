package controlStatement.looping;

public class DoWhileTest {
	public static void main(String[] args) {
		/*
		 * ************************************ do -while ***********************************
		 * do
		 * {
		 *  // statement
		 *  updation..
		 *  }while(condition);
		 */
		int i=1;
		int number = 7;
		do
		{
			System.out.println(number + "X" + i +" = "+number*i);
			i++;
		}while(i<=10);
		System.out.println();
	}
}
