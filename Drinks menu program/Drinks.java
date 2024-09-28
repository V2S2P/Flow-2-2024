import java.util.*;
public class Drinks{
	public static void main(String[] args){
		ArrayList<String> alcoholDrinks = new ArrayList<>();
		alcoholDrinks.add("Beer");
		alcoholDrinks.add("Wine");
		alcoholDrinks.add("Whiskey");

		ArrayList<String> nonAlcoholDrinks = new ArrayList<>();
		nonAlcoholDrinks.add("Juice");
		nonAlcoholDrinks.add("Soda");
		nonAlcoholDrinks.add("Water");
		nonAlcoholDrinks.add("Sparkling Water");
		nonAlcoholDrinks.add("Milkshake");
		nonAlcoholDrinks.add("Virgin vodka");

		ArrayList<String> selectedDrinks = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to The Bar, please enter your age to see our menus: ");
		int age = scanner.nextInt();
		
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

		
		boolean running = true;
		while(running){
			System.out.println("Enter your choice (1, 2, 3 for alcohol, 4 to 9 for non-alcoholic drinks, or 10 to view selected drinks): ");
		int choice = scanner.nextInt();
		
		if(age >= 18){
			switch (choice) {
		case 1: case 2: case 3:
			if(choice >= 1 && choice <= alcoholDrinks.size()){
				selectedDrinks.add(alcoholDrinks.get(choice - 1));
				System.out.println(alcoholDrinks.get(choice - 1) + " added to your selection");
			}else{
				System.out.println("Invalid choice.");
			}
			break;
		case 4: case 5: case 6: case 7: case 8: case 9:
			if(choice >= 4 && choice <= 9){
				selectedDrinks.add(nonAlcoholDrinks.get(choice - 4));
				System.out.println(nonAlcoholDrinks.get(choice - 4) + " added to your selection");
			}else{
				System.out.println("Invalid choice");
			}
			break;
		case 10:
			if(selectedDrinks.isEmpty()){
				System.out.println("You have not selected any drinks.");
			}else{
				System.out.println("Your selected drinks are:");
				for (String drink :selectedDrinks) {
					System.out.println("- " + drink);
					}
				}
				break;
			default:
				System.out.println("Invalid choice. Please choose again.");
			}
		}else{
			switch(choice){
			case 1: case 2: case 3: case 4: case 5: case 6:
				if(choice >= 1 && choice <= nonAlcoholDrinks.size()){
				selectedDrinks.add(nonAlcoholDrinks.get(choice - 1));
				System.out.println(nonAlcoholDrinks.get(choice - 1) + " added to your selection");
			}else{
				System.out.println("Invalid choice.");
			}
			break;
		case 10:
			if(selectedDrinks.isEmpty()){
				System.out.println("You have not selected any drinks.");
			}else{
				System.out.println("Your selected drinks are:");
				for (String drink : selectedDrinks) {
					System.out.println("- " + drink);
				}
			}
			break;
		default:
			System.out.println("Invalid choice. Please choose again.");
			}
		}

		System.out.println("Would you like to select another drink or view your cart? (y/n)");
		String continueSelection = scanner.next();
		if(!continueSelection.equalsIgnoreCase("y")){
			running = false;
			}
		}

		if(!selectedDrinks.isEmpty()){
			System.out.println("You have selected the following drinks to purchase");
			for (String drink : selectedDrinks) {
				System.out.println("- " + drink);
			}
		}else{
			System.out.println("No drinks selected");
		}

		scanner.close();
	}
}