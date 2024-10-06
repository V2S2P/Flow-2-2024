import java.util.ArrayList;

public class Account {
    private String name;
    private int ID;
    private float balance;

    public Account(String name, int ID, float balance) {
        this.name = name;
        this.ID = ID;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + ID + ", Balance: " + balance;
    }
}
