package aggregation;

public class Test {
	public static void main(String[] args) {
		Car c = new Car();
		c.setColor("Blue");
		c.setPrice(9000000);
		c.setModel("MY700");
		
		Employee emp = new Employee();  
		emp.setId(5655);
		emp.setName("Suman KC");
		emp.setCompany("CG");
		emp.setSalary(500000);
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Company = "+emp.getCompany());
		System.out.println("Salary = "+emp.getSalary());
		
		System.out.println("--------------------------car info------------------------------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		
		
	}
}

