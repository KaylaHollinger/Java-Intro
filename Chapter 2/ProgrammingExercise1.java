import java.util.Scanner; // Scanner is in the java.util pakage

class ProgrammingExercise1 {
  Public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter a number
    System.out.print("Enter a degree in Celsius: ");
    double degreecelcius = input.nextDouble();
    
    // Compute the change to farenheit
    double degreefarenheit = ((9 / 5) * degreecelcius + 32);
    
    //Display results
    System.out.println(degreecelcius + " " + degreefarenheit);
  }
}
