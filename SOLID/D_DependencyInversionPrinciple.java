package SOLID;

    /*
    High-level modules should not depend on low-level modules.
    Both should depend on abstractions.
    Depend on abstract class/interface, not concrete classes.
    */

import java.util.Collection;
import java.util.Collections;

// Violates : High-level class depends on low-level implementation
class LightBulb {
    public void turnOff() {
        System.out.println("Off");
    }

    public void turnOn() {
        System.out.println("On");
    }
}

class Switch {
    //Has-A or Aggregation
    private LightBulb lightBulb;

    public Switch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void toggle(boolean on) {
        if (on) {
            lightBulb.turnOn();
        }
        lightBulb.turnOff();
    }
}

//Solution: Depend on Abstractions/Interfaces
interface switchable {
    void turnOn();

    void turnOff();
}

class LightBulbClass implements switchable {

    @Override
    public void turnOn() {
        System.out.println("bulb is on");
    }

    @Override
    public void turnOff() {
        System.out.println("bulb is off");
    }
}

class SwitchClass {
    switchable buttons;

    public SwitchClass(switchable buttons) {
        this.buttons = buttons;
    }

    public void toggle(boolean on) {
        if (on) {
            buttons.turnOn();
        }
        buttons.turnOff();
    }
}


//It's Also applicable in loose coupling

public class D_DependencyInversionPrinciple {
    public static void main(String[] args) {

    }
}
