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
            String choice = promptText("Vælg en drink");//tjekke om brugeren skal vælge flere drinks
            promptText(msg);
            choices.add(choice);
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
