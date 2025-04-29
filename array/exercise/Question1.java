package array.exercise;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		////1.WAP to store and print total,avg price of 10 books. 
		
		Scanner sc = new Scanner(System.in);
		int noOfBooks = 10;
		int[] bookPrice = new int[noOfBooks];
		int totalPrice = 0;
		float averagePrice = 0.0f;
		
		for(int i=0;i<bookPrice.length;i++)
		{
			System.out.print("Enter the price of book"+(i+1)+": Rs.");
			bookPrice[i] = sc.nextInt();
			totalPrice += bookPrice[i];
		}
		averagePrice = (float)totalPrice/10;
		System.out.println("The total price of book is: Rs."+totalPrice);
		System.out.println("The average price of book is: Rs."+averagePrice);
	}
}
