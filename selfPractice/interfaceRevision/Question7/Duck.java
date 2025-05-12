package selfPractice.interfaceRevision.Question7;

public class Duck implements Swimmable,Flyable{
	@Override
	public void move()
	{
		Flyable.super.move();
		Swimmable.super.move();
		System.out.println("Duck can both swim as well as fly.");
	}
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.move();
	}
}
