package week4;

import java.util.Scanner;
public class Spherecalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double PI = Math.PI;
        Scanner scanner = new Scanner(System.in);

        // Prompt user for radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // volume and surface area
        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        double surfaceArea = 4 * PI * Math.pow(radius, 2);

        // Display results to 4 decimal 
        System.out.printf("Volume: %.4f\n", volume);
        System.out.printf("Surface Area: %.4f\n", surfaceArea);

        scanner.close();
    }

	}
