import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animals Dog = new Dog("Max");
        Animals Cat = new Cat("Chilli");
        Animals Pig = new Pig("Hank");

        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(Dog);
        animals.add(Cat);
        animals.add(Pig);

        ((Dog) Dog).showAll(animals);
    }
}