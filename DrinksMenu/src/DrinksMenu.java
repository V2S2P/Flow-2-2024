package src;

import java.util.ArrayList;
import java.util.Scanner;

class DrinksMenu{


  public static void main(String[] args) {

      // TODO 1: Skriv en TextUI klasse og tilføj en instans af TextUI her, som til sidst skal erstatte direkte brug af Scanner objeketet i denne klasse.
      Scanner scan = new Scanner(System.in);
      TextUI ui = new TextUI();


   /*
   Vi beder om brugerens alder
   */

      // TODO 2: Reducer dette til én linje ved at anvende TextUI metoden promptNumeric() i stedet for
       int age = ui.promptNumeric("Hvor gammel er du?");


    /*
    Vi vil nu sammensætte en drinksmenu der afhænger af brugerens alder
    Vi placerer valgmulighederne i en liste - så kan den genbruges et andet sted i systemet.
    */


      ArrayList<String> options = new ArrayList<String>();

      if (age >= 18) {
          options.add("Gin&Tonic");
          options.add("Martini");
          options.add("Gin&Hass");

      } else {
          options.add("Milk");
          options.add("Juice");
          options.add("Saftevand");

      }
      options.add("vand");


    /*
     Vi viser listen til brugeren
     */

      //TODO 3: Reducer dette til en linje ved at anvende TextUI metoden displayList() i stedet for
      ui.displayList(options,"hvad ville du have at drikke");





    /*
    Vi spørger om antal af drinks, så vi ved mange gange vi skal prompte i while loopet længere nede.
    Hvert valg placerer vi i en liste, så vi kan udskrive bestillingen tilsidst.
    */

      // TODO 4: anvend TextUI's promptNumeric metode, i stedet for disse to linjer
      ui.promptNumeric("Hvor mange drinks vil du bestille?");   //Give brugere et sted at placere sit svar og vente på svaret


      //TODO 5: Reducer 6 linjer til 1 linje ved at anvende TextUI metoden promptChoice() i stedet for
      ArrayList<String> choices = ui.promptChoice(options,age,"drinks");  //Lave en beholder til at gemme brugerens valg




      /*
      Vi viser brugerens bestilling
      */
      //TODO 6: Genbrug TextUI metoden displayList(choices) i stedet for
      ui.displayList(choices,"Din bestilling:");



   /* Mulige forbedringer af denne dialog:
    1. Valgmulighederne printes med et tal, så man bare taster et tal for en bestemt drink - hvor kan vi ændre på det og hvordan?
    2. Validering af at det der er blevet lagt ind i choices rent faktisk findes i menuen - som det er nu kan man bestille hvad somhelst.
    3. Refaktorering: det hele bør ikke ligge inde i main.
       a. Vi bør refaktorere for at minimere gentagelser (DRY) fx. visning af lister,
       b. men vi bør også refaktorere for at kunne genbruge dialog mønsteret i et helt andet projekt, hvor det ikke nødvendigvis handler om drinks, men om en anden slags menu.
    */



  }

}