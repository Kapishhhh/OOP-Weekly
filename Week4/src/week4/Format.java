package week4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Format {

    public static void main(String[] args) {
        // Constants
        final double OUNCES_PER_POUND = 16.0;

        // Declare variables
        double pricePerPound;    
        double weightOunces;    
        double weight;             
        double totalPrice;       

        Scanner scan = new Scanner(System.in);

        // Declare money as a NumberFormat object for currency
        NumberFormat money = NumberFormat.getCurrencyInstance();

        // Declare  as a DecimalFormat object to format weight to 2 decimal places
        DecimalFormat fmt = new DecimalFormat("#0.00");

        System.out.println("Welcome to the CS Deli!!\n");

        // Input price per pound
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        // Consume the leftover newline character
        scan.nextLine();  

        // Input weight in ounces
        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

        // Convert ounces to pounds
        weight = weightOunces / OUNCES_PER_POUND;

        //  total price
        totalPrice = pricePerPound * weight;

         // Result
        System.out.println("\n*****  CS Deli  *****\n");
        System.out.println("Unit Price: " + money.format(pricePerPound) + " per pound");
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println("\nTOTAL:  " + money.format(totalPrice));
    }
}
