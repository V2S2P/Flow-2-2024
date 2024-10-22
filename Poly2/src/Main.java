import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Max");
        Animal cat = new Cat("Chilli");
        Animal pig = new Pig("Fat Hank");

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(pig);

        for (Animal a: animals){
            a.shoutName();
        }
        dog.sleep();
        cat.sleep();
    }
}