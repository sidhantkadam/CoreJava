package Association.Composition;

class Car {
    private final Engine engine;
    private final GearBox gearBox;

    public Car() {
        engine = new Engine("BS6", "2000HP");           //Composition (Strong bond)
        gearBox = new GearBox("6", "Ultimate");            //Composition (Strong bond)
    }

    public void ready() {
        engine.loadEngine();
        gearBox.loadGearBox();
        System.out.println("Car is ready..");
    }
}

class Engine {
    private final String engineType;
    private final String enginePower;

    public Engine(String engineType, String enginePower) {
        this.engineType = engineType;
        this.enginePower = enginePower;
    }

    public void loadEngine() {
        System.out.println(this.engineType + " is loaded..with horse power of " + this.enginePower);
    }
}

class GearBox {
    private final String totalGears;
    private final String gearTypes;

    public GearBox(String totalGears, String gearTypes) {
        this.totalGears = totalGears;
        this.gearTypes = gearTypes;
    }

    public void loadGearBox() {
        System.out.println("Gearbox is loaded with gear type of " + this.gearTypes + " and total gears : " + this.totalGears);
    }
}

public class CompositionClass {
    public static void main(String[] args) {
        Car car = new Car();
        car.ready();
    }
}
