package SOLID;

    /*
    Open for Extension and closed for modification.
    */

//Violates: ProcessPayment class contains the method related to payment based on payment type,
//If new paymentMethod is come, this class need to change.

class ProcessPayment {
    public void makePayment(String type) {
        if (type.equals("Card")) {
            System.out.println("Card Payment");
        } else if (type.equals("Cash")) {
            System.out.println("Cash Payment");
        }
    }
}

//Solution: We created the interface for each/new class with payment method
interface Payment {
    void makePayment(String type);
}

class CardPayment implements Payment {
    @Override
    public void makePayment(String type) {
        System.out.println("Payment using : " + type);
    }
}

class CashPayment implements Payment {
    @Override
    public void makePayment(String type) {
        System.out.println("Payment using :" + type);
    }
}

public class O_OpenClosedPrinciple {
    public static void main(String[] args) {
        Payment cardPayment = new CardPayment();
        cardPayment.makePayment("card");

        Payment cashPayment = new CashPayment();
        cashPayment.makePayment("cash");
    }
}
