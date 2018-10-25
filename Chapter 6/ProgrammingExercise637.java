//Kayla Hollinger 10/25/18

//(Format an integer) Write a method with the following header to format the inte- ger with the specified width. public static String format(int number, int width) The method returns a string for the number with one or more prefix 0s. The size of the string is the width. For example, format(34, 4) returns 0034 and format(34, 5) returns 00034. If the number is longer than the width, the method returns the string representation for the number. For example, format(34, 1) returns 34. Write a test program that prompts the user to enter a number and its width and displays a string returned by invoking format(number, width).

//This program has the user enter a number and adds zeroes to it to make the number a certain width.

import java.util.Scanner;
class ProgrammingExercise637 {
	public static void main(String[] args) {
		//Create the scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for a number
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		//Prompt the user for it's width
		System.out.print("Enter its width: ");
		int width = input.nextInt();
		
		// Display the string of the formatted number
		System.out.println(number + " formatted to width " + width + ": " + format(number, width));			
	}
	
	//Method to return a string for the number
	public static String format(int number, int width) {
		String num = number + "";
		
		if (num.length() < width) {
			for (int i = width - num.length(); i > 0; i--) {
				num = 0 + num;
			}
		}
		return num;
	}
}
