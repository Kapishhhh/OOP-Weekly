package bank;

public class BankAcc {
	private String name;
	private double balance;

	// Constructor 
	public BankAcc(String name) {
		this.name = name;
		this.balance = 0.0;
	}

	public void deposit(double amount) {
		if (amount > 0)
			balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance)
			balance -= amount;
		else
			System.out.println("Invalid with drawal.");
	}

	// 3% interest
	public void addInterest() {
		balance += balance * 0.03;
	}

	// string
	public String toString() {
		return name + ": Rs" + String.format("%.2f", balance);
	}
  }
