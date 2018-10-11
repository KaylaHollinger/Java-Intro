//Kayla Hollinger 10/11/18
//This program finds the first four perfect numbers, all underneath 10,000. A perfect number is one whose divsors, when added together and excluding itself, make up the number.
class ProgrammingExercise533 {
	public static void main(String[] args) {
		System.out.println("The four perfect numbers under 10,000:");

			// Holds the sum of the positive divisors
			int sum;	
			// Find all the perfect numbers less than 10,000
			for (int i = 1; i < 10000; i++) {
				sum = 0;
				
				for (int k = 1; k < i; k++) {
					// Test the divisors
					if (i % k == 0)
						sum += k;
				}
				// Test if the sum of all the positive divisors are equal to number
				if (i == sum)
					System.out.printf("%20d\n", i);
		}
	}
}
