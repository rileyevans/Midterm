/**
 * Determines the number of pizza pies required to feed an after school club.
 * 
 * Basic program
 * 	Prompt the user to enter the number of people to be fed, the number of
 * 	slices allowed for each person, and the number of slices in each whole pie.
 * 	Given these inputs, determine and display the number of pizzas to purchase.
 * 
 * For guidance, refer to the flowchart PizzaPalace.pdf distributed with this file
 * 
 * @author <Riley>
 * @version <October 20, 2014>
 */
import java.util.Scanner;

public class PizzaPalace {

	public static void main(String[] args) {
   Scanner scnr = new Scanner(System.in);
   double totalPizza = 0;
   
   System.out.println("Enter number of people eating.");
   double numPeople = scnr.nextDouble();
   System.out.println("Enter number of slices for each person.");
   double numSlice = scnr.nextDouble();
   System.out.println("Enter number of slices there are in a pizza.");
   double numPizza = scnr.nextDouble();
   totalPizza = (numPeople*numSlice)/numPizza;
   System.out.println("You'll need to have " + Math.ceil(totalPizza) + " Pizzas.");

  	}

}


