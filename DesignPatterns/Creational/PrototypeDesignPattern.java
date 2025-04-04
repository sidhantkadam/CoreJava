package DesignPatterns.Creational;


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

public class PrototypeDesignPattern {
    public static void main(String[] args) {
        Shape circleShape = new Circle("Green");
        Prototype prototype = new Prototype(circleShape);

        Shape greenCircle = prototype.createShape();
        greenCircle.draw();
    }
}
