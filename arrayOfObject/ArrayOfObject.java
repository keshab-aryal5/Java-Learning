package arrayOfObject;

import java.util.Scanner;

public class ArrayOfObject {
	public static void main(String[] args) {
		Student std[] = new Student[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<std.length;i++)
		{
			std[i] = new Student();
			
			System.out.print("Enter id: ");
			std[i].setId(sc.nextInt());
			
			System.out.print("Enter fname: ");
			std[i].setFname(sc.next());
			
			System.out.print("Enter last name: ");
			std[i].setLname(sc.next());
			
			System.out.print("Enter age: ");
			std[i].setAge(sc.nextInt());
			
			System.out.print("Enter College: ");
			std[i].setCollege(sc.nextLine());
		}
		
		for(Student st:std)
		{
			System.out.println(st);
		}
	}
}
