// Kayla Hollinger 09/11/18
import java.util.Scanner; // Scanner is in the java.util package

class ProgrammingExercise223 {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt user to enter a number
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double milespg = input.nextDouble();
		System.out.print("Enter price per gallon: ");
		double pricepg = input.nextDouble();
		
		//Compute Cost
		double cost = (int)(((distance / milespg) * pricepg) * 100);
    
		// Display results
		System.out.println("The cost of driving is $" + cost / 100);
	}
}
