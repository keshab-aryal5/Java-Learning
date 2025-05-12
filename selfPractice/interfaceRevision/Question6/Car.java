package selfPractice.interfaceRevision.Question6;

public class Car implements Vehicle {

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving the car...");
	}
	
	 public static void main(String[] args) {
			Vehicle car = new Car();
			car.drive();
			car.start();
			Vehicle.serviceInfo();
	}
	
}
