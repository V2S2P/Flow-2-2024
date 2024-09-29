public class Game{
	public static void main(String[] args){
		Die die = new Die();
		Die die1 = new Die();

		int result1 = die.throwDice(6);
		int result2 = die1.throwDice(6);

		System.out.println("Die 1: " + result1);
		System.out.println("Die 2: " + result2);

	
		if(result1==result2){
			System.out.println("It's a tie!");
		}else{
			int higher = die.resultOfDieThrow(result1, result2);
			System.out.println("The higher roll is: " + higher);
		}
	}
}
