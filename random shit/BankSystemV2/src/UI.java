import java.util.Scanner;
import java.util.ArrayList;
public class UI {
    private Scanner scanner;

    public UI() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMsg(String s) {
        System.out.println(s);
    }

    public int promptNumeric(String msg) {
        displayMsg(msg);
        int input = 0;
        try {
            input = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            displayMsg("Invalid input. Please enter a numeric value.");
            input = promptNumeric(msg);
        }
        return input;
    }

    public String promptText(String msg) {
        displayMsg(msg);
        return scanner.nextLine();
    }

    public int promptChoice(String msg, ArrayList<String> list) {
        displayMsg(msg);
        for (int i = 0; i < list.size(); i++) {
            displayMsg((i + 1) + ". " + list.get(i));
        }
        int choice = 0;
        boolean validChoice = false;
        while (!validChoice) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= list.size()) {
                    validChoice = true;
                } else {
                    displayMsg("Invalid choice. Please choose a number between 1 and " + list.size() + ".");
                }
            } catch (NumberFormatException e) {
                displayMsg("Invalid input. Please enter a numeric value.");
            }
        }
        return choice;
    }
}
