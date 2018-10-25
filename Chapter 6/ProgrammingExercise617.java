//Kayla Hollinger 10/25/18
//(Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using the following header:public static void printMatrix(int n). Each element is 0 or 1, which is generated randomly. Write a test program that prompts the user to enter n and displays an n-by-n matrix.
//This program finds has the user enter a number and then randomly generates a random n by n matrix made of 1s and 0s.
import java.util.Scanner;
class ProgrammingExercise617 {
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
