// Kayla Hollinger 9/19/18
import java.util.Scanner;
import java.io.*;
import java.util.*;

class ProgrammingExercise423 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		//enter value of variables
		System.out.print("Enter employee's name: ");
		String name = input.next();
		System.out.print("Enter number of hours worked: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double fedtax = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double statetax = input.nextDouble();
				
		//calculate info
		double gross = (hours * payrate);
		double fedrate = (fedtax * 100);
		double staterate = (statetax * 100);
		double fedwith = (gross * fedtax);
		double statewith = (gross * statetax );
		double totalde = (fedwith + statewith);
		double net = (gross - totalde);
		
		//format to two decimal places
			net = (int)(net * 100) / 100.0;
		
		//print payroll statement
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payrate);
		System.out.println("Gross Pay: $" + gross);
		System.out.println("Deductions: ");
		System.out.println("	Federal Withholding(" + fedrate + "%): $" + fedwith);
		System.out.println("	State Withholding(" + staterate + "%): $" + statewith);
		System.out.println("	Total Deduction: $" + totalde);
		System.out.println("Net Pay: $" + net);
	}
}
