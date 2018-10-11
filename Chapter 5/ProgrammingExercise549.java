//Kayla Hollinger 10/11/18
//This program finds has the user enter a word to get how many vowels and how many consonants in the word.
import java.util.Scanner;
class ProgrammingExercise549 {
	public static void main(String[] args) {
		//Create scanner object
		Scanner input = new Scanner(System.in);
		
		//Enter the word
		System.out.print("Enter a word: ");
		
		//Define the variables
		String word = input.next();
		int vowels = 0;
		int consonants = 0;
		
		System.out.println("The word " + word + " has:");{
		
		//Count the number of vowels and consonants in the word.
			for (int i = 0; i < word.length(); i++) {
				if (Character.isLetter(word.charAt(i))) {
					if (Character.toUpperCase(word.charAt(i)) == 'A' ||
					Character.toUpperCase(word.charAt(i)) == 'E' ||
					Character.toUpperCase(word.charAt(i)) == 'I' ||
					Character.toUpperCase(word.charAt(i)) == 'O' ||
					Character.toUpperCase(word.charAt(i)) == 'U') {
				vowels++;
			}
				else
				consonants++;
			}
		}
		//Display the results
		System.out.println(vowels + " vowels");
		System.out.println(consonants + " consonants");
		}
	}
}
