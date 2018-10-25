//Kayla Hollinger 10/24/18
//Use the reverse method to implement isPalindrome. A number is a palindrome if its reversal is the same as itself. Write a test program that prompts the user to enter an integer and reports whether the integer is a palindrome.
//This program has the user enter an integer and then gives back whether it is a palindrome.
import java.util.Scanner;
class ProgrammingExercise603 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt for the integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		//Report palindromeness
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	}
	// Return the reversal of an integer, i.e., reverse(456) returns 654
		public static int reverse(int number) {
			String reverse = "";
			String n = number + "";
			
			for (int i = n.length() - 1; i >= 0; i--) {
				reverse += n.charAt(i);
			}
			return Integer.parseInt(reverse);
	}
	// Return true if number is a palindrome
		public static boolean isPalindrome(int number) {
			return number == reverse(number) ? true : false;
	}
}
