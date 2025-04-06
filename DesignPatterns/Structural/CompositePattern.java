package DesignPatterns.Structural;

    /*
    design pattern that allows you to compose objects into tree structures to represent
    part-whole hierarchies. The main idea behind the Composite Pattern is to build a tree
    structure of objects, where individual objects and composite objects share a common interface
    */

import java.util.ArrayList;
import java.util.List;

//Create Base Component
interface Component {
    void add(Component c);

    void remove(Component c);

    void display(int depth);
}

//Create Leaf Objects
class Leaf implements Component {

    private final String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
    }
}

//Create Composite Object (contains the group of leafs and other component objects)
class Composite implements Component {

    String name;
    List<Component> children = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        System.out.println("-".repeat(depth) + name);
        for (Component c : children) {
            c.display(depth + 1);
        }
    }
}

public class CompositePattern {
    public static void main(String[] args) {
        //Client
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));
        root.add(new Leaf("Leaf B"));

        Composite comp = new Composite("Composite X");
        comp.add(new Leaf("Leaf XA"));
        comp.add(new Leaf("Leaf XB"));

        root.add(comp);
        root.add(new Leaf("Leaf C"));

        Leaf leaf = new Leaf("Leaf D");
        root.add(leaf);
        root.remove(leaf);

        root.display(2);
    }
}
