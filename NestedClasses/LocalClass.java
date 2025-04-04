package NestedClasses;

class Car
{
    void startEngine()
    {
        class Engine
        {
            void run()
            {
                System.out.println("Engine is running !");
            }
        }
        Engine en = new Engine();
        en.run();
    }
}

public class LocalClass
{
    public static void main(String[] args)
    {
        Car car = new Car();
        car.startEngine();
    }
}
