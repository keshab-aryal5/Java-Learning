package javaCollection.Assignment.List;

public class Book {
	private String name;
	private String authorName;
	private int price;
	
	public Book(String name,String authorName,int price)
	{
		this.name = name;
		this.authorName = authorName;
		this.price = price;
	}
	
	@Override
	public String toString()
	{
		return "Book [name = "+this.name+" author name = "+this.authorName+" price = "+this.price+" ]";
	}
}
