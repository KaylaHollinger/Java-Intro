import java.util.Scanner;
//Kayla Hollinger 11/29/18
//(Print distinct numbers) Write a program that reads in ten numbers and displays the number of distinct numbers and the distinct numbers separated by exactly one space (i.e., if a number appears multiple times, it is displayed only once).(Hint: Read a number and store it to an array if it is new. If the number is already in the array, ignore it.)After the input, the array contains the distinct numbers.
public class ProEx705 {
	public static void main(String[] args) {
		//Create a scanner
		Scanner input = new Scanner(System.in);
		
		//Create variables and arrays
		int[] distinctNumbers = new int[10];
		int num;
		int count = 0;
		
		//Prompt user to enter numbers
		System.out.print("Enter 10 numbers separated by a space: ");
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			
			// Test which numbers are distinct
			if (isDistinct(distinctNumbers, num)) {
				distinctNumbers[count] = num;
				count++;
			}
		}
		
		//Display the amount of distinct numbers and list them
		System.out.println("The number of distinct numbers is " + count);
		System.out.print("List without duplicates is:");
		for (int i = 0; i < distinctNumbers.length; i++) {
			if (distinctNumbers[i] > 0)
				System.out.print(" " + distinctNumbers[i]);
		}
		System.out.println();
	}
	//Return true if the number isn't in array
	public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i])
				return false;
		}
		return true;
	}
}
