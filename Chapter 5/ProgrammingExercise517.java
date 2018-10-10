import java.util.Scanner;

class ProgrammingExercise517 {
	public static void main(String[] args) {
		//create scanner object
		Scanner input = new Scanner(System.in);
		
		//enter the value of the variable
		System.out.print("Enter the number of lines: ");
		int nol = input.nextInt();
		
		for (int p = 1; p <= nol; p++)  {
			System.out.println( );
			
			for (int s = nol - p; s >= 1; s--) {
				System.out.print("  ");
			}
			
			for (int l = p; l >= 2; l--) {
				System.out.print(l + " ");
			}
			
			for (int r = 1; r <= p; r++) {
				System.out.print(r + " ");
			}
		}
	}
}
