public class Account {
    private String name;
    private String deposit;
    private String withdraw;
    private String balance;

    public Account(String name, String deposit, String withdraw, String balance){
        this.name = name;
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.balance = balance;
        return;
    }

    public String getName() {
        return name;
    }

    public String getDeposit() {
        return deposit;
    }

    public String getWithdraw() {
        return withdraw;
    }

    public String getBalance() {
        return balance;
    }
    @Override
    public String toString(){
        String result = "";
        return result;
    }
}
