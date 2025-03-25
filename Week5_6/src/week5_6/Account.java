package week5_6;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // Constructor 
    public Account(String name, String accountNumber, double initialBalance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Account Name: " + name +
               "\nAccount Number: " + accountNumber +
               "\nBalance: $" + String.format("%.2f", balance);
    }

    public static void main(String[] args) {
        Account acc1 = new Account("Mr British", "123456789");
        System.out.println("Initial Account Details:\n" + acc1);

        acc1.deposit(500);
        System.out.println("\nAfter depositing $500:\n" + acc1);

        acc1.withdraw(200);
        System.out.println("\nAfter withdrawing $200:\n" + acc1);

        acc1.withdraw(400); 
        System.out.println("\nFinal Account Details:\n" + acc1);
    }
}
