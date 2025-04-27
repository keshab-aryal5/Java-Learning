package controlStatement.selection;

import java.util.Scanner;

public class SwitchExercise1 {
public static void main(String[] args) {
//	WAP to calculate +,-, ,/ of two int values using switch.
	Scanner sc = new Scanner(System.in);
	int firstNumber = 0,secondNumber = 0;
	float result=0.0f;
	char op;
	
	System.out.print("Enter your first number: ");
	firstNumber = sc.nextInt();
	
	System.out.print("Select your operaotr: ");
	op = sc.next().trim().charAt(0);
	
	System.out.print("Enter your second number: ");
	secondNumber = sc.nextInt();
	
	switch(op)
	{
	case '+':
		System.out.println("Sum: "+(firstNumber + secondNumber));
		break;
	case '-':
		System.out.println("Difference: "+ (firstNumber - secondNumber));
		break;
	case '*':
		System.out.println("Product: "+(firstNumber * secondNumber));
		break;
	case '/':
		if(secondNumber == 0)
		{
			System.out.println("Cann perform division when second number is zero.");
			break;
		}
		System.out.println("Result: "+(firstNumber/secondNumber));
		break;
	default:
		System.out.println("Invalid Operator choosen");			
		
	}

	
	
}
}
