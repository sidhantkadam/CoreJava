package DesignPatterns.Structural;

    /*
    Before we go into the details, visualize a structure. The house is the facade, it is
    visible to the outside world, but beneath it is a working system of pipes, cables, and
    other components that allow the building to run. It provides an easy-to-use interface so
    that users may interact with the system.
    Design Pattern provides a unified interface to a set of interfaces in a subsystem.
    Facade defines a high-level interface that makes the subsystem easier to use.
    */

//Create common interface for Hotels many hotels which returns menus
interface Hotels {
    Menus getMenus();
}

//Create concrete classes for different Hotels to implement common interface Hotels
class VegHotels implements Hotels {

    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}

class NonVegHotels implements Hotels {

    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}

class BothHotels implements Hotels {

    @Override
    public Menus getMenus() {
        return new Both();
    }
}

interface Menus {
    void getMenus();
}

class VegMenu implements Menus {

    @Override
    public void getMenus() {
        System.out.println("Displaying the veg menu");
    }
}

class NonVegMenu implements Menus {
    @Override
    public void getMenus() {
        System.out.println("Displaying the Non-veg menu");
    }
}

class Both implements Menus {
    @Override
    public void getMenus() {
        System.out.println("Displaying the both menus..");
    }
}

//Create facade interface
interface HotelKeeper {
    VegMenu getVegMenu();

    NonVegMenu getNonVegMenu();

    Both getBoth();
}

//Create implementation of HotelKeeper interface
class HotelKeeperImpl implements HotelKeeper {

    @Override
    public VegMenu getVegMenu() {
        VegHotels vegHotels = new VegHotels();
        VegMenu vegMenu = (VegMenu) vegHotels.getMenus();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegHotels nonVegHotels = new NonVegHotels();
        NonVegMenu nonVegMenu = (NonVegMenu) nonVegHotels.getMenus();
        return nonVegMenu;
    }

    @Override
    public Both getBoth() {
        BothHotels bothHotels = new BothHotels();
        Both both = (Both) bothHotels.getMenus();
        return both;
    }
}

public class FacadePattern {
    public static void main(String[] args) {
        HotelKeeper keeper = new HotelKeeperImpl();

        VegMenu v = keeper.getVegMenu();
        NonVegMenu nv = keeper.getNonVegMenu();
        Both both = keeper.getBoth();
        v.getMenus();
        nv.getMenus();
        both.getMenus();
    }
}
