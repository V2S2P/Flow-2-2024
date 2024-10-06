import java.util.*;
import java.util.ArrayList;
public class Customer {
    private String name;
    private ArrayList<Account> accounts;
    private Account currentAccount;

    public Customer(String name){
        this.name = name;
        accounts = new ArrayList<>();
        Account account = new Account("Main Account");
        accounts.add(account);
        currentAccount = account;
    }

    public void createAccount(String name){
        Account account = new Account(name);
        accounts.add(account);
    }

    public void deposit(int amount){
        currentAccount.setBalance(currentAccount.getBalance() + amount);
    }

    public ArrayList<String> getAccountNames(){
        ArrayList<String> acccountNames = new ArrayList<>();
        for (Account account : accounts){
            acccountNames.add(account.getName());
        }
        return acccountNames;
    }

    public String getAccountDetails(int accountID){
        return accounts.get(accountID).toString();
    }

    @Override
    public String toString(){
        String customerInfo = "Customer name: " + name + "\n";
        for (Account account : accounts){
            customerInfo += account.toString() + "\n";
        }
        return customerInfo;
    }
    public void setCurrentAccount(Account account){
        currentAccount = account;
    }
}
