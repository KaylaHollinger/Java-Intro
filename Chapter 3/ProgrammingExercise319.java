// Kayla Hollinger
import java.util.Scanner;

class ProgrammingExercise319 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		
		//enter value of variables
		System.out.print("Enter the length of edge a: ");
		double a = input.nextDouble();
		System.out.print("Enter the length of edge b: ");
		double b = input.nextDouble();
		System.out.print("Enter the length of edge c: ");
		double c = input.nextDouble();
		
		double perimeter = (a + b + c);
		
		//compute the perimeter
	if (a + b + c == 0) {
		System.out.println("The input is invalid.");
		
		}
	else {
		System.out.println("The perimeter of the triangle is: " + perimeter);
		}
	}
}
