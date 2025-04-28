package methods;

public class MethodTest {
public static void main(String[] args) {
//	sum();
//	area();
//	printTable(5);
	System.out.println(getSumOf1To100());
}
/*
 * Types
 * 1. No return type with no parameters
 */
	static void sum()
	{
		int x = 4545;
		int y = 8778;
		int s = x+y;
		System.out.println(s);
	}
	
	// find area using methods.
	static void area()
	{
		int length = 4;
		int breadth = 5;
		int area = length * breadth;
		System.out.println(area);
	}
	
	//2. no return types with parameters.
	static void printTable(int n)
	{
		System.out.println("Multiplication table of "+n+" :");
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
	
	//3. return type with no parameters.
		static int getSumOf1To100()
		{
			int sum = 0;
			for(int i=1;i<=100;i++)
			{
				sum += i;
			}
			return sum;
		}
		
	//4. return type with parameters.
		static int getSmallest(int a, int b)
		{
			return a>b?a:b;
			
		}

}
 