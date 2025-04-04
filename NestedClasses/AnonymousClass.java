package NestedClasses;

interface Greeting
{
    void sayHello();
}

public class AnonymousClass
{
    public static void main(String[] args)
    {

        //Anonymous Class
        Greeting gret1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello world !");
            }
        };

        Greeting gret = () -> {
            System.out.println("Hello World !");
        };
        gret.sayHello();
        gret1.sayHello();
    }
}
