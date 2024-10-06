package ClassAndObjectExample;

public class Main {
    public static void main(String[] args) {
        /*To declare and initialize an object. First we type the classname then give your object a name, and then actually
        actually create the object itself with the "new" keyword and then your classname.
         */
        Pokemon p1 = new Pokemon();
        //Now we have our object created, but we want to give it our variables we made in the Pokemon class
        p1.name = "Pikachu";
        p1.level = 10;
        System.out.println(p1.name + " " + p1.level);
        //Now we have one object, but we can create as many objects as we want
        Pokemon p2 = new Pokemon();
        p2.name = "Evee";
        p2.level = 20;
        //Now we will call the attack method we made in the Pokemon class
        p2.attack();
        /*It's important to remember that these objects have their own set of variables, so changing something about p1
        wont change anything about p2. Variables and methods are encapsulated within the object.
         */


        //We create a third pokemon object, "p3", and we will pass in our arguments that we created in our constructor. The variables "pName" and
        //"pLevel" are what represents our constructor.
        Pokemon p3 = new Pokemon("Piggy",5);
        System.out.println(p3.level);
        p3.attack();
    }
}
