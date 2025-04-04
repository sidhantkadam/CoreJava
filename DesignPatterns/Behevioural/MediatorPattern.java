package DesignPatterns.Behevioural;

    /*
    The Mediator Design Pattern simplifies communication between multiple objects in a system
    by centralizing their interactions through a mediator.
    Instead of objects interacting directly, they communicate via a mediator,
    reducing dependencies and making the system easier to manage.
    Its also helps in implementing loose coupling between objects.
    */

//Colleague Interface
interface Airplane {
    void requestTakeOff();

    void requestLanding();

    void notifyAirTrafficControl(String message);
}

//Concrete Colleague
class CommercialAirplane implements Airplane {

    AirTrafficController mediator;

    public CommercialAirplane(AirTrafficController mediator) {
        this.mediator = mediator;
    }

    @Override
    public void requestTakeOff() {
        mediator.requestTakeoff(this);
    }

    @Override
    public void requestLanding() {
        mediator.requestLanding(this);
    }

    @Override
    public void notifyAirTrafficControl(String message) {
        System.out.println("Commercial Airplane: " + message);
    }
}

//Mediator Interface
interface AirTrafficController {
    void requestTakeoff(Airplane airplane);

    void requestLanding(Airplane airplane);
}

//Concrete Mediator
class AirportControlTower implements AirTrafficController {

    @Override
    public void requestTakeoff(Airplane airplane) {
        airplane.notifyAirTrafficControl("Request takeoff clearance..");
    }

    @Override
    public void requestLanding(Airplane airplane) {
        airplane.notifyAirTrafficControl("Request landing clearance..");
    }
}

public class MediatorPattern {
    public static void main(String[] args) {

        AirTrafficController controller = new AirportControlTower();
        Airplane airplane1 = new CommercialAirplane(controller);
        Airplane airplane2 = new CommercialAirplane(controller);

        airplane1.requestTakeOff();
        airplane2.requestLanding();
    }
}
