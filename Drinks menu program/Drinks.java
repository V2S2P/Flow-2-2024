import java.util.*;
public class Drinks{
	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to The Bar, please enter your age to see our menus: ");
		int age = scanner.nextInt();
		
		
		DrinksMenu drinksMenu = new DrinksMenu();

		drinksMenu.display(age);

		boolean running = true;
		while(running){
			int choice = drinksMenu.getUserChoice(scanner, age);
			drinksMenu.addDrinkToSelection(choice,age);

			System.out.println("Would you like to select another drink or view your cart? (y/n)");
			String continueSelection = scanner.next();
			if (!continueSelection.equalsIgnoreCase("y")) {
				running = false;
			}
		}

		drinksMenu.displaySelectedDrinks();
		scanner.close();
	}
}
		
		