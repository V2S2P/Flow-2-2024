package ClassAndObjectExample;

public class Pokemon {
    //We give our pokemon a name and a level
    String name;
    int level;

    //We make a method "attack" that doesn't return anything, so we use void
    void attack(){
        System.out.println(name + " attack!");
    }
    /*A constructor is used if you want some code to happen when you create your object, like having some variables set initially.
    Constructors are special methods that get invoked as soon as an object is created.
    */
    Pokemon(){
        //Here we say that we want all pokemon objects that we create to be set to level 1
        level = 1;
    }

    //We can also create a constructor with parameters
    Pokemon(String pName, int pLevel){
        //And inside we just set the actual variables to be equal to what gets passed in to our parameters
        name = pName;
        level = pLevel;
    }

    //If we create a constructor and use the same names for both our parameters and our variables in the body, we can use the "this" keyword.
    Pokemon(String name, int level){
        //What's happening here is that java will always use the most local variables it can, so here it will just set name to be name and
        //level to be level from the constructor and not from our instance variables at the top. But we can use "this" keyword to get around it.
        this.name = name;
        this.level = level;
        //What "this" does it is tells java to use the variables that are actually defined in the class, the instance variables at the top.
    }
}
