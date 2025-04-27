package controlStatement.selection;
import java.util.Scanner;
public class SwitchExercise2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String position;
		float totalSalary;
		
		System.out.print("Enter the position of employee ");
		position = sc.next().trim().toLowerCase();
		
		totalSalary = switch(position)
				{
		case "md" -> 230000 + (0.2f * 230000);
		case "ceo" -> 250000 + (25.79f/100)*250000;
		case "manager" -> 176000 + (0.16f*176000);
		case "helper" -> 145900 + (0.09f * 145900);
		default -> 0.0f;
				};
		if(totalSalary == 0.0f)
		{
			System.out.println("Unknown employee");
		}
		System.out.println("Total salary of "+position+" is "+totalSalary);
	}
}
/*
Q1>  WAP to calculate total salary of following post :             
                                                                   
            post         basic salary      bonus   total salary    
            ---------     --------------    -------  --------------
            MD                 230000         20%         ?        
            CEO                250000         25.79%      ?        
            MANAGER            176000         16 %        ?        
            HELPER             145900         9%          ?        
        ---------------------------------------------------        
                                                                   

*/