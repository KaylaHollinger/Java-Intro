// Kayla Hollinger 9/19/18
import java.util.Scanner;

class ProgrammingExercise323 {
	public static void main(String[] args) {
		System.out.println("Check whether a point (x,y) is within the rectangle.");
		
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		//enter value of variables
		System.out.print("Enter the value of x: ");
		double x = input.nextDouble();
		System.out.print("Enter the value of y: ");
		double y = input.nextDouble();
			
		//designate how to answer	
	if (x <= 10 / 2)
	if (y <= 5.0 / 2)
		System.out.println("Point (" + x + "," + y + ") is in the rectangle");
		
	if (x > 10 / 2)
	if (y > 5.0 / 2)
		System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
	if (x <= 10 / 2)
	if (y > 5.0 / 2)
		System.out.println("Point (" + x + "," + y + ") is not in the rectangle");
	if (x > 10 / 2)
	if (y <= 5.0 / 2)
		System.out.println("Point (" + x + "," + y + ") is not in the rectangle");		
	}
}