package DesignPatterns.Behevioural;

    /*
    design pattern that defines the skeleton of an algorithm or operations in a superclass
    (often abstract) and leaves the details to be implemented by the child classes.
    It allows subclasses to customize specific parts of the algorithm without altering its
    overall structure.
    */

//abstract class for both common and individual methods
abstract class BevarageMaker {
    //Template method to execute the task
    public final void makeBevarage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    //Abstract methods those are individual for each subclass
    abstract void brew();

    abstract void addCondiments();

    //Common methods to be implemented by all subclasses in method flow
    void boilWater() {
        System.out.println("Water is boiling");
    }

    void pourInCup() {
        System.out.println("Poured in cup");
    }
}

//concrete subclass for diff logics
class TeaMaker extends BevarageMaker {

    @Override
    public void brew() {
        System.out.println("Steeping the tea !");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding lemon..");
    }
}

//concrete subclass for diff logics
class CoffeeMaker extends BevarageMaker {

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}


public class TemplatePattern {
    public static void main(String[] args) {
        BevarageMaker teaMaker = new TeaMaker();
        teaMaker.makeBevarage();
        System.out.println("tea is ready :)");
        System.out.println("*************************");
        BevarageMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeBevarage();
        System.out.println("coffee is ready :)");
    }
}
