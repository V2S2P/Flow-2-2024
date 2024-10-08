import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // We create an object of the "File" class and we name it "file". The argument "Message.txt" is the name of the file we want to read.
        File file = new File("Message.txt");
        /* We declare a "Scanner" object and we name it "scanner" and initialize it to "null". The reason for initializing the Scanner to null is because the actual creation of the scanner
        will happen inside the "try" block. Initializing it up here will allow us to reference it in the "finally" block at the end.
        */
        Scanner scanner = null;

        // The "try" block is used to wrap the code that might throw an exception. Here we are attempting to open and read the file. If the file didn't exist, this is where "FileNotFoundExeption" would be thrown.
        try {
            scanner = new Scanner(file); // This is where we create a "Scanner" object. It will read from the "File" object we created called "file". It might throw an exception which is why it's inside the try block.
            if (scanner.hasNextLine()){
                String firstLine = scanner.nextLine();
                System.out.println("First line: " + firstLine);
            }

            System.out.println("All lines:");
            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e){ // This block catches the "FileNotFoundException", which is thrown if the file specified cannot be found.
            System.out.println("File not found: " + e.getMessage()); // We print that the file could not be found, and then we print the method "e.getMessage()" which will give more info.
        }finally { // The "finally" block is executed after the try-catch blocks and will execute regardless of whether an exception was thrown or not. We use it to close the scanner.
            if(scanner != null){ // If the scanner is not null (so if we created the scanner object successfully) then the scanner will close.
                scanner.close();
            }
        }
    }
}