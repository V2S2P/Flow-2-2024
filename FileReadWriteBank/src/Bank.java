import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName,ArrayList<Customer> customers){
        this.bankName = bankName;
        this.customers = customers;
    }


    @Override
    public String toString() {
        return bankName;
    }
}
