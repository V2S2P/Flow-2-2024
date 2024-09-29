public class Die{
	int sides;


	int throwDice(int sides){
		return (int)(Math.random() * sides) + 1;
	}
	
	int resultOfDieThrow(int result1, int result2){
		if(result1 > result2){
			return result1;
		}else{
			return result2;
		}
	}
