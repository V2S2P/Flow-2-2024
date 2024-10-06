import java.util.Scanner;

public class Balance{
    public static void balanceChoice(Account account ,Scanner scanner){
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    float depositAmount = scanner.nextFloat();
                    account.setBalance(account.getBalance() + depositAmount);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw:");
                    float withdrawAmount = scanner.nextFloat();
                    if(withdrawAmount <= account.getBalance()){
                        account.setBalance(account.getBalance() - withdrawAmount);
                        System.out.println("Withdrawal successful. New balance: " + account.getBalance());
                    }else{
                        System.out.println("Insufficient balance for this withdrawal.");
                    }
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1 for deposit or 2 for withdrawal.");
        }
    }
}
