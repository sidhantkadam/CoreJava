package DesignPatterns.Structural;

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
