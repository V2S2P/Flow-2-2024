import java.text.*;
public class Account{

    //instance variables
    private String name;
    private int accountNum;
    private double balance;

    //Constructor
    public Account(String initName, int initId, double initBalance){
        name = initName;
        accountNum = initId;
        balance = initBalance;
    }

    //method to deposit a specified amount into the account
    public void deposit(double amount){
        balance = balance + amount;
    }

    //method to withdraw a specified amount from account
    public void withdraw(double amount, double fee){
        balance = balance - amount - fee;
    }

    //getter method to return balance
    public double getBalance(){
        return balance;
    }

    //toString method returns the data location of the objects toString, so if we didn't have this method here we would get the literal location of the data
    public String toString(){

        String result = "";
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        result = "\nName: " + name + "\nAccount Number: " + accountNum + "\nBalance: " + fmt.format(balance);
        return result;
    }
}
