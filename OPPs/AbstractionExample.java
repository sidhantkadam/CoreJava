package OPPs;

abstract class Main {
    abstract void brakes(String message);
}

class SportsBike extends Main {
    void brakes(String message) {
        System.out.println(message);
    }
}

class DirtBike extends Main {
    void brakes(String message) {
        System.out.println(message);
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        SportsBike sb = new SportsBike();
        sb.brakes("Sports Bike is stopped !");

        DirtBike dt = new DirtBike();
        dt.brakes("Dirt Bike is stopped !");
    }
}
