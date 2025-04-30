package array;

import java.util.Arrays;

public class ArrayWithMethod {
	//array as an argument method
	static void findSum(int values[])
	{
		int sum = 0;
		for(int x:values)
		{
			sum+=x;
		}
		System.out.println("Total = "+sum);
	}
	
	//array as return type method
	static int[] getOddNumbersFrom1To100()
	{
		int[] oddNums = new int[50];
		int j = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%2 !=0)
			{
				oddNums[j++] = i;
			}
			
		}
		return oddNums;
	}
	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5,6};
		findSum(array);
		int oddNums[] = getOddNumbersFrom1To100();
		System.out.println(Arrays.toString(oddNums));
	}
}
