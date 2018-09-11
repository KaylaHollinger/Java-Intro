// Kayla Hollinger 9/10/2018 Programming Exercise 2-1

import java.util.Scanner; // Scanner is in the java.util pakage

class ProgrammingExercise1 {
  public static void main(String[] args) {
    // Create a Scanner object
    Scanner input = new Scanner(System.in);
    
    // Prompt the user to enter a number
    System.out.print("Enter a degree in Celsius: ");
    double degreecelsius = input.nextDouble();
    
    // Compute the change to fahrenheit
    double degreefahrenheit = ((9.0 / 5) * degreecelsius + 32);
    
    //Display results
    System.out.println(degreecelsius + " Celsius is " + degreefahrenheit + " Faherenheit");
  }
}
