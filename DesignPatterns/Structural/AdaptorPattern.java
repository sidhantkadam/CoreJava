package DesignPatterns.Structural;

    /*
    Two incompatible interfaces or systems can cooperate by using the adapter design pattern.
    Because of incompatible interfaces, it serves as a bridge between two classes that would
    not otherwise be able to communicate.
    */


//Create Target Interface
interface CheckWeight {
    void weightInKg();
}

//Create Adaptee class (Not directly interact with client)
class WeightAdaptee {

    int weight;

    public WeightAdaptee(int weight) {
        this.weight = weight;
    }

    int weightInPounds() {
        return weight;
    }
}

//Create Adaptor class (To interact with client though Adaptee object)
class WeightAdaptor implements CheckWeight {

    private final WeightAdaptee adaptee;

    public WeightAdaptor(WeightAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void weightInKg() {
        int weightPounds = adaptee.weightInPounds();
        System.out.println(weightPounds + 0.8);
    }
}

public class AdaptorPattern {
    public static void main(String[] args) {

        //Client
        WeightAdaptor adaptor = new WeightAdaptor(new WeightAdaptee(20));
        System.out.print("Weight in KG : ");
        adaptor.weightInKg();
    }
}
