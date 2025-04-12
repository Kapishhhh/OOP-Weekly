package bank;
import java.util.Scanner;

public class LLBankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array holds
        BankAcc[] accounts = new BankAcc[30];
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) 
        {
        	
           
            System.out.println("\n   1. Create your Bank Account\n   2. Deposit Money\n   3. Withdraw\n   4. Add Interest\n   5. View Accounts\n   6. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choice) 
            {
            
                    // new account
                case 1:
                    if (count < 30) {
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        accounts[count++] = new BankAcc (name);
                    } else {
                        System.out.println("Max accounts reached.");
                    }
                    break;

                    //Deposit
                case 2:
                    System.out.print("Account index: ");
                    int depIndex = scanner.nextInt();
                    System.out.print("Amount: ");
                    double depAmount = scanner.nextDouble();
                    if (valid(depIndex, count)) accounts[depIndex].deposit(depAmount);
                    break;

                    // With draw
                case 3:
                    System.out.print("Account index: ");
                    int witIndex = scanner.nextInt();
                    System.out.print("Amount: ");
                    double witAmount = scanner.nextDouble();
                    if (valid(witIndex, count)) accounts[witIndex].withdraw(witAmount);
                    break;

                    // Add Percent
                case 4:
                    for (int i = 0; i < count; i++) {
                        accounts[i].addInterest();
                    }
                    System.out.println("Interest added.");
                    break;

                    // Viewing Acc
                case 5:
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + ": " + accounts[i]);
                    }
                    break;

                    // exit
                case 6:
                    System.out.println("Thank you for using our banking system!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // Checking account index is correct or not
    private static boolean valid(int index, int count) {
        if (index >= 0 && index < count) return true;
        System.out.println("Invalid account index.");
        return false;
    }

	}


