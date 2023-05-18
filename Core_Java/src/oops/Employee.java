package oops;

import java.util.Scanner;

class Employee {
	
	/*
	 * Write a program by creating an 'Employee' class having the following methods 
	 * and print the final salary. 
	 * 1 - 'getInfo()' which takes the salary, number of hours of work
	 *      per day of employee as parameter
	 * 2 - 'AddSal()' which adds $10 to salary of the employee if it is less than $500. 
	 * 3 - 'AddWork()' which adds $5 to salary of employee if the number of hours of 
	 *      work per day is more than 6 hours.
	 *      
	 */

	double salary;
    int hoursOfWork;

    void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    void printFinalSalary() {
        System.out.println("Final salary: $" + salary);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the salary: $");
        double salary = scanner.nextDouble();

        System.out.print("Enter the number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();

        Employee e = new Employee();
        
        e.getInfo(salary, hoursOfWork);

        e.addSal();
        e.addWork();

        e.printFinalSalary();

	}

}
