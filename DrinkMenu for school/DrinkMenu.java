public class DrinkMenu{
	// Instance variables
	private String name; // name of the drinks
	private float price; // price of the drinks

	// Constructor that takes name and price as parameters and assigns them to the objects attributes.
	public DrinkMenu(String name, float price){
		this.name = name;
		this.price = price;
	}

	// Getter that allows access to these properties. Getter methods are used because our instance variables are private but we still need other classes to get name and price
	public String getName(){
		return name;
	}
	public float getPrice(){
		return price;
	}
}