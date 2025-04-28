package methods.exercise;

import java.util.Scanner;

public class Question2 {
	static float SI(int principle,int time,int rate)
	{
		return (float) (principle*time*rate)/100;
	}
	static float amount(int principle,float si)
	{
		return principle+si;
	}
	public static void main(String[] args) {
		int principle = 0;
		int time = 0;
		int rate = 0;
		float si=0.0f;
		float amt = 0.0f;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pricipal amount: ");
		principle = sc.nextInt();
		
		System.out.print("Enter the time period: ");
		time = sc.nextInt();
		
		System.out.println("Enter the rate: ");
		rate = sc.nextInt();
		
		si = SI(principle,time,rate);
		amt = amount(principle,si);
		
		
		System.out.println("Your simple interest is: "+si);
		System.out.println("You amount is: "+amt);
	}

}
