package methods.exercise;

public class Question1 {
	static int getArea(int length,int breadth)
	{
		int area = length*breadth;
		return area;
	}
	static void volume(int area,int height)
	{
		int volume = area*height;
		System.out.println("volume is "+volume);
		
	}
	public static void main(String[] args) {
		int length = 5;
		int breadth = 10;
		int height = 15;
		int area = getArea(length,breadth);
		System.out.println("The area is: "+area);
		volume(area,height);
	}
}
