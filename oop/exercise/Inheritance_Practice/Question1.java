package oop.exercise.Inheritance_Practice;
//Create a class with a method that prints "This is parent class" and its subclass with another
//method that prints "This is child class". Now, create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

class parentClass
{
	public void printParentInfo()
	{
		System.out.println("This is parent class");
	}
}

class childClass extends parentClass
{
	public void printChildInfo()
	{
		System.out.println("This is a child class");
	}
}

public class Question1 {

	public static void main(String[] args) {
		parentClass pc = new parentClass();
		childClass cc = new childClass();
		
//		method of parent class by object of parent class
		pc.printParentInfo();
		
//		method of child class by object of child class
		cc.printChildInfo();
		
//		method of parent class by object of child class
		cc.printParentInfo();
	}
}
