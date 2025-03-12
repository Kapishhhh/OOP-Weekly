package week3;

import java.util.Scanner;
import java.text.NumberFormat;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double currentSalary;  // Employee's current salary
	       double raise = 0;      // Amount of the raise
	       double newSalary;      // New salary for the employee
	       String rating;         // Performance rating

	       Scanner scan = new Scanner(System.in);

	       System.out.print("Enter the current salary: ");
	       currentSalary = scan.nextDouble();
	       System.out.print("Enter the performance rating (Excellent, Good, or Poor): ");
	       rating = scan.next();

	       // Compute the raise using if-else statements
	       if (rating.equalsIgnoreCase("Excellent")) {
	           raise = currentSalary * 0.06;
	       } else if (rating.equalsIgnoreCase("Good")) {
	           raise = currentSalary * 0.04;
	       } else if (rating.equalsIgnoreCase("Poor")) {
	           raise = currentSalary * 0.015;
	       } else {
	           System.out.println("Invalid rating entered.");
	           scan.close();
	           return;
	       }

	       newSalary = currentSalary + raise;

	       // Print the results
	       NumberFormat money = NumberFormat.getCurrencyInstance();
	       System.out.println();
	       System.out.println("Current Salary:       " + money.format(currentSalary));
	       System.out.println("Amount of your raise: " + money.format(raise));
	       System.out.println("Your new salary:      " + money.format(newSalary));
	       System.out.println();
	       scan.close();
	    }
	}
