package array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDArray {
	public static void main(String[] args) {
//		creating array 
		int mat[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);
		
//		insert data in array 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int[] x:mat)
		{
			for(int y:x)
			{
				System.out.println(y);
			}
		}
		
		for(int[]x:mat)
		{
			System.out.println(Arrays.toString(x));
		}
		//printing out the array
		System.out.println(Arrays.toString(mat));
	}
}
