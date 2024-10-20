import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RandomNumber random = new RandomNumber();
        //System.out.println(random);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number between 0 and 99");

        boolean running = true;
        while (running) {
            String input = scanner.next();

            try {

                int result = Integer.parseInt(input);

                if (result == random.getWinningNum()) {
                    System.out.println("You guessed the correct number, congrats!");
                    running = false;
                } else if (result > random.getWinningNum()) {
                    System.out.println("You guessed a bit too high, try a smaller number.");
                } else if (result < random.getWinningNum()) {
                    System.out.println("You guessed a bit too low, try a higher number.");
                } else {
                    System.out.println("Invalid input, please only try whole numbers.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input + " + e.getMessage());
            }
        }
    }
}