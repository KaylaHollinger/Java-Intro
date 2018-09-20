// Kayla Hollinger 9/19/18
import java.util.Scanner;

class ProgrammingExercise41 {
	public static void main(String[] args) {
		
		//create scanner object
		Scanner input = new Scanner(System.in); 
	
		//enter value of variables
		System.out.print("Enter the length from the center to the vertex: ");
		double r = input.nextDouble();
		double pi = 3.14159;
		double sin = (Math.sin(pi / 5));
		double tan = (Math.tan(pi / 5));
		double s = ((2 * r) * (sin));
		double s2 = (Math.pow(s,2));
		
		
		//compute the area of the pentagon
		double area = (((5 * (s2)) / (4 * (tan))));
		
		//round to the hundreth place
		double arearound = (Math.ceil(area * 100) / 100);
		
		//print answer
	if (r > 0)
		System.out.print("The area of the pentagon is " + arearound);
		
		//exceptions
	if (r <= 0)
		System.out.println("that's invalid sucka!");
	}
}
