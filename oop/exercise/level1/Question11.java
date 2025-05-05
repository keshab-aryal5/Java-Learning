package oop.exercise.level1;
//Add two distances in inch-feet by creating a class named 'AddDistance'. 
public class Question11 {
	public static void main(String[] args) {
		
		//creating two AddDistance instance with different measurements.
		AddDistance d1 = new AddDistance(10,5);
		AddDistance d2 = new AddDistance(11,7);
		
		AddDistance d3 = AddDistance.add(d1,d2);
		System.out.println("First distance: "+d1);
		System.out.println("Second distance: "+d2);
		System.out.println("The sum of these two distances is: "+d3);
	}
}

class AddDistance
{
	int inch;
	int feet;
	
	public AddDistance(int i,int f)
	{
		inch = i;
		feet = f;
	}
	
	public static AddDistance add(AddDistance d1,AddDistance d2)
	{
		int newInch = (d1.inch+d2.inch)%12;
		int newFeet = d1.feet+d2.feet+((d1.inch+d2.inch)/12);	
		return new AddDistance(newInch,newFeet);
	}
	@Override
	public String toString()
	{
		return this.feet+"ft. "+this.inch+"inches";
	}
}
