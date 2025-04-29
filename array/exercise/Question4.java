package array.exercise;

public class Question4 {
	static int countEven(int l, int r)
	{
		if(l>r)
		{
			l = l+r;
			r = l-r;
			l = l-r;
		}
		int n = l+r-1;
		int count = n/2;
		if(n%2==1 && (l%2==1 || r%2==1))
		{
			count++;
			count = n-count;
		}
		return count;
	}
public static void main(String[] args) {
	//4.WAP to store and print even numbers from 1 to 100. 
	int lowerRange = 1;
	int higherRange = 100;
	int[] evenNumber = new int[countEven(1,100)];
	int index = 0;
	for(int i=lowerRange;i<=higherRange;i++)
	{
		if(i%2==0)
		{
			evenNumber[index++] = i; 
		}
	}
	System.out.println(evenNumber.length);
	System.out.println("Even numbers from "+lowerRange+" to "+higherRange+" is as follow: ");
	for(int i=0;i<evenNumber.length;i++)
	{
		System.out.print(evenNumber[i]+", ");
	}
	
}
}
