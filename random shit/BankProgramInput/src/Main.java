import java.util.*;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        String name;
        int password;
        int attempts = 4;
        int accountNum;
        double amount;
        final int MAX = 999999999;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();

        //we set the acountNum to be random between 0 and our MAX number
        accountNum = rand.nextInt(MAX);

        System.out.println("Enter full name: ");
        name = keyboard.nextLine();

        for (int i = 0; i < attempts; i++) {
            System.out.println("Enter password: ");
            password = keyboard.nextInt();
            if(password == 290801){
                System.out.println("Welcome " + name);
                break; // Correct password entered, exit loop
            } else {
                if (i < attempts - 1) {
                    if (i == attempts - 2) {             //this expression calculates the number of attempts remaining
                        System.out.println("Wrong password. " + (attempts - i - 1) + " attempt(s) remaining" + "\nHint: Try your birthday.");
                    } else {
                        System.out.println("Wrong password, please try again. " + (attempts - i - 1) + " attempt(s) remaining.");
                    }
                } else {
                    System.out.println("You have exceeded the maximum number of attempts. Exiting program.");
                    System.exit(0); // Exit the program
                }
        }
    }



        System.out.println("Enter amount to deposit: ");
        amount = keyboard.nextDouble();

        Account acct1 = new Account(name, accountNum, amount);

        System.out.println(acct1.toString());
    }
}

/*
Explaining the for loop
This is a standard for loop structure in Java.
int i = 0; initializes a variable i with a value of 0. This variable is used to keep track of the current attempt number.
i < attempts; is the condition that checks whether the current value of i is less than the maximum number of attempts (attempts).
If i is less than attempts, the loop continues; otherwise, it terminates.
i++ increments the value of i by 1 after each iteration of the loop.
*/

/*
Explaining the attempts - i - 1 expression
This expression calculates the number of attempts remaining.
"attempts" is the total number of attempts allowed.
'i' is the current attempt number.
(attempts - i - 1) subtracts the current attempt number from the total attempts allowed and then subtracts 1 to adjust for zero-based indexing.
This gives the number of remaining attempts after the current attempt.
For example, if attempts is 3 and i is 1, the expression evaluates to 1.
This means there is one attempt remaining after the current attempt.
If i is 2, the expression evaluates to 0, indicating that it's the last attempt.
 */