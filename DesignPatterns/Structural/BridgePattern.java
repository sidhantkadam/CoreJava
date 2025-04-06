package DesignPatterns.Structural;

    /*
    The Bridge design pattern allows you to separate the abstraction from the implementation.
    */

//Create abstract class (contains the reference to the implementer)
abstract class Vehicle {
    Workshop workshop1;
    Workshop workshop2;

    public Vehicle(Workshop workshop1, Workshop workshop2) {
        this.workshop1 = workshop1;
        this.workshop2 = workshop2;
    }

    abstract void manufacture();
}

class Car extends Vehicle {
    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.print("Car");
        workshop1.work();
        workshop2.work();
    }
}

class Bike extends Vehicle {

    public Bike(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    void manufacture() {
        System.out.print("Bike");
        workshop1.work();
        workshop2.work();
    }
}

interface Workshop {
    void work();
}

class Assembled implements Workshop {

    @Override
    public void work() {
        System.out.print(" Assembled");
    }
}

class Produced implements Workshop {

    @Override
    public void work() {
        System.out.print(" And");
        System.out.println(" Produced");
    }
}

public class BridgePattern {
    public static void main(String[] args) {

        Vehicle car = new Car(new Assembled(), new Produced());
        car.manufacture();

        Vehicle bike = new Bike(new Assembled(), new Produced());
        bike.manufacture();
    }
}
