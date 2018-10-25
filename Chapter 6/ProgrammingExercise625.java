//Kayla Hollinger 10/25/18
//(Convert milliseconds to hours, minutes, and seconds) Write a method that converts milliseconds to hours, minutes, and seconds using the following header: public static String convertMillis(long millis). The method returns a string as hours:minutes:seconds. For example, convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.
//This program finds has the user enter an amount of milliseconds and reads it back in an hour:minute:second format.
import java.util.Scanner;
class ProgrammingExercise625 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Enter the number of milliseconds
		System.out.print("Enter n: ");
		long millis = input.nextLong();
		
		System.out.println("hours:minutes:seconds: " + convertMillis(millis));			
	}
	
	//Method to display matrix
	public static String convertMillis(long millis) {
		millis /= 1000;
		
		String current = "";
		for (int i = 0; i < 2; i++) {
			current = ":" + millis % 60 + current;
			millis /= 60;
		}
		return millis + current;
		}
	}
