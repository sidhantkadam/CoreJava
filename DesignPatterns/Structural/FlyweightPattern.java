package DesignPatterns.Structural;

    /*
    Design Pattern is a way to save memory in applications that create a large number of similar
    objects. Instead of creating a new object for each instance, the Flyweight pattern reuses
    existing ones wherever possible, sharing common parts between objects.
    */

import java.util.HashMap;
import java.util.Map;

//Create flyweight interface
interface Icon {
    void draw(int x, int y);           //Method to draw icon at given co-ordinates
}

//Create concrete classes for different flyweights
class FileIcon implements Icon {
    private final String type;                 //Intrinsic state : type of file icon
    private final String imageName;            //Intrinsic state: image specific to file icon

    public FileIcon(String type, String image) {
        this.type = type;
        this.imageName = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing " + type + " icon at position (" + x + ", " + y + ")");
    }
}

class FolderIcon implements Icon {
    private final String color;               // Intrinsic state: color of the folder icon
    private final String imageName;           // Intrinsic state: image name specific to the folder icon

    FolderIcon(String color, String image) {
        this.color = color;
        this.imageName = image;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing folder icon with color " + color + " at position (" + x + ", " + y + ")");
    }
}

//Create Flyweight Factory
class FlyweightFactory {
    // Flyweight factory to manage creation and retrieval of flyweight objects
    private Map<String, Icon> iconCache = new HashMap<>();

    public Icon getIcon(String key) {
        if (iconCache.containsKey(key)) {
            return iconCache.get(key);
        } else {
            Icon icon;
            if (key.equalsIgnoreCase("file")) {
                icon = new FileIcon("document", "simple.png");
            } else if (key.equalsIgnoreCase("folder")) {
                icon = new FolderIcon("blue", "sample.png");
            } else {
                throw new IllegalArgumentException("Please provide valid input !");
            }
            //To add new pair in Map
            iconCache.put(key, icon);
            return icon;
        }
    }
}

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Icon file = factory.getIcon("file");
        file.draw(20, 40);

        Icon file2 = factory.getIcon("file");
        file2.draw(40, 80);

        Icon folder = factory.getIcon("folder");
        folder.draw(80, 60);
    }
}
