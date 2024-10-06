import java.util.ArrayList;

public class AccountInfo {
    public static void displayAccounts(ArrayList<Account> accounts){
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println();
            System.out.println((i + 1) + ". " + accounts.get(i));
        }
    }

    public static void chooseAccount(ArrayList<Account> accounts, int accountIndex){
        if (accountIndex > 0 && accountIndex <= accounts.size()){

            Account chosenAccount = accounts.get(accountIndex - 1);
            System.out.println("You have selected: ");
            System.out.println(chosenAccount);
        }else{
            System.out.println("Invalid account selection");
        }
    }
}
