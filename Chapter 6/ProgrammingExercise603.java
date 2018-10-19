//Kayla Hollinger 10/11/18
//This program has the user enter an integer and then gives back whether it is a palindrome..
import java.util.Scanner;
class ProgrammingExercise549 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Prompt for the integer
		System.out.print("Enter an integer: ");
		int number = inout.nextInt();
		
		//Report palindromeness
		System.out.println(number + (isPalindrome(number) ? " is " : " is not ") + "a palindrome.");
	}
	
	//Method returns true if
	Public static boolean isPalindrome(int number) {
		return number == reverse(number) ? true : false;
	}
	
	//Method returns reverse if
	public static int reverse(int number) {
		String reverse = " ";
		String n = number + " ";
		
		for (int i = n.length() - 1; i >= 0; i--) {
			reverse += n.charAt(i);
		}
		return Integer.parseInt(reverse);
	}
}
