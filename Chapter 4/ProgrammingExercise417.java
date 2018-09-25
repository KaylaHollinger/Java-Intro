// Kayla Hollinger 9/19/18
import java.util.Scanner;

class ProgrammingExercise417 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		//enter value of variables
		System.out.print("Enter a year: ");
		int year = input.nextInt();
		System.out.print("Enter a month: ");
		String month = input.next();
		//System.out.println("Month is '" + month + "'");
		
		
		
		if (month.equals("Jan")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Mar")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Apr")) {
			System.out.println(month + " " + year + " has " + 30 + " days");
		}
		if (month.equals("May")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Jun")) {
			System.out.println(month + " " + year + " has " + 30 + " days");
		}
		if (month.equals("Jul")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Aug")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Sep")) {
			System.out.println(month + " " + year + " has " + 30 + " days");
		}
		if (month.equals("Oct")) {
			System.out.println(month + " " + year + " has " + 31 + " days");
		}
		if (month.equals("Nov")) {
			System.out.println(month + " " + year + " has " + 30 + " days.");
		}
		if (month.equals("Dec")) {
			System.out.println(month + " " + year + " has " + 31 + " days.");
		}
		
		
		
		// Test for leap year
		boolean leapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		System.out.println(((leapYear) ? 29 : 28) + " days");	
	}
}
