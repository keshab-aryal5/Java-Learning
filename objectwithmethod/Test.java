package objectwithmethod;

public class Test {
	public static void main(String[] args)
	{
		Product p = new Product();
		p.setId(8789);
		p.setName("Mobile");
		p.setPrice(80000);
		p.setCompany("Samsung");
		
		Test t = new Test();
		t.printProduct(p);
		Product p1 = t.getProudutcData();
		
		
		// Array operation return type and paramters.
		//parameter array of object
		Product[] allProduct = new Product[] {p,p1};
		t.printAllProduct(allProduct);
		
		Product[] returnedProduct = t.getAllProductData();
		
		
	}
	void printProduct(Product p)
	{
		System.out.println("Id = "+p.getId());
		System.out.println("Name = "+p.getName());
		System.out.println("Price = "+p.getPrice());
		System.out.println("Comapny = "+p.getCompany());
	}
	
	//object as return type
	Product getProudutcData()
	{
		Product p = new Product();
		p.setId(8788);
		p.setName("Laptop");
		p.setPrice(120000);
		p.setCompany("Dell");
		return p;
	}
	//array of object as argumnet
	void printAllProduct(Product[] productArray)
	{
		for(int i=0;i<productArray.length;i++)
		{
			System.out.println("Details of product "+(i+1));
			System.out.println("Product Id: "+productArray[i].getId());
			System.out.println("Product name: "+productArray[i].getName());
			System.out.println("Product price: "+productArray[i].getPrice());
			System.out.println("Product company: "+productArray[i].getCompany());
			System.out.println("\n\n");
		}
	}
	
	//array of object as return type
	Product[] getAllProductData()
	{
		Product p = new Product();
		p.setId(8789);
		p.setName("Mobile");
		p.setPrice(80000);
		p.setCompany("Samsung");
		
		Product p1 = new Product();
		p1.setId(8788);
		p1.setName("Laptop");
		p1.setPrice(120000);
		p1.setCompany("Dell");
		
		
		Product[] allProduct = new Product[] {p,p1};
		return allProduct;
	}

}
