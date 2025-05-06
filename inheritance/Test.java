package inheritance;

public class Test {
	public static void main(String[] args) {
		Programmer p = new Programmer();
		p.id = 3434;
		p.name = "Anup Karki";
		p.company = "Google";
		p.bonus = 200000;
		p.progLang = "Java";
		p.project = "G-Earth";
		
		p.print();
	}
}
