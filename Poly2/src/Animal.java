abstract class Animal {
   private String name;
    public Animal(String name){
        this.name = name;
    }
    abstract void makeSound();
    abstract String getType();
    public void sleep(){
        System.out.println("The " + getType() +  " is sleeping zzz..");
    }
    public void shoutName(){
        System.out.println("This " + getType() + " is called " + name);
    }
    public String getName(){
        return name;
    }

}
