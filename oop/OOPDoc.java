package oop;

public class OOPDoc {
	public static void main(String[] args) {
		Book b = new Book();
		b.name = "Mathematics";
		b.author = "Mr. xyz";
		b.price = 420;
		b.pages = 665;
		b.printBook();
				
		
		Rectangle r1 = new Rectangle();
		r1.length = 5.5f;
		r1.breadth = 8.0f;
		
		r1.printArea();
		
	}
}
