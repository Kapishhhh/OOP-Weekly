package week3;

import java.util.Scanner;
import java.util.Random;

public class LoopRock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
	        Random generator = new Random();
	        String personPlay;
	        String computerPlay;
	        int computerInt;
	        
	        while (true) {
	            // Get player's play and convert to uppercase
	            System.out.print("Enter your play (R, P, S) or Q to quit: ");
	            personPlay = scan.next().toUpperCase();
	            
	            if (personPlay.equals("Q")) {
	                System.out.println("Thanks for playing! Goodbye.");
	                break;
	            }
	            
	            if (!personPlay.equals("R") && !personPlay.equals("P") && !personPlay.equals("S")) {
	                System.out.println("Invalid input! Please enter R, P, or S.");
	                continue;
	            }
	            
	            // Generate computer's play
	            computerInt = generator.nextInt(3);
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
	            } else if ((personPlay.equals("R") && computerPlay.equals("S")) ||
	                       (personPlay.equals("P") && computerPlay.equals("R")) ||
	                       (personPlay.equals("S") && computerPlay.equals("P"))) {
	                System.out.println("You win!");
	            } else {
	                System.out.println("Computer wins!");
	            }
	        }
	        
	        scan.close();
	    }
	}
	
