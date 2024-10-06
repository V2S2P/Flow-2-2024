import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");

        int age = scanner.nextInt();
        if (age <= 12){
            System.out.println("You have a 'Child' bank account, you can withdraw a maximum of 100");
            System.out.println("Balance: " + bank.getBalance());
            System.out.println("Do you want to withdraw or deposit?");
            String choice = scanner.nextLine();
            if (choice == "withdraw"){
                System.out.println("Enter amount to deposit: ");
            }
        } else if (age <=17) {
            System.out.println("You have a 'Teen' bank account, you can withdraw a maximum of 10,000");
        } else
            System.out.println("You have an 'Adult' bank account, you can withdraw whatever amount you have in your bank");
        }
    }
