package src;

import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    public TextUI(){
        this.scanner = new Scanner(System.in);
    }


    public String promptText(String msg){
        System.out.println(msg);//Stille brugeren et spørgsmål
        /*String input = scanner.nextLine();          //Give brugere et sted at placere sit svar og vente på svaret
        int age = Integer.parseInt(input);
        return "";
         */
        return scanner.nextLine();
    }
    public int promptNumeric(String msg){
        System.out.println(msg);//Stille brugeren et spørgsmål
        String input = scanner.nextLine();          //Give brugere et sted at placere sit svar og vente på svaret
        int age = Integer.parseInt(input);
        return age;
    }

    public ArrayList<String> promptChoice(ArrayList<String> options, int limit, String msg){
        displayList(options,msg);
        ArrayList<String> choices = new ArrayList<>();

        while(choices.size() < limit) {
            String choice = promptText("Indtast nummeret på din drink:");
            try{
                int index = Integer.parseInt(choice) -  1;
                if (index >= 0 && index < options.size()){
                    choices.add(options.get(index));
                }else{
                    System.out.println("Ugyldigt valg, prøv igen.");
                }
            } catch (NumberFormatException e){
                System.out.println("Indtast venligst et gyldigt nummer.");
            }
        }
        return choices;
    }
    public void displayList(ArrayList<String> options, String msg){
        System.out.println(msg);
        for (String option : options) {
            System.out.println(option);
        }
    }
}
