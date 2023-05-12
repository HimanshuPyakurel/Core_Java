package Control.program;
import java.util.Scanner;

public class CalculateTotalSalary {

	/*Calculate Total Salary for following parts:
	 * 
	 * Post     Basic salary     bonus     total salary
	 * ....     ............     .....     ............
	 * MD        453000          17.89%       ?
	 * CEO       324770          12%          ?
	 * MANAGER   25000           23.77%       ?
	 * HELPER    189000          9.66%        ?
	 * 
	 */
	
	public static void main(String[] args) {
		
	String post=""; 
	double totalSalary;
	double basicSalary = 0;
	double bonusPercentage = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter post:");
	String message = sc.nextLine();
	
	switch(message.toUpperCase()) {
	 case "MD":
         basicSalary = 453000;
         bonusPercentage = 0.1789;
         post = "MD";
         break;
         
     case "CEO":
         basicSalary = 324770;
         bonusPercentage = 0.12;
         post = "CEO";
         break;
         
     case "MANAGER":
         basicSalary = 25000;
         bonusPercentage = 0.2377;
         post = "MANAGER";
         break;
         
     case "HELPER":
         basicSalary = 189000;
         bonusPercentage = 0.0966;
         post = "HELPER";
         break;
         
     default:
         System.out.println("Invalid input!");
         System.exit(0);
 }

    double bonus = basicSalary * bonusPercentage;
    totalSalary = basicSalary + bonus;
    
    System.out.println("Post:"+post);
    System.out.println("Basic Salary:"+basicSalary);
    System.out.println("Bonus Percentage:"+bonusPercentage*100);
    System.out.println("Total Salary:"+totalSalary);
   
	
}
	
}
