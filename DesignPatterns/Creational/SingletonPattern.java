package DesignPatterns.Creational;

    /*
    Pattern ensures a class has only one instance and provides a global access point to it.
    It’s ideal for scenarios requiring centralized control, like managing database connections
    or configuration settings.
    */

//Create Singleton class
class Singleton {
    //initiate the instance of Singleton class
    private static Singleton singleInstance;

    //Make constructor as private to block the object creation of Singleton Class
    private Singleton() {
    }

    //Create this method to return the same instance of Singleton class
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}


public class SingletonPattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("hash code value of s1 : " + s1.hashCode());
        System.out.println("hash code value of s2 : " + s2.hashCode());
        System.out.println("hash code value of s3 : " + s3.hashCode());
    }
}
