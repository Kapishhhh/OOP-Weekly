package week2;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of the square: ");
        int side = scan.nextInt();
        int perimeter = 4 * side;
        int area = side * side;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        scan.close();
	}

}
