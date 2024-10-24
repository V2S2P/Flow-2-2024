public class Cat implements Animals {
    private String name;
    public Cat(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is a Cat, and says meow meow");
    }
}
