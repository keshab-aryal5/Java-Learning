package array;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
		int[] values = {3,4334,343,4,3,252,35,849,54,93};
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 700);
		System.out.println(Arrays.toString(values));
		
		Arrays.fill(values, 0,5,50);
		System.out.println(Arrays.toString(values));
		
		int[] newArray = Arrays.copyOf(values, 8);
		
		System.out.println(Arrays.toString(newArray));
		
		int[] arr = Arrays.copyOfRange(values,5,12);
		System.out.println(Arrays.toString(arr));
}
}