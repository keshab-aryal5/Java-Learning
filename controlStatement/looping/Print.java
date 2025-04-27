package controlStatement.looping;

public class Print {
	public static void main(String[] args) {
		int sum =0;
		int evenSum = 0;
		int oddSum = 0;
		for(int i =1;i<=100;i++)
		{
			if(i%2==0)
			{
				evenSum += i;
			}
			else {
				oddSum += i;
			}
			sum += i;
		}
		System.out.println("Total Sum = "+sum);
		System.out.println("Even Sum = "+evenSum);
		System.out.println("Odd Sum = "+oddSum);
	}
}
