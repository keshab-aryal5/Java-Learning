package array.exercise;

public class Question3 {
	
	static int findOddNumbers(int l, int r)
	{
		if(l>r)
		{
			l = l+r;
			r = l-r;
			l = l-r;
			
		}
		int n = r - l + 1;
		int count = n/2;
		if((n%2 == 1) && (l%2==1 || r%2 ==1))
		{
	
		count ++;
			
		}
	
		return count;
	}

	public static void main(String[] args) {
		//3.WAP to store and print odd numbers from 1 to 100.
		int lowerLimit = 1;
		int higherLimit = 100;
		int[] oddNumbers = new int[findOddNumbers(lowerLimit,higherLimit)];
		int count = 0;
		for(int i=lowerLimit;i<=higherLimit;i++)
		{
			if(i%2 == 1)
			{
				oddNumbers[count] = i;
				
				System.out.println("Element at index "+count+" is "+i);
				count ++;
			}
		}
		
		System.out.println("Odd numbers between "+lowerLimit+" and "+higherLimit+" are as follow: ");
		for(int i=0;i<oddNumbers.length;i++)
		{
			System.out.print(oddNumbers[i]+",");
		}
	}
}
