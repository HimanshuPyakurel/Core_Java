package ArraywithMethod;

import java.util.Scanner;

public class Table {
	
	public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);

        int numStudents = 1;
        int numSubjects = 1;

        String[][] table = new String[numStudents + 1][numSubjects + 4];

        
        // Set the table headers
        table[0][0]= "Students";
        System.out.println();
        for (int i = 1; i <= numSubjects; i++) { 	
            table[0][i] = "Sub" + i;
        }
        	
        table[0][numSubjects + 1] = "Total Marks";
        table[0][numSubjects + 2] = "Percentage";
        table[0][numSubjects + 3] = "Remarks";

        
        // Insert into Table
        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the name of student " + i + ": ");
            table[i][0] = scanner.next();

            int totalMarks = 0;
            for (int j = 1; j <= numSubjects; j++) {
                System.out.print("Enter the marks for subject " + j + " for " + table[i][0] + ": ");
                int marks = scanner.nextInt();
                
                table[i][j] = Integer.toString(marks);

                totalMarks += marks;
     
            }


            // Calculate percentage
            double percentage = (double) totalMarks / (numSubjects * 100) * 100;
            table[i][numSubjects + 1] = Integer.toString(totalMarks);
            table[i][numSubjects + 2] = String.format("%.2f%%", percentage);
            


            
        }

        
        // Print the table
        System.out.println();
        System.out.println();
        for (int i = 0; i <= numStudents; i++) {
            for (int j = 0; j < numSubjects + 3; j++) {
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        
        
	}
}
