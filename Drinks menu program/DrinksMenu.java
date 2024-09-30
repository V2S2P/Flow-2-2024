import java.util.*;
public class DrinksMenu{
	ArrayList<String> alcoholDrinks = new ArrayList<>();
	ArrayList<String> nonAlcoholDrinks = new ArrayList<>();
	ArrayList<String> selectedDrinks = new ArrayList<>();

	public DrinksMenu(){
		alcoholDrinks.add("Beer");
		alcoholDrinks.add("Wine");
		alcoholDrinks.add("Whiskey");

		nonAlcoholDrinks.add("Juice");
		nonAlcoholDrinks.add("Soda");
		nonAlcoholDrinks.add("Water");
		nonAlcoholDrinks.add("Sparkling Water");
		nonAlcoholDrinks.add("Milkshake");
		nonAlcoholDrinks.add("Virgin vodka");

	}

	public void display(int age){
		System.out.println();
		if(age >= 18){
			System.out.println("Alcohol Menu");
			for (int i = 0; i < alcoholDrinks.size() ; i++) {
				System.out.println((i+1) + ": " + alcoholDrinks.get(i));
				}
				System.out.println("\nNon-Alcohol Menu");
				for (int j = 0; j< nonAlcoholDrinks.size() ; j++) {
					System.out.println((j+4) + ": " + nonAlcoholDrinks.get(j));

			}
		}else{
			System.out.println("Non-Alcohol Menu");
			for (int j = 0; j< nonAlcoholDrinks.size() ; j++) {
					System.out.println((j+1) + ": " + nonAlcoholDrinks.get(j));
			}
		}

	}
	public int getUserChoice(Scanner scanner, int age){
		System.out.println("Enter your choice (1,2,3 for alcohol, 4 to 9 for non-alcohol, or 10 to view selected drinks");
		return scanner.nextInt();
	}

	public void addDrinkToSelection(int choice, int age){
		if(age >= 18){
			if(choice >= 1 && choice <= alcoholDrinks.size()){
				selectedDrinks.add(alcoholDrinks.get(choice - 1));
				System.out.println(alcoholDrinks.get(choice - 1) + " added to your selection");
			}else if(choice >= 4 && choice <= 9){
					selectedDrinks.add(nonAlcoholDrinks.get(choice - 4));
				System.out.println(nonAlcoholDrinks.get(choice - 4) + " added to your selection");
			}else if(choice == 10){
				displaySelectedDrinks();
			}else{
				System.out.println("Invalid choice. Please choose again.");
			}
		}else{
			if(choice >= 1 && choice <= nonAlcoholDrinks.size()){
				selectedDrinks.add(nonAlcoholDrinks.get(choice - 1));
				System.out.println(nonAlcoholDrinks.get(choice - 1) + " added to your selection.");
			}else if (choice == 10){
				displaySelectedDrinks();
			}else{
				System.out.println("Invalid choice. Please choose again.");
			}
		}
	}

	public void displaySelectedDrinks(){
		if(selectedDrinks.isEmpty()){
			System.out.println("You have not selected any drinks.");
		}else{
			System.out.println("Your selected drinks are:");
			for (String drink : selectedDrinks) {
				System.out.println("- " + drink);
			}
		}
	}
}