public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public String getType(){
        return "Cat";
    }
    @Override
    public void makeSound(){
        System.out.println(getName() + " goes Meow!");
    }
}
