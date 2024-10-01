import java.util.*;
public class DrinkMain{
	public static void main(String[] args){
		ArrayList<DrinkLogic> alcohol = new ArrayList<>();
		ArrayList<DrinkLogic> nonAlcohol = new ArrayList<>();

		alcohol.add(new DrinkLogic("Vodka",10));
		alcohol.add(new DrinkLogic("Beer",20));
		alcohol.add(new DrinkLogic("Whiskey",30));

		nonAlcohol.add(new DrinkLogic("Virgin Vodka",50));
		nonAlcohol.add(new DrinkLogic("Virgin Beer",60));
		nonAlcohol.add(new DrinkLogic("Virgin Whiskey",70));
		nonAlcohol.add(new DrinkLogic("Virgin Coke", 100));

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		if(age >= 18){
			for(int i = 0; i < alcohol.size(); i++){
			System.out.println((i + 1) + ". "  + alcohol.get(i));
				}
				for(int j = 0; j < nonAlcohol.size(); j++){
					System.out.println((j + alcohol.size() + 1) + ". " + nonAlcohol.get(j));
			}
		}else{
			for(int i = 0; i < nonAlcohol.size(); i++){
					System.out.println((i + 1) + ". " + nonAlcohol.get(i));
			}
		}
	}
}