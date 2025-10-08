package Java9AndBeyond;

//Sealed Interface
sealed interface VehicleType permits Car, Truck {
    void vehicleType();
}

final class Car extends Vehicle implements VehicleType {

    @Override
    public void print() {
        System.out.println("CAR");
    }

    @Override
    public void vehicleType() {
        System.out.println("FOUR WHEELER");
    }
}

final class Truck extends Vehicle implements VehicleType {

    @Override
    public void print() {
        System.out.println("TRUCK");
    }

    @Override
    public void vehicleType() {
        System.out.println("SIX WHEELER");
    }
}

//Sealed Class
sealed abstract class Vehicle permits Car, Truck {
    public abstract void print();
}

class Dog {

}

public class SealedClassesExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();

        Vehicle vehicle1 = new Truck();
        vehicle1.print();
    }
}
