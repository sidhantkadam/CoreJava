package SOLID;

    /*
    Clients should not be forced to depend on methods they do not use.
    */

//Violates: The Waiter class does not need the method of decideMenu() and
// Manager class is not responsible for the methods cleanTable() and serveThePlates().

interface Restaurant {
    void decideMenu();

    void cleanTable();

    void serveThePlates();
}

class Waiter implements Restaurant {

    @Override
    public void decideMenu() {

    }

    @Override
    public void cleanTable() {

    }

    @Override
    public void serveThePlates() {

    }
}

class Manager implements Restaurant {

    @Override
    public void decideMenu() {

    }

    @Override
    public void cleanTable() {

    }

    @Override
    public void serveThePlates() {

    }
}

    /*
    Solution:
        We need to segregate the interfaces based on particular requirements
    */

interface waiterRequired {
    void cleanTable();
    void serveThePlates();
}

interface managerRequired {
    void decideMenu();
}

class ManagerClass implements managerRequired {
    @Override
    public void decideMenu() {

    }
}

class WaiterRequired implements waiterRequired {

    @Override
    public void cleanTable() {

    }

    @Override
    public void serveThePlates() {

    }
}

public class I_InterfaceSegregationPrinciple {
    public static void main(String[] args) {

    }
}
