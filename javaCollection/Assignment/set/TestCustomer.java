package javaCollection.Assignment.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestCustomer {
	public static void main(String[] args) {
		Set<Customer> customerSet = new LinkedHashSet<>();
		
		customerSet.add(new Customer("Keshab Aryal",1520,2000));
		customerSet.add(new Customer("Keshab Aryal",1520,2000));
		customerSet.add(new Customer("Ashok Aryal",1720,2000));
		
		System.out.println(customerSet);
	}
}
