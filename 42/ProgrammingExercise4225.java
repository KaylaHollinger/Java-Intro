package mytest;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class ProgrammingExercise4225Test {
	@Before
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
	@Test
	void test() {
		fail("Not yet implemented");
	}
}
