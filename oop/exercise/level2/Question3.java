package oop.exercise.level2;

import java.util.Scanner;

//3. 
//The Matrix class has methods for each of the following: 
//1 - get the number of rows 
//2 - get the number of columns 
//3 - set the elements of the matrix at given position (i,j) 
//4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed. 
//5 - multiplying the two matrices

public class Question3 {
	public static void main(String[] args) {
		
		//creating a new matrix class with matrix size 2 by 2
		Matrix3 m1 = new Matrix3(2,2);
		//add elements to the matrix.
		m1.addElement();
		
		//creating a new matrix 
		Matrix3 m2 = new Matrix3(2,2);
		//add elements to the matrix.
		m2.addElement();
		
		//set elements of any index of matrix m1
		m1.setElement();
		
		//set elements of any index of matrix m2.
		m2.setElement();
		
		//adding matrix m1 and m2 
		Matrix3.addMatrix(m1, m2);
		
		//multiplying  matrix:
		Matrix3.productMatrix(m1,m2);
		
		
		
	}
	
}


class Matrix3{
	int rows;
	int columns;
	int[][] Matrix;
	Scanner sc = new Scanner(System.in);
	
	public Matrix3(int rows,int columns)
	{
		this.rows = rows;
		this.columns = columns;
		Matrix = new int[rows][columns];
		
		System.out.println("Successfully created  a new Matrix of size "+this.rows+"X"+this.columns);
	}
	public void addElement()
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print("Enter the element for Matrix["+(i+1)+"]["+(j+1)+"]: ");
				Matrix[i][j] = sc.nextInt();
			}
		}
	}
	public int getRows()
	{
		return this.rows;
	}
	public int getColumns()
	{
		return this.columns;
	}
	public void setElement()
	{
		int i,j;
		System.out.println("Setting element");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the row number: ");
		i = sc.nextInt();
		System.out.print("Enter the column number: ");
		j = sc.nextInt();
		if(i> (this.rows-1) || i<0)
		{
			System.out.println("Enter the row number from 0 to "+(this.rows-1)+" only");
		}
		else if(j> (this.columns-1) || j<0)
		{
			System.out.println("Enter the column number from 0 to "+(this.columns-1)+" only");
		}
		else
		{
			System.out.println("Enter the element for row "+i+" and column "+j);
			Matrix[i][j] = sc.nextInt();
			
			System.out.println(Matrix[i][j]+" has been successfully inserted at Matrix["+i+"]"+"["+j+"]");
		}
	}
	public void getElements()
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.println("Matrix["+(i+1)+"]"+"["+(j+1)+"]"+" = "+Matrix[i][j]);
			}
		}
	}
	
	public static void addMatrix(Matrix3 m1,Matrix3 m2)
	{
		if(m1.rows == m2.rows || m2.columns == m1.columns)
		{
			System.out.println("Matrix Addition");
			for(int i=0;i<m1.rows;i++)
			{
				for(int j=0;j<m1.columns;j++)
				{
					System.out.println(m1.Matrix[i][j]+" + "+m2.Matrix[i][j]+" = "+(m1.Matrix[i][j]+m2.Matrix[i][j]));
				}
			}
		}
		else
		{
			System.out.println("These matrices cann't be added");
		}
			
	}
	
	public static void productMatrix(Matrix3 m1,Matrix3 m2)
	{
		if(m1.columns != m2.rows)
		{
			System.out.println("These matrices cann't be multiplied");
		}
		else
		{
			System.out.println("Matrix multiplication..");
			Matrix3 tempMatrix = new Matrix3(m1.columns,m2.rows);
			for (int i = 0; i < m1.rows; i++) {
			    for (int j = 0; j < m1.columns; j++) {
			        tempMatrix.Matrix[i][j] = 0;
			        for (int k = 0; k < m1.columns; k++) {
			            tempMatrix.Matrix[i][j] += m1.Matrix[i][k] * m2.Matrix[k][j];
			        }
			    }
			}
			tempMatrix.getElements();
		}
	}
}