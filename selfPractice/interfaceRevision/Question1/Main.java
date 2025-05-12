package selfPractice.interfaceRevision.Question1;

public class Main{
	public static void main(String[] args) {
		AnimalService cat = new Cat();
		AnimalService dog = new Dog();
		
		cat.makeSound();
		dog.makeSound();
	}

}
