package ObjectCreationMethods;

interface Food {
    void makeFood();
}

class Cake implements Food {

    @Override
    public void makeFood() {
        System.out.println("Someone is making cake..Cake is ready");
    }
}

class Pizza implements Food {

    @Override
    public void makeFood() {
        System.out.println("Someone is making the pizza..Pizza is on the way");
    }
}

class FoodFactory {

    public Food chooseFoodType(String foodType) {
        if (foodType.equalsIgnoreCase("cake")) {
            return new Cake();   //Creating new Object
        } else if (foodType.equalsIgnoreCase("pizza")) {
            return new Pizza();  //Creating new Object
        } else {
            throw new IllegalArgumentException("Invalid input !");
        }
    }
}

public class UsingFactoryPattern {
    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory();
        Food food = factory.chooseFoodType("cake");
        food.makeFood();
    }
}
