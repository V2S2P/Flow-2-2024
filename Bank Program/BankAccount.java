import java.util.*;
public class BankAccount{
	private int accountNumber;
	private String accountName;
	private float balance;

	public BankAccount(int accountNumber, String accountName, float balance){
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.balance = balance;
	}

	public void deposit(float amount){
		balance += amount;
	}
	public void withdraw(float amount){
		if(amount > balance){
			System.out.println("Insuffecient funds to withdraw. PLease try again.");
			return;
		}
		balance -= amount;
	}
	public void checkBalance(){
		System.out.println("Balance: " + "$" + balance);
	}

	public void depositAmount(Scanner scanner){
		System.out.println("Enter deposit amount:");
				float depositAmount = scanner.nextFloat();
				this.deposit(depositAmount);
				System.out.println("\nDeposited $" + depositAmount);
				System.out.println();
	}


	public void withdrawAmount(Scanner scanner){
		System.out.println("Enter amount to withdraw:");
				float withdrawAmount = scanner.nextFloat();
				if(withdrawAmount > balance){
				System.out.println("\nInsuffecient funds to withdraw. PLease try again.");
			}else{
				this.withdraw(withdrawAmount);
				System.out.println("\nWithdrew $" + withdrawAmount);
			}
				System.out.println();
	}

	public void checkBal(Scanner scanner){
		System.out.println("\nCheck Balance:");
				this.checkBalance();
				System.out.println();
	}


	public int getAccountNumber(){
		return accountNumber;
	}
	public String getAccountName(){
		return accountName;
	}
	public float balance(){
		return balance;
	}
	public String toString(){
		return "Account Number: " + accountNumber +
				", Account Name: " + accountName + 
				", Balance: $" + balance;
	}
}