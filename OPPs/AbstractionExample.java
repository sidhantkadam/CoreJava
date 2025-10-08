package OPPs;

    /*
        Data Abstraction is the property by virtue of which only the essential details are
        displayed to the user.
    */

abstract class Bike {
    abstract void brakes(String message);
}

class SportsBike extends Bike {
    @Override
    void brakes(String message) {
        System.out.println(message);
    }
}

class DirtBike extends Bike {
    @Override
    void brakes(String message) {
        System.out.println(message);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Bike sb = new SportsBike();
        sb.brakes("Sports Bike is stopped !");

        Bike dt = new DirtBike();
        dt.brakes("Dirt Bike is stopped !");
    }
}
