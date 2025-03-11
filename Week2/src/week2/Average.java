package week2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int val1, val2, val3;
		        double average;
		        Scanner scan = new Scanner(System.in);
		        
		        // get three values from user
		        System.out.println("Enter three integers");
		        System.out.print("Enter the first value: ");
		        val1 = scan.nextInt();
		        System.out.print("Enter the second value: ");
		        val2 = scan.nextInt();
		        System.out.print("Enter the third value: ");
		        val3 = scan.nextInt();
		        
		        // compute the average
		        average = (val1 + val2 + val3) / 3.0;
		        
		        // print the average
		        System.out.println("The average is " + average);
		        scan.close();
		    }
		

}
