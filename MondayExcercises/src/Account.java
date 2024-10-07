public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

   public void withdraw(double amount){
        balance -= amount;
    }
   public void deposit(double amount){
        balance += amount;
    }
    public double getBalance(){
        return balance;
    }
}
