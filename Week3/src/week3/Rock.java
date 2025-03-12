package week3;

import java.util.Scanner;
import java.util.Random;

public class Rock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 String personPlay;    
		 String computerPlay;  
	      int computerInt;      
	      Scanner scan = new Scanner(System.in);
	      Random generator = new Random();

	      // Get player's play and convert to uppercase
	      System.out.print("Enter your play (R, P, S): ");
	      personPlay = scan.next().toUpperCase();

	      // Generate computer's play
	      computerInt = generator.nextInt(3);
	      
	      // Translate computer's play to a string
	      switch (computerInt) {
	         case 0: computerPlay = "R"; break;
	         case 1: computerPlay = "P"; break;
	         default: computerPlay = "S"; break;
	      }

	      // Print computer's play
	      System.out.println("Computer plays: " + computerPlay);

	      // Determine winner
	      if (personPlay.equals(computerPlay)) {
	          System.out.println("It's a tie!");
	      } else if (personPlay.equals("R")) {
	          if (computerPlay.equals("S"))
	              System.out.println("Rock crushes Scissors. You win!");
	          else
	              System.out.println("Paper covers Rock. Computer wins!");
	      } else if (personPlay.equals("P")) {
	          if (computerPlay.equals("R"))
	              System.out.println("Paper covers Rock. You win!");
	          else
	              System.out.println("Scissors cut Paper. Computer wins!");
	      } else if (personPlay.equals("S")) {
	          if (computerPlay.equals("P"))
	              System.out.println("Scissors cut Paper. You win!");
	          else
	              System.out.println("Rock crushes Scissors. Computer wins!");
	      } else {
	          System.out.println("Invalid input! Please enter R, P, or S.");
	      }
	      scan.close();
	   }
	

	}

