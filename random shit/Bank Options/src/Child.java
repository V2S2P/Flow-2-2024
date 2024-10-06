public class Child extends Bank{
    private int balance;

    @Override
    public void withdraw(int amount){
        balance -= amount;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
