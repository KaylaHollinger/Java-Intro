// Kayla Hollinger
import java.util.Scanner;

class ProgrammingExercise33 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		//enter value of variables
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		System.out.print("Enter the value of b: ");
		double b = input.nextDouble();
		System.out.print("Enter the value of c: ");
		double c = input.nextDouble();
		System.out.print("Enter the value of d: ");
		double d = input.nextDouble();
		System.out.print("Enter the value of e: ");
		double e = input.nextDouble();
		System.out.print("Enter the value of f: ");
		double f = input.nextDouble();
		
		if (a * d - b * c == 0) {
		System.out.println("The equation has no solution.");
		
		//compute Cramer's rule
		double x = ((e * d - b * f) / (a * d - b * c));
		double y = ((a * f - e * c) / (a * d - b * c));
			
		//display results
		System.out.println("x =  " + x + "     y = " + y);
		}
	}
}
