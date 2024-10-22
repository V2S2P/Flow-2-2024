public class Pig extends Animal{
    public Pig(String name){
        super(name);
    }
    @Override
    public String getType(){
        return "Pig";
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + " goes oink!");
    }
}
