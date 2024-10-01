public class DrinkLogic{
	private String name;
	private float price;

	DrinkLogic(String name, float price){
		this.name = name;
		this.price = price;
	}

	/*public int display(int age){
		if(age >= 18){
			for(int i = 0; i < alcohol.size(); i++){
			System.out.println((i + 1) + ". "  + alcohol.get(i));
				for(int j = i+1; j < nonAlcohol.size(); j++){
					System.out.println((j + 1) + ". " + nonAlcohol.get(j));
				}
			}
		}
	}*/

	public String getName(){
		return name;
	}
	public float getPrice(){
		return price;
	}

	public String toString(){
		return name + " - $" + price;
	}
}