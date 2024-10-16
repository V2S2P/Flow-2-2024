import javax.xml.namespace.QName;

public class Customer {
    private String name;
    private String password;
    private int ID;
    private static int counter = 1;
    private float balance;

    public Customer(String name, String password, float balance, int ID){
        this.name = name;
        this.password = password;
        this.ID = counter++;
        this.balance = balance;
    }
    public void deposit(float amount){
        balance += amount;
    }
    public boolean withdraw(float amount){
        if (this.balance >= amount){
            this.balance -= amount;
            return true;
        }else{
            return false;
        }
    }
    public String checkDetails(){
        return "Name: " + name + ", ID: " + ID + ", Balance: " + balance;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

    public static int getCounter() {
        return counter;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + ID;
    }
}


