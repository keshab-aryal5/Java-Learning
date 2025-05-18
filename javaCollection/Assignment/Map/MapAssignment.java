package javaCollection.Assignment.Map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MapAssignment {
	public static void main(String[] args) {
		Map<String,List<Integer> > subjectMarks = new HashMap<>();
		String[] subjects = new String[] {"Math","Computer","Nepali","Science"};
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int mark = 0;
		for(String subject: subjects)     
		{
			List<Integer> markList = new LinkedList<>();
			System.out.println("Enter the marks for "+subject);
			total = 0;
			for(int i = 1;i<=4;i++)
			{
				System.out.print("Enter the marks in terminal "+i+" : ");
				mark = sc.nextInt();
				markList.add(mark);
				total += mark;
			}
			markList.add(total);
			subjectMarks.put(subject, markList);
			System.out.println("\n\n");
		}
		System.out.println("Subject\t\tt1\t\tt2\t\tt3\t\tt4\t\ttotal\t\tremarks");
		for(String sub: subjects)
		{
			List<Integer> marks = subjectMarks.get(sub);
			System.out.println(sub+"\t\t"+marks.get(0)+"\t\t"+marks.get(1)+"\t\t"+marks.get(2)+"\t\t"+marks.get(3)+"\t\t"+marks.get(4)+"\t\t"+(marks.get(4)>=75?"pass":"fail"));
			
		}
		
	}
}
