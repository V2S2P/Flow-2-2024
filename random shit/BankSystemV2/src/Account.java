import java.util.ArrayList;
public class Account {
    private String name;
    private int balance;

    public Account(String name){
        this.name = name;
    }
    public void setBalance(int amount){
        balance = amount;
    }

    public int getBalance() {
        return balance;
    }
    @Override
    public String toString(){
        return "Account name: " + name + ", Balance: " + balance;
    }

    public java.lang.String getName() {
        return name;
    }
}
