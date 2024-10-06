public class Bank {
    private int amount;
    private int balance;

    public Bank(int balance){
        this.balance = balance;
    }
    public Bank (){}
    public void withdraw(int amount){
        balance -= amount;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public int balance(){
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
