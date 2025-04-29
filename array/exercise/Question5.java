package array.exercise;

public class Question5 {
	public static void main(String[] args) {
		/*5.
		*     subject         Marks
		*     -------      ----------
		*     Math 			99
		*     English			80
		*     Nepali          87
		*     Computer        88
		*     Science         69
		*  ----------------------------
		*      Total          ?
		*      Percent        ? %
		*  -----------------------------        
		  */
		int[] marks = new int[] {99,80,87,88,69};
		int sum = 0 ;
		float average = 0.0f;
		for(int i=0;i<marks.length;i++)
		{
			sum += marks[i];
		}
		average = (float)sum/marks.length;
		System.out.println("The total marks of student is: "+sum);
		System.out.println("The average marks of student is: "+average);
	}
}
