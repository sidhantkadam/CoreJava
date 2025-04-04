package DesignPatterns.Behevioural;

    /*
    design pattern that allows you to add new operations to a group of related classes
    without modifying their structures. It is particularly useful when you have a stable
    set of classes but need to perform various operations on them, making it easy to extend
    functionality without altering the existing codebase
     */

import java.util.Arrays;
import java.util.List;

//Create Shape Interface to accept Shape Visitor
interface Shape {
    void accept(ShapeVisitor shapeVisitor);
}

//Create concrete classes to implement Shape interface
class CircleShape implements Shape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}

class TriangleShape implements Shape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}

class SquareShape implements Shape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}

class RectangleShape implements Shape {

    @Override
    public void accept(ShapeVisitor shapeVisitor) {
        shapeVisitor.visit(this);
    }
}

//Create Shape Visitor to declears each concrete type
interface ShapeVisitor {
    void visit(CircleShape circle);

    void visit(TriangleShape triangle);

    void visit(SquareShape square);

    void visit(RectangleShape rectangleShape);
}

//Create Concrete class to implement Visitor interface
class AreaCalculator implements ShapeVisitor {

    double totalArea = 0;
    final double radiusOfCircle = 5;
    final double sideOfSquare = 4;
    final double baseOfTriangle = 3;
    final double heightOfTriangle = 6;
    final double lengthOfRectangle = 10;
    final double widthOfRectangle = 6;

    @Override
    public void visit(CircleShape circle) {
        totalArea += Math.PI * Math.pow(radiusOfCircle, 2);
    }

    @Override
    public void visit(TriangleShape triangle) {
        totalArea += (baseOfTriangle * heightOfTriangle) / 2;
    }

    @Override
    public void visit(SquareShape square) {
        totalArea += Math.pow(sideOfSquare, 2);
    }

    @Override
    public void visit(RectangleShape rectangleShape) {
        totalArea += lengthOfRectangle * widthOfRectangle;
    }

    public double totalArea() {
        return totalArea;
    }
}


public class VisitorPattern {
    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(new CircleShape(), new SquareShape(), new TriangleShape(), new RectangleShape());

        AreaCalculator calculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(calculator);
        }
        System.out.println("Total area is : " + calculator.totalArea());
    }
}
