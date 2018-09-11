import java.util.Scanner; // Scanner is in the java.util package

class ProgrammingExercise213 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    // Prompt user to enter a number
    System.out.print("Enter a monthly savings amount: ");
    double savings = input.nextDouble();
    
    // Compute savings each month
    double onemonthsavings = (savings * (1 + 0.00417));
    double twomonthsavings = ((savings + onemonthsavings) * (1 + 0.00417));
    double threemonthsavings = ((savings + twomonthsavings) * (1 + 0.00417));
    double fourmonthsavings = ((savings + threemonthsavings) * (1 + 0.00417));
    double fivemonthsavings = ((savings + fourmonthsavings) * (1 + 0.00417));
    double sixmonthsavings = ((savings + fivemonthsavings) * (1 + 0.00417));
    
    // Display results
    System.out.println("Savings after 6 months is " + sixmonthsavings);
  }
}
