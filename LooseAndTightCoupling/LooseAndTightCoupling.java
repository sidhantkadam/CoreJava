package LooseAndTightCoupling;

//Tight Coupling
class Parent {
    public String name;

    public void returnName(String abc) {
        System.out.println(abc);
    }
}

class Child {
    Parent parent;

    public Child(Parent parent) {
        this.parent = parent;
        parent.returnName("ABC");
    }
}


public class LooseAndTightCoupling {

    public static void main(String[] args) {
        Child ch = new Child(new Parent());

    }
}
