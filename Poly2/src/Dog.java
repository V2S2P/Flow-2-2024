public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public String getType(){
        return "Dog";
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + " goes woof!");
    }
}
