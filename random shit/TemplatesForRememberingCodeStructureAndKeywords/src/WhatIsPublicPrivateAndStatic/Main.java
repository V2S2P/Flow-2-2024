package WhatIsPublicPrivateAndStatic;

public class Main {
    public static void main(String[] args) {
        //Writing the class name and using the .(dot) operator shows that we can't actually see the private "hello" method. We can see our
        //"sayHi" method though, and that is because it is public.
        UsingKeywords.sayHi();
    }
}
