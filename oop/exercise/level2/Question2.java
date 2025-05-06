package oop.exercise.level2;

import java.util.Scanner;

//2. 
//Create a class called 'Matrix' containing constructor that initializes the number of rows and number of 
//columns of a new Matrix object. The Matrix class has the following information: 
//1 - number of rows of matrix 
//2 - number of columns of matrix 
//3 - elements of matrix in the form of 2D array

public class Question2 {
	public static void main(String[] args) {
		int rows,column=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		column = sc.nextInt();
		Matrix m1 = new Matrix(rows,column);
		m1.setMatrixElement();
		m1.getMatrixElement();
	}
	
}

class Matrix
{
	int rows;
	int columns;
	int[][] array;
	
	public Matrix(int rows,int columns)
	{
		this.rows = rows;
		this.columns = columns;
		array = new int[rows][columns];
	}
	public void setMatrixElement()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print("Enter the element at row "+(i+1)+" column "+(j+1)+": ");
				this.array[i][j] = sc.nextInt();
			}
		}
	}
	public void getMatrixElement()
	{
		System.out.println("Elements of matrix are as follow: ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Matrix ["+(i+1)+"]"+"["+(j+1)+"] ="+array[i][j]);
			}
		}
	}
}
