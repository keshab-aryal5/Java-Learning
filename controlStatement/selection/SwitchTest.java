package controlStatement.selection;

public class SwitchTest {
	public static void main(String[] args) {
		int day = 5;
		
				switch(day)
				{
				case 1:
					System.out.println("Sunday");
					break;
				case 2:
					System.out.println("Monday");
					break;
				case 3:
					System.out.println("Tuesday");
					break;
				case 4:
					System.out.println("Wednesday");
					break;
				case 5:
					System.out.println("Thursday");
					break;
				case 6:
					System.out.println("Friday");
					break;
				case 7:
					System.out.println("Saturday");
					break;
				default:
					System.out.println("Invalid day");
				}
		
		
				// Alternative....
		
		String dayName = switch(day) {
		case 1 -> "Sunday";
		case 2 -> "Monday";
		case 3 -> "Tuesday";
		case 4 -> "Wednesday";
		case 5 -> "Thursday";
		case 6 -> "Friday";
		default -> "Saturday";
		};
		
		System.out.println(dayName);
		
		

	}
}
/*
 *  ----------------------- Switch ------------------
 *  #Syntax:
 *  
 *  switch(variable)
 *  {
 *  case 1:
 *  // satements
 *  break;
 *  case 2:
 *  //statements
 *  break;
 *  .
 *  .
 *  .
 *  .
 *  .
 *  .
 *  default:
 *  break;
 *  
 *  
 *  
 *  2. alternative syntax form java 12 and above.
 *  
 *  dataType variable = switch(variable)
 *  {
 *  case 1 -> value1;
 *  case 2 -> value 2;
 *  ...
 *  ..
 *  .
 *  default --> defaultValue
 */