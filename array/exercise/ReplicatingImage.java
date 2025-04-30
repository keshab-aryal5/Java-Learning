package array.exercise;

import java.util.Scanner;

public class ReplicatingImage {
	public static void main(String[] args) {
		int noOfStudent = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		noOfStudent = sc.nextInt();
		int i=0,j=0;
		float sum = 0.0f,percentage = 0.0f;
		float[][] student = new float[noOfStudent][7];
		
		for(i=0;i<student.length;i++)
		{
			System.out.println("Enter the marks of stduent"+(i+1));
			sum = 0.0f;
			for(j=0;j<(student[i].length-2);j++)
			{
				System.out.print("Marks in subject"+(j+1)+": ");
				student[i][j] = sc.nextFloat();
				sum += student[i][j];
			}
			student[i][j++] = sum;
			percentage = ((float)(sum)/500)*100;
			student[i][j] = percentage;
		}
		
		for(i=0;i<student.length;i++)
		{
			System.out.println("Details of studnet"+(i+1)+": ");
			System.out.println("Total marks: "+student[i][5]);
			System.out.println("Percentage: "+student[i][6]+"%");
		}
	}
}
