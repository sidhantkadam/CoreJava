package SOLID;

    /*
    Derived or child classes must be substitutable for their base or parent classes
    */

//Violates: After modification we cannot change the BookDelivery superclass
//with AudioBookDeliverySubclass without breaking the application.
class BookDelivery {
    String title;
    Integer userId;
    void getDeliveryLocations(){

    }
}

class PosterMapDelivery extends BookDelivery {
    @Override
    void getDeliveryLocations() {
        super.getDeliveryLocations();
    }
}

class AudioBookDelivery extends BookDelivery{
    @Override
    void getDeliveryLocations() {
        super.getDeliveryLocations();

        /*
        Can't be implemented since,
        Audio book doesn't have a physical locations
        */
    }
}

//Solution: We can split up the NewBookDelivery superclass in equivalent
//subclasses (OfflineDelivery and OnlineDelivery)
class NewBookingDelivery{
    String title;
    int userId;

}

class OfflineDelivery extends NewBookingDelivery {
    void getDeliveryLocation() {

    }
}

class OnlineDelivery extends NewBookingDelivery {
    void getSoftwareOptions() {

    }
}

class NewPosterMapDelivery extends OfflineDelivery{
    @Override
    void getDeliveryLocation() {
        super.getDeliveryLocation();
    }
}

class NewAudioBookDelivery extends OnlineDelivery{
    @Override
    void getSoftwareOptions() {
        super.getSoftwareOptions();
    }
}

public class L_LiskovSubstitutionPrinciple {
    public static void main(String[] args) {

    }
}
