public class Die{
	int sides;


	int throwDice(int sides){
		return (int)(Math.random() * sides) + 1;
	}
}
