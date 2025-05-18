package javaCollection.Assignment.set;

import java.util.Objects;

public class Cow {
	private String name;
	private int age;
	private double  milkQuantity;


	public Cow(String name, int age, double milkQuantity) {
		
		this.name = name;
		this.age = age;
		this.milkQuantity = milkQuantity;
	}

	@Override
	public String toString() {
		return "\nCow [name=" + name + ", age=" + age + ", milkQuantity=" + milkQuantity + "]\n";
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
	        Cow other = (Cow) obj;
	        
	        return Double.compare(milkQuantity, other.milkQuantity) == 0 &&
	        		Objects.equals(name, other.name) &&
	        		Integer.compare(age,other.age)==0;
	    }
	 
	 @Override
	 public int hashCode()
	 {
		 return Objects.hash(name,age,milkQuantity);
	 }
	
}
