package week2;

import java.util.Scanner;

public class Denominator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter numerator: ");
		        int numerator = scan.nextInt();
		        System.out.print("Enter denominator: ");
		        int denominator = scan.nextInt();
		        
		        if (denominator != 0) {
		            double decimal = (double) numerator / denominator;
		            System.out.println("Decimal equivalent: " + decimal);
		        } else {
		            System.out.println("Denominator cannot be zero.");
		        }
		        scan.close();
		    }

}
