import java.util.*;

public class TestPrompt{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);


		System.out.println("Write your name: ");

		String input = scanner.nextLine();
			System.out.println("Hello " + input);
	}
}