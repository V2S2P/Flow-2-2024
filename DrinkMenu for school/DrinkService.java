import java.util.*;
public class DrinkService{
	private ArrayList<DrinkMenu> alcoholDrinks;
	private ArrayList<DrinkMenu> nonAlcoholDrinks;
	private Scanner scanner;

	// Constructor initializes the two ArrayLists of drinks(alcoholDrinks and nonAlcoholDrinks) and sets up a "Scanner" object for taking user input.
	public DrinkService(ArrayList<DrinkMenu> alcoholDrinks, ArrayList<DrinkMenu> nonAlcoholDrinks){
		this.alcoholDrinks = alcoholDrinks;
		this.nonAlcoholDrinks = nonAlcoholDrinks;
		this.scanner = new Scanner(System.in);
	}

	// We start by asking the user for their age to determine which ArrayList to use.
	public void startService(){
		System.out.println("Welcome to Expensive Drinks! Please enter your age:");
		int age = scanner.nextInt(); // scanner is stored in our "age" variable, so the user input will be put into "age".
		ArrayList<DrinkMenu> availableDrinks = getDrinksBasedOnAge(age); // Based on the age input, the program determines which set of drinks to show.

		presentDrinks(availableDrinks); // Once the "availableDrinks" has been determined, they are displayed using "presentDrinks(availableDrinks)" method.

		System.out.println("How many drinks would you like?"); // We ask the user how many drinks they would like to buy.
		int drinkCount = scanner.nextInt(); // 
		scanner.nextLine();

		ArrayList<DrinkMenu> customerOrder = collectOrder(availableDrinks, drinkCount); // We make a "customerOrder" list that will hold the order of our user (collectOrder method)

		printOrder(customerOrder); // We print the users order and the total cost using "printOrder()" method.
	}

	private ArrayList<DrinkMenu> getDrinksBasedOnAge(int age){ // This method determines whether the user can see the alcoholic menu or the non-alcoholic menu.
		if(age >= 18){ // If the user is 18 or above we show them the alcoholic menu using "return alcoholDrinks" which returns our alcohol list
			System.out.println("You are eligible for alcoholic drinks.");
			return alcoholDrinks;
		}else{
			System.out.println("You can only choose from non-alcoholic drinks.");
			return nonAlcoholDrinks;
		}
	}

	private void presentDrinks(ArrayList<DrinkMenu> drinks){ // This method prints the available drinks to the user. We use the "drinks" ArrayList as parameter.
		System.out.println("Here are the available drink choices:");
		for (int i = 0; i < drinks.size(); i++ ) { // We loop through the "drinks" list and print each drink's name and price in a numbered format.
			DrinkMenu drink = drinks.get(i);
			System.out.println((i + 1) + "- " + drink.getName() + "... " + drink.getPrice() + " Kr");
		}
	}

	private ArrayList<DrinkMenu> collectOrder(ArrayList<DrinkMenu> availableDrinks, int drinkCount){ // This method collects the users order.
		ArrayList<DrinkMenu> customerOrder = new ArrayList<>(); // We create a new ArrayList we name "customerOrder", it will store the drinks the user selects.
		for (int i = 0 ; i < drinkCount ; i++) { // We use a for loop to iterate once for each drink the customer wants to order (example: 3 drinks means the loop runs 3 times)
			System.out.println("Please enter the number of the drink you'd like (1-" + availableDrinks.size() + "):"); // We ask the user to enter a number between 1 and the total number of drinks available.
			int drinkChoice = scanner.nextInt() - 1; // We read the users input with a scanner and store it in "drinkChoice". We adjust the input of the user so it matches with zero-index.
			customerOrder.add(availableDrinks.get(drinkChoice)); // We add the users chosen drink to "customerOrder". "availableDrinks.get(drinkChoice))" finds the drink object from the "availableDrinks" list at the index of the users choice.
		}
		return customerOrder; // After the loop is done (when the user has chosen all their drinks), the method returns the "customerOrder" list, which contains all the drinks the user chose.
	}

	private void totalCost(ArrayList<DrinkMenu> order){ // This method prints out the total cost of the drinks the user selected.
		float total = 0;

		for (DrinkMenu drink: order) { // We loop through the "order" list, adding up the prices of the drinks selected.
			total += drink.getPrice(); // our variable "total" holds the sum of the selected drinks.
		}

		System.out.println("Your total will be: " + total + " DKK"); // We print out a message with the total price for the selected drinks.
	}

	private void printOrder(ArrayList<DrinkMenu> order){ // We print each drink the user selected. 
		System.out.println("Here is your order:");
		for (DrinkMenu drink : order) { // We loop through the "order" list (that now contains the selected drinks) and then we print each drink's name and price.
			System.out.println(drink.getName() + " - " + drink.getPrice() + " Kr");
		}
		totalCost(order); // After printing out the drinks we call the "totalCost(order)" method that will print out the total price.
	}
}