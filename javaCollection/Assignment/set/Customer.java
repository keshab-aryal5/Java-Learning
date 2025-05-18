package javaCollection.Assignment.set;

import java.util.Objects;

public class Customer {
	private String name;
	private double totalBill;
	private double tender;
	private double returnAmount;
	@Override
	public String toString() {
		return "\nCustomer [name=" + name + ", totalBill=" + totalBill + ", tender=" + tender + ", returnAmount="
				+ returnAmount + "]\n";
	}
	public Customer(String name, double totalBill, double tender) {
		super();
		this.name = name;
		this.totalBill = totalBill;
		this.tender = tender;
		this.returnAmount = totalBill-tender;
	}
	@Override
    public boolean equals(Object obj) {
        // Check if the same reference
        if (this == obj)
            return true;
        // Check for null and ensure the same class
        if (obj == null || getClass() != obj.getClass())
            return false;
        // Cast and compare fields
        Customer other = (Customer) obj;
        
        return Double.compare(totalBill, other.totalBill) == 0 &&
        		Objects.equals(name, other.name) &&
        		Double.compare(tender,other.tender) ==0;
    }
 
 @Override
 public int hashCode()
 {
	 return Objects.hash(name,totalBill,tender,returnAmount);
 }
}
