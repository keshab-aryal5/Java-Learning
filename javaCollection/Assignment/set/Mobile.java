package javaCollection.Assignment.set;

import java.util.Objects;

public class Mobile{
	private String name;
	private String model;
	private double  price;
	  public Mobile(String name, String model, double price) {
	        this.name = name;
	        this.model = model;
	        this.price = price;
	    }

	
	 @Override
public String toString() {
	return "\nMobile [name=" + name + ", model=" + model + ", price=" + price + "]\n";
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
	        Mobile other = (Mobile) obj;
	        
	        return Double.compare(price, other.price) == 0 &&
	        		Objects.equals(name, other.name) &&
	        		Objects.equals(model,other.model);
	    }
	 
	 @Override
	 public int hashCode()
	 {
		 return Objects.hash(name,model,price);
	 }
	
}
