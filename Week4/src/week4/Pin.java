package week4;

import java.util.Random;
import java.util.Scanner;

public class Pin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a 4-digit pin number to encrypt: ");
        int pin = scanner.nextInt();
        
        if (pin < 1000 || pin > 9999) {
            System.out.println("Invalid PIN! Please enter a 4-digit number.");
            scanner.close(); 
            return;
        }
        
        String encryptedPin = encryptPin(pin);
        System.out.println("Your encrypted pin number is " + encryptedPin + ".");
        
        scanner.close();
    }

    public static String encryptPin(int pin) {
        Random random = new Random();
        
        int rand1 = 1000 + random.nextInt(65536 - 1000);
        int rand2 = 1000 + random.nextInt(65536 - 1000);
        
        String pinHex = Integer.toHexString(pin);
        String rand1Hex = Integer.toHexString(rand1);
        String rand2Hex = Integer.toHexString(rand2);
        
        return rand1Hex + pinHex + rand2Hex;
    }
}
