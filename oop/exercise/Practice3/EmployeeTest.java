package oop.exercise.Practice3;

import oop.exercise.Practice3.com.example.domain.Admin;
import oop.exercise.Practice3.com.example.domain.Director;
import oop.exercise.Practice3.com.example.domain.Engineer;

public class EmployeeTest {
	public static void main(String[] args) {
		Engineer eng1 = new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
		Manager mg1 = new Manager(207,"Barbara Johnson","054-12-2367",109501.36,"US Marketing");
		Admin ad1 = new Admin(304,"Bill Munroe","108-23-6509",75002.34);
		Director dir1 = new Director(12,"Susan Wheeler","099-45-2340",120567.36,"Global Marketing",1000000.00);
		
		eng1.printEmployee();
		mg1.printEmployee();
		ad1.printEmployee();
		dir1.printEmployee();
		
		eng1.raiseSalary(52.45);
		eng1.printEmployee();
		
		mg1.setName("monsterKaley");
		mg1.printEmployee();
		
		
	}
}
