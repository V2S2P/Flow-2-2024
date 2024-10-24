import java.util.ArrayList;

public abstract class All {
    public void showAll(ArrayList<Animals> animals){
        for (Animals a: animals){
            a.makeSound();
        }
    }
}
