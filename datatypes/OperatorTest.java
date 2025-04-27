package datatypes;

public class OperatorTest {
	public static void main(String[] args) {
		/*
		 * pre-increment and post-increment....
		 * 
		 */
		int a= 10;
		System.out.println(a++);
		System.out.println(a = a+5);
		System.out.println(++a);
		System.out.println(++a + a++);
		System.out.println(a);
	}
}
