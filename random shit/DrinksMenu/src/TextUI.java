import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {

    public static int promptNumeric(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        while (true) {
            try {
                int input = scanner.nextInt();
                return input;
                //scanner.nextLine(); // Consume newline character
            } catch (InputMismatchException e) {
                System.out.println("Fejl, skriv et tal.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
    }

    public static String promptText(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    public static void displayList(ArrayList<String> list){
        for(String item : list){
            System.out.println(item);
        }
    }
    public static String promptChoice(ArrayList<String> options){
        Scanner scan = new Scanner(System.in);
        System.out.println("Vælg en drik fra listen: ");
        String choice = scan.nextLine();
        options.add(choice);
        return choice;
    }
}

