
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();


        Account account0 = new Account("Valdemar",1,1000);
        Account account1 = new Account("Big Hank",2,10000);

        accounts.add(account0);
        accounts.add(account1);

        System.out.println("Welcome to the Bank Of Banks. Please enter your password to see your accounts.");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        System.out.println("Password accepted. Here are your accounts:");
        AccountInfo.displayAccounts(accounts);

        System.out.println("\nPlease enter the number of the account you want to access:");
        int accountChoice = scanner.nextInt();

        AccountInfo.chooseAccount(accounts, accountChoice);

        System.out.println("You can: " + "\n1) Deposit" + "\n2) Withdraw");
        int balanceChoice = scanner.nextInt();

        Account chosenAccount = null;
        if(accountChoice > 0 && accountChoice <= accounts.size()){
            chosenAccount = accounts.get(accountChoice - 1);
            System.out.println("You have selected: ");
            System.out.println(chosenAccount);
        }else{
            System.out.println("Invalid account selection.");
            return;
        }
        Balance.balanceChoice(chosenAccount,scanner);
    }
}