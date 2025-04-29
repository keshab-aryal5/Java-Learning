package array;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		//store and print age of 5 students..
		//create array
		
		// write data in array
		
		// read data from array.
		
		int[] age = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<age.length;i++)
		{
			System.out.print("Enter the age of student"+(i+1)+" ");
			age[i] = sc.nextInt();
		}
		
		System.out.println("Age of stduents are as follow: ");
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Age of std"+(i+1) + " = "+age[i]);
		}
	}
}
