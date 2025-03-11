package week1;

public class Diamondshape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int n = 4; // Number of rows in the upper half

		        // Upper half of the diamond
		        for (int i = 1; i <= n; i++) {
		            for (int j = i; j < n; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }

		        // Lower half of the diamond
		        for (int i = n - 1; i >= 1; i--) {
		            for (int j = n; j > i; j--) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= (2 * i - 1); j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
	}

}
