package DesignPatterns.Structural;

    /*
    design pattern is a way to use a placeholder object to control access to another object.
    Instead of interacting directly with the main object, the client talks to the proxy, which
    then manages the interaction. This is useful for things like controlling access, delaying
    object creation until it’s needed (lazy initialization), logging, or adding security checks.
    */

//Create interface
interface Image {
    void display();
}

//Create RealObject
class RealImage implements Image {

    String fileName;

    public RealImage(String message) {
        this.fileName = message;
        loadFromTheDisk();
    }

    private void loadFromTheDisk() {
        System.out.println("Loading image: " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying image : " + fileName);
    }
}

//Create ProxyObject
class ProxyImage implements Image {
    private RealImage image;
    private final String fileName;

    public ProxyImage(String message) {
        this.fileName = message;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(fileName);
        }
        image.display();
    }
}

public class ProxyPattern {
    public static void main(String[] args) {

        Image image = new ProxyImage("image.jpg");
        image.display();

        image.display();
    }
}
