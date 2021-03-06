/**
*  Calculates the grade a student receives on an examination
*
*  The program first prompts the user to enter the number of points possible
*  on the exam.  Then, the program prompts for the number of items missed; if a positive
*  number is entered, the program responds by calculating and displaying the percentage
*  score out of 100.  If a negative number is entered, the program prints a "Thank You" message
*  and exits.
*  
*  A sample interaction might be: (user input marked with '>')
*  "Enter the number of items on the exam"
*  >25
*  "Enter the number of items missed"
*  >3.5
*  "Missing 3.5 results in a score of 86.0"
*  "Enter the number of items missed"
*  >0
*  "Missing 0 results in a score of 100.0"
*  "Enter the number of items missed"
*  >-100
*  "Thank you -- have a great day!"
*  
*/
import java.util.Scanner;

public class Grader {
  
  public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double finalPoints = 0;
      
      System.out.println("Enter nuber of items on the exam, or -1 to quit.");
      double numPoints = scnr.nextDouble();
      if (numPoints > -1) {
         System.out.println("Enter the number of items missed");
         double missedPoints = scnr.nextDouble();
         finalPoints = numPoints - missedPoints;
         System.out.println("Missing" +missedPoints+ "results in a score of " +finalPoints);
      } else {
      System.out.println("Thank you -- have a great day!");
      
      }
      
    
    
    
  }
  
  
}
