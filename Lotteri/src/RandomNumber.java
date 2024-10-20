import java.util.Random;

public class RandomNumber {
   private int winningNum;

   public RandomNumber(){
       Random rand = new Random();
       winningNum = rand.nextInt(100);
   }

   public int getWinningNum(){
       return winningNum;
   }
}
