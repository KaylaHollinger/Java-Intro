package mytest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class ProgrammingExercise4203Test {
	@Before
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
	@Test
	void test() {
		fail("Not yet implemented");
	}
}
