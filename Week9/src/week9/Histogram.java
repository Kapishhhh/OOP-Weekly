package week9;

import java.util.Scanner;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] rangecounts = new int[10]; //arrayy counting
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter [1-100]. Type number -1 to stop it :");

        int num;
        // Reads the integers -1 until user enters    
        while ((num = scanner.nextInt())!= -1) 
        
        {
        	if (num >= 1 && num <= 100)
        	{
                // determine which range the number falls
                rangecounts[(num - 1) / 10]++;
            }
        	else
        	{
            
        		System.out.println("Number not found. PLease enter numbers between 1 and 100:");
            }
        }

        for (int i = 0; i < rangecounts.length; i++) {
            int start = i * 10 + 1;
            int end = (i + 1) * 10;
            
            System.out.printf("%2d - %3d | ", start, end); //print the range and space
            for (int j = 0; j < rangecounts[i]; j++) {
             
            	System.out.print("*");
            }
            
            System.out.println();
        }

        scanner.close();
   
	}

}
