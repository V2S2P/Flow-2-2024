public class Pig implements Animals{
    private String name;
    public Pig(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public void makeSound(){
        System.out.println(name + " is a Pig, and says oink oink!");
    }
}
