import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();

        Bank bank = new Bank("Bank Of Denmark", customers);
        loadCustomersFromFile(customers,"Customers.txt");


        System.out.println("Welcome to " + bank + ".");

        System.out.println("1. Log in.");
        System.out.println("2. Create Account.");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                boolean loginSuccessful = false;
                while (!loginSuccessful){
                System.out.println("Enter name:");
                String enterName = scanner.nextLine();

                System.out.println("Enter password:");
                String enterPassword = scanner.nextLine();

                if (enterName.equals("ADMIN") && enterPassword.equals("ADMINPASSWORD")) {
                    boolean adminRunning = true;
                    while (adminRunning) {
                        System.out.println("1. Show all customers.");
                        System.out.println("2. Delete bank account.");
                        System.out.println("3. Exit.");
                        int adminChoice = scanner.nextInt();

                        switch (adminChoice) {
                            case 1:
                                for (Customer customer : customers) {
                                    System.out.println(customer.toString() + ", Balance: " + "$" + customer.getBalance());
                                }
                                System.out.println("");
                                break;

                            case 2:
                                for (int i = 0; i < customers.size(); i++) {
                                    System.out.println((i + 1) + "." + customers.get(i));
                                }
                                System.out.println("Enter the number of the account to delete:");
                                int accountToDelete = scanner.nextInt();
                                if (accountToDelete > 0 && accountToDelete <= customers.size()) {
                                    customers.remove(accountToDelete - 1);
                                    System.out.println("Successfully deleted account");
                                    saveAllCustomerToFile(customers, "Customers.txt");
                                } else {
                                    System.out.println("Invalid account number.");
                                }
                                break;

                            case 3:
                                adminRunning = false;
                                System.out.println("Exiting admin panel...");
                                break;

                            default:
                                System.out.println("Invalid choice. Please select a valid option.");
                        }
                    }
                    return;
                }

                Customer loggenInCustomer = null;
                for(Customer customer: customers) {
                    if (customer.getName().equals(enterName) && customer.getPassword().equals(enterPassword)) {
                        loggenInCustomer = customer;
                        break;
                    }
                }
                 if (loggenInCustomer != null){
                     loginSuccessful = true;
                     System.out.println("Logging in..");
                     System.out.println("\nWelcome " + loggenInCustomer.getName());


                     boolean keepRunning = true;
                     while (keepRunning) {
                         System.out.println("""
                                 1. Deposit.
                                 2. Withdraw.
                                 3. Check account details.
                                 4. Exit""");
                         int accountChoice = scanner.nextInt();
                         switch (accountChoice) {
                             case 1:
                                 System.out.println("Deposit amount:");
                                 float deposit = scanner.nextFloat();
                                 loggenInCustomer.deposit(deposit);
                                 System.out.println("Amount deposited: " + "$" + deposit);
                                 saveAllCustomerToFile(customers, "Customers.txt");
                                 break;

                             case 2:
                                 System.out.println("Withdraw amount:");
                                 float withdraw = scanner.nextFloat();
                                 if(loggenInCustomer.withdraw(withdraw)) {
                                     System.out.println("Amount withdrawn: " + "$" + withdraw);
                                     saveAllCustomerToFile(customers, "Customers.txt");
                                 }else{
                                     System.out.println("Insufficient funds.");
                                 }
                                 break;

                             case 3:
                                 System.out.println("Account Details:");
                                 System.out.println("Name: " + loggenInCustomer.getName());
                                 System.out.println("Balance: $" + loggenInCustomer.getBalance());
                                 System.out.println("");
                                 break;

                             case 4:
                                 keepRunning = false;
                                 System.out.println("Logging out...");
                                 break;

                             default:
                                 System.out.println("Invalid choice. Please try again.");

                         }
                     }
                 } else {
                     System.out.println("Wrong name or password. Please try again.");
                    }
                 }
                 break;

            case 2:
                System.out.println("Name:");
                String createName = scanner.nextLine();
                System.out.println("Password:");
                String createPassword = scanner.nextLine();
                Customer customer = new Customer(createName, createPassword, 0,0);
                customers.add(customer);

                saveAllCustomerToFile(customers,"Customers.txt");
                System.out.println("Account created successfully.");
                break;

            default:
                System.out.println("Invalid option. Please select 1 or 2.");
        }
    }

    public static void loadCustomersFromFile(ArrayList<Customer> customers, String filename){
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()){
                String[] data = fileScanner.nextLine().split(",");
                String name = data[0];
                String password = data[1];
                int ID = Integer.parseInt(data[2]);
                float balance = Float.parseFloat(data[3]);
                customers.add(new Customer(name, password, balance, ID));
            }
            fileScanner.close();
        }catch (FileNotFoundException e){
            System.out.println("Error loading customers: " + e.getMessage());
        }
    }

    public static void saveAllCustomerToFile(ArrayList<Customer> customers, String filename){
        try {
            FileWriter writer = new FileWriter(filename, false);
            for (Customer customer: customers){
                writer.write(customer.getName() + "," + customer.getPassword() + "," + customer.getID() + "," + customer.getBalance() + "\n");
            }
            writer.close();
        }catch (IOException e){
            System.out.println("Error saving customer: " + e.getMessage());
        }
    }
}
