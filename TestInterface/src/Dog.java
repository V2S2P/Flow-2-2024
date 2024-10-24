public class Dog extends All implements Animals {
    private String name;
    public Dog(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound(){
        System.out.println(name + " is a Dog, and goes woof woof!");
    }
}
