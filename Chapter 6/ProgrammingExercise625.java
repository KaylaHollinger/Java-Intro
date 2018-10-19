//Kayla Hollinger 10/11/18
//This program finds has the user enter a word to get how many vowels and how many consonants in the word.
import java.util.Scanner;
class ProgrammingExercise549 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Enter the word
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	
	//Method to display matrix
	public static void printMatrix(int n) {
		for (int rows = 0; rows < n; rows++) {
			for (int c = 0; c < n; c ++) {
				System.out.print((int)(Math.random() * 2));
			}
			System.out.println();
		}
	}
}
