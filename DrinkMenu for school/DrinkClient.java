import java.util.*;
public class DrinkClient{
	public static void main(String[] args){

		// Creating ArrayLists of type "DrinkMenu" with name and price from our "DrinkMenu" class constructor
		ArrayList<DrinkMenu> alcohol = new ArrayList<>(Arrays.asList(
			new DrinkMenu("Vodka",25),
			new DrinkMenu("Beer",30),
			new DrinkMenu("Whiskey",45)));
		ArrayList<DrinkMenu> nonAlcohol = new ArrayList<>(Arrays.asList(
			new DrinkMenu("Virgin Vodka",60),
			new DrinkMenu("Virgin Beer",70),
			new DrinkMenu("Virgin Whiskey",80)));

			// We instansiate our "DrinkService" object and pass our two ArrayList as arguments so that the "DrinkService" class can manage them.
			DrinkService drinkService = new DrinkService(alcohol, nonAlcohol);

			// We call our "startService" method from "DrinkService" class which initiates the main logic of the program.
			drinkService.startService();
	}
}