package DesignPatterns.Creational;

//Create Abstract Factory Interface
interface CarFactory {
    Car createCar();

    CarSpecifications createSpecifications();
}

//Create Concrete Factories
class NorthAmericaCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Seden();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new NorthAmericanSpecification();
    }
}

//Create Concrete Factories
class EuropeCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new HatchBack();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new EuropeSpecifications();
    }
}

//Create Abstract Product
interface Car {
    void assemble();
}

//Create Abstract Product
interface CarSpecifications {
    void display();
}

//Create Concrete Classes for Products
class Seden implements Car {

    @Override
    public void assemble() {
        System.out.println("Seden car is assembling..");
    }
}

//Create Concrete Classes for Products
class HatchBack implements Car {

    @Override
    public void assemble() {
        System.out.println("HatchBack car is assembling..");
    }
}

//Create Concrete Classes for Products
class NorthAmericanSpecification implements CarSpecifications {

    @Override
    public void display() {
        System.out.println("North America Car Specification: " +
                "Safety features compliant with local regulations.");
    }
}

//Create Concrete Classes for Products
class EuropeSpecifications implements CarSpecifications {

    @Override
    public void display() {
        System.out.println("Europe Car Specification: Fuel efficiency " +
                "and emissions compliant with EU standards.");
    }
}


public class AbstractFactoryPattern {
    public static void main(String[] args) {

        NorthAmericaCarFactory americaCarFactory = new NorthAmericaCarFactory();
        Car northAmericanCar = americaCarFactory.createCar();
        CarSpecifications northAmericanSpecifications = americaCarFactory.createSpecifications();

        northAmericanCar.assemble();
        northAmericanSpecifications.display();
        System.out.println("**************************");

        EuropeCarFactory europeCarFactory = new EuropeCarFactory();
        Car europeCar = europeCarFactory.createCar();
        CarSpecifications europeSpecifications = europeCarFactory.createSpecifications();
    }
}
