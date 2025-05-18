package javaCollection.Assignment.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		//creating list of of Book
		
		List<Book> bookList  = new ArrayList<>();
		bookList.add(new Book("Java","Moris",545));
		bookList.add(new Book("C++","Dennis Richie",999));
		bookList.add(new Book("Mathematics","Keshab",569));
		
		System.out.println("Books: ");
		for(Book b:bookList)
		{
			System.out.println(b);
		}
		
		System.out.println("\n\n***********************************\n\n");
		//creating list of Dog
		List<Dog> dogList = List.of(new Dog("Jerman Shephard","Male",15),new Dog("Kalea","Male",5),new Dog("Sete","Male",4));
		
		System.out.println("Dogs: ");
		for(Dog d: dogList)
		{
			System.out.println(d);
		}
		System.out.println("\n\n*****************************************\n\n");
		
		
//		creating list of student 
		
		List<Student> studentList = new LinkedList<>();
		studentList.add(new Student(1,"keshab",23));
		studentList.add(new Student(4,"rakesh",23));
		studentList.add(new Student(2,"Binish",21));
		studentList.add(new Student(3,"alan",23));
		
		System.out.println("Student");
		for(int i=0;i<studentList.size();i++)
		{
			System.out.println(studentList.get(i));
		}
//		studentList.
	}
}
