//Kayla Hollinger 10/11/18
//This program finds has the user enter a word to get how many vowels and how many consonants in the word.
import java.util.Scanner;
class ProgrammingExercise549 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Enter the word
		System.out.print("Enter n: ");
		long millis = input.nextLong();
		
		System.out.println("hours:minutes:seconds: " convertMillis(millis));			
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
}
