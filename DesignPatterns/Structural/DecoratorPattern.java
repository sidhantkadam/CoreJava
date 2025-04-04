package DesignPatterns.Structural;

    /*
    Design pattern to adding additional features or actions to an item without changing its structure is
    possible with the Decorator Method Design Pattern. Consider that you want to add things
    like milk, sugar, or whipped cream to your simple coffee. Instead of creating a whole new
    coffee type for every possible combination, the decorator pattern lets you "wrap" the
    plain coffee with add-ons
    */


//Create Component Interface
interface Coffee {
    String getDescription();

    double cost();
}

//Create Concrete Class for Component
class PlainCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Plain coffee ";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}

//Create Abstract Decorator (Both is-A and has-A)
abstract class CoffeeDecorator implements Coffee {
    Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}

//Create Concrete Decorator Classes for Decorator Classes
class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 5.0;
    }
}

//Create Concrete Decorator Classes for Decorator Classes
class SugarDecorator extends CoffeeDecorator {

    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + " with sugar";
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 3.0;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {

        Coffee coffee = new PlainCoffee();
        System.out.println("Description: " + coffee.getDescription());
        System.out.println("Cost: " + coffee.cost());

        Coffee milkCoffee = new MilkDecorator(coffee);
        System.out.println(milkCoffee.getDescription());
        System.out.println(milkCoffee.cost());

        Coffee sugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(sugarCoffee.getDescription());
        System.out.println(sugarCoffee.cost());
    }
}
