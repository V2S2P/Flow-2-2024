import java.util.*;
public class Bank{
	public static void main(String[] args){
		ArrayList<BankAccount> bankAccounts = new ArrayList<>();

		BankAccount account1 = new BankAccount(1,"Valdemar",1000);
		bankAccounts.add(account1);

		Scanner scanner = new Scanner(System.in);

		boolean running = true;

		while(running){
			System.out.println();
			System.out.println("Choose an option:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Account Information");
			System.out.println("5. Exit");

			int choice = scanner.nextInt();

			switch(choice){
			case 1:
				/*System.out.println("Enter deposit amount:");
				float depositAmount = scanner.nextFloat();
				account1.deposit(depositAmount);
				System.out.println("\nDeposited $" + depositAmount);
				System.out.println();*/
				account1.depositAmount(scanner);
				break;

			case 2:
				/*System.out.println("Enter amount to withdraw:");
				float withdrawAmount = scanner.nextFloat();
				account1.withdraw(withdrawAmount);
				System.out.println("\nWithdrew $" + withdrawAmount);
				System.out.println();*/
				account1.withdrawAmount(scanner);
				break;
			case 3:
				/*System.out.println("\nCheck Balance:");
				account1.checkBalance();
				System.out.println();*/
				account1.checkBal(scanner);
				break;
			case 4:
				System.out.println("\n" + account1.toString());
				System.out.println();
				break;
			case 5:
				running = false;
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("\nInvalid choice. Please use options 1 to 5.");
			}
		}

	}
}