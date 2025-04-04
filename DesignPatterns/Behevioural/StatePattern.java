package DesignPatterns.Behevioural;

    /*
    Design pattern that allows an object to alter its behavior when its internal state changes.
    It's achieves by encapsulating the object’s behavior within different state objects, and the
    object itself dynamically switches between these state objects depending on its current state.
    */

//State Interface
interface VendingMachineState {
    void handelRequest();
}

//Create Concrete State classes
class ReadyState implements VendingMachineState {

    @Override
    public void handelRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}

class ProductSelectedState implements VendingMachineState {

    @Override
    public void handelRequest() {
        System.out.println("Product selected state: Processing payment.");
    }
}

class PaymentPendingState implements VendingMachineState {

    @Override
    public void handelRequest() {
        System.out.println("Payment pending state: Dispensing product.");
    }
}

class OutOfStockState implements VendingMachineState {

    @Override
    public void handelRequest() {
        System.out.println("Out of stock state: Product unavailable. " +
                "Please select another product.\"");
    }
}

//Create Context
class VendingMachineContext {
    VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handelRequest();
    }
}

public class StatePattern {
    public static void main(String[] args) {

        //create context
        VendingMachineContext context = new VendingMachineContext();

        //set initial state
        context.setState(new ReadyState());
        //request state change
        context.request();

        context.setState(new ProductSelectedState());
        context.request();

        context.setState(new PaymentPendingState());
        context.request();

        context.setState(new OutOfStockState());
        context.request();
    }
}
