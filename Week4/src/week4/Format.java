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

        NumberFormat money = NumberFormat.getCurrencyInstance();

        DecimalFormat fmt = new DecimalFormat("#0.00");

        System.out.println("Welcome to the CS Deli!!\n");

        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();

        scan.nextLine();  

        System.out.print("Enter the weight (ounces): ");
        weightOunces = scan.nextDouble();

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
