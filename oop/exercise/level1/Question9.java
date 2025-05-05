package oop.exercise.level1;

import java.util.Scanner;

//Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with 
//separate methods for each operation whose real and imaginary parts are entered by user. 
public class Question9 {
	public static void main(String[] args) {
		int real,img;
		Complex c1,c2;
		String operation;
		Scanner sc = new Scanner(System.in);
		
		//creating first complex number
		System.out.print("Enter the real number: ");
		real = sc.nextInt();
		
		System.out.print("Enter the imaginary: ");
		img = sc.nextInt();
		
		c1 = new Complex(real,img);
		System.out.println("Your first complex number is: "+c1);
		
		//creating second number
		System.out.print("Enter the real number: ");
		real = sc.nextInt();
		
		System.out.print("Enter the imaginary: ");
		img = sc.nextInt();
		
		c2 = new Complex(real,img);
		System.out.println("Your second complex number is: "+c2);
		
		
		
		do
		{
			System.out.print("What operation do you want to perform? sum/difference/product/exit: ");
			operation = sc.next();
			
			if(operation.equalsIgnoreCase("sum"))
			{
				System.out.println("The sum of "+c1+" and "+c2+" is "+Complex.sum(c1,c2));
			}
			else if(operation.equalsIgnoreCase("product"))
			{
				System.out.println("The produt of "+c1+" and "+c2+" is "+Complex.product(c1,c2));
			}
			else if(operation.equalsIgnoreCase("difference"))
			{
				System.out.println("The difference of "+c1+" and "+c2+" is "+Complex.difference(c1,c2));
			}
			else if(operation.equalsIgnoreCase("exit"))
			{
				System.out.println("Bye Bye");
			}
			else
			{
				System.out.println("Please enter a valid operation");
			}
			
		}while(!operation.equalsIgnoreCase("exit"));
		
	}
}

class Complex
{
	int real;
	int img;
	
	public Complex(int r, int i)
	{
		this.real = r;
		this.img = i;
	}
	
	public static Complex sum(Complex c1,Complex c2)
	{
		return new Complex(c1.real+c2.real,c1.img+c2.img);
	}
	public static Complex difference(Complex c1, Complex c2)
	{
		
		return new Complex(c1.real-c2.real,c1.img-c2.img);
	}
	
	public static Complex product(Complex c1, Complex c2)
	{
			
		return new Complex(c1.real*c2.real,c1.img*c2.img);
	}
	@Override
	public String toString()
	{
		return this.real+" + "+this.img+"i";
	}
}
