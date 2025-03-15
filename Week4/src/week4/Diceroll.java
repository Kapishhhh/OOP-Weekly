package week4;

import java.util.Scanner;
import java.util.Random;


public class Diceroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();

		        // Prompt user for dice sides
		        System.out.print("How many sides does die 1 have? ");
		        int sides1 = scanner.nextInt();
		        System.out.print("How many sides does die 2 have? ");
		        int sides2 = scanner.nextInt();

		        // Variables to store sum of rolls
		        int sum1 = 0, sum2 = 0;

		        // Roll the dice 3 times
		        for (int i = 1; i <= 3; i++) {
		            int roll1 = random.nextInt(sides1) + 1;
		            int roll2 = random.nextInt(sides2) + 1;

		            sum1 += roll1;
		            sum2 += roll2;

		            System.out.println("Die 1 roll " + i + " = " + roll1);
		            System.out.println("Die 2 roll " + i + " = " + roll2);
		        }

		        // averages
		        double avg1 = sum1 / 3.0;
		        double avg2 = sum2 / 3.0;

		        // results
		        System.out.println("Die 1 rolled a total of " + sum1 + " and rolled " + avg1 + " on average.");
		        System.out.println("Die 2 rolled a total of " + sum2 + " and rolled " + avg2 + " on average.");

		        scanner.close();
		    }
		}
