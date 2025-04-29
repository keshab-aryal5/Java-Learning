package array.exercise;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		//2.WAP to store and  print name of 6 cities. 
		int noOfCities = 6;
		String[] cities = new String[noOfCities];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<cities.length;i++)
		{
			System.out.print("Enter the name of city"+(i+1)+": ");
			cities[i] = sc.next();
		}
		
		System.out.println("Following are the name of cities you entered: ");
		for(int i=0;i<cities.length;i++)
		{
			System.out.println("City"+(i+1)+": "+cities[i]);
		}
	}
}
