package DesignPatterns.Creational;

interface Food {
    String getFood();
}

class Cake implements Food {

    @Override
    public String getFood() {
        return "The factory returned class Cake\n" +
                "Someone ordered a Dessert!";
    }
}

class Pizza implements Food {

    @Override
    public String getFood() {
        return "The factory returned class Pizza\n" +
                "Someone ordered Fast Food!";
    }
}

class FoodFactory {
    public static Food makeFood(String foodType) {
        if (foodType.equalsIgnoreCase("cake")) {
            return new Cake();
        } else if (foodType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        } else {
            throw new IllegalArgumentException("Please provide correct parameter for food type");
        }
    }
}

public class FactoryPattern {
    public static void main(String[] args) {

        Food cake = FoodFactory.makeFood("cake");
        System.out.println(cake.getFood());

        Food pizza = FoodFactory.makeFood("pizza");
        System.out.println(pizza.getFood());
    }
}
