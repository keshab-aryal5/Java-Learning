package oop.encapsulation;

public class Test {
	public static void main(String[] args) {
		Customer ct = new Customer();
		
		ct.setId(23);
		ct.setAge(23);
		ct.setName("keshab");
		ct.setCity("Kathmandu");
		System.out.println("Id = "+ct.getId());
		System.out.println("Name = "+ct.getName());
		System.out.println("Age = "+ct.getAge());
		System.out.println("City = "+ct.getCity());
	}
}
