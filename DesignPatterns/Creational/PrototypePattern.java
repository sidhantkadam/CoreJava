package DesignPatterns.Creational;

    /*
    It enables the creation of new objects by copying an existing object.
    Prototype allows us to hide the complexity of making new instances from the client.
    The existing object acts as a prototype and contains the state of the object.
    */

interface Shape {
    Shape cloned();

    void draw();
}

class Circle implements Shape {
    private final String color;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public Shape cloned() {
        return new Circle(this.color);
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle of color " + color);
    }
}

class Prototype {
    public Shape shapePrototype;

    public Prototype(Shape shapePrototype) {
        this.shapePrototype = shapePrototype;
    }

    public Shape createShape() {
        return shapePrototype.cloned();
    }
}

public class PrototypePattern {
    public static void main(String[] args) {
        Shape circleShape = new Circle("Green");
        Prototype prototype = new Prototype(circleShape);

        Shape greenCircle = prototype.createShape();
        greenCircle.draw();
    }
}
