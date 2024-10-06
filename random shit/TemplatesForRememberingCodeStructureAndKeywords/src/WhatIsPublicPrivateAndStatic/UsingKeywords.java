package WhatIsPublicPrivateAndStatic;

public class UsingKeywords {
    public static void main(String[] args) {
        UsingKeywords.howAreYou();
    }

    public static void sayHi(){
        //sayHi is a public method, so this means that sayHi method can be accessed inside the class and outside the class. So we can call this
        //method in our "Main" class. It can be accessed by other classes because it has "public" keyword.
        hello();

    }
    private static void hello(){
        //If we try to access this method in our "Main" class, we won't be able to do so because private means it can only be accessed in it's own
        //class. Something we can do though, is taking our "hello" method and calling it in our public "sayHi" method.
    }

    private static void howAreYou() {
        //Here we use the static keyword, it allows us to call a method using the class name. An example will be made in the main method.
        //If we remove the static keyword from the method, we won't be able to see this method using the .(dot) operator in the main method.
        //So to sum it up, if we want to access something using the class name, we have to make the method we want to use "static"
    }
}
