package DesignPatterns.Creational;

class Singleton {
    private static Singleton singleInstance = null;
    private String s;

    private Singleton() {
        s = "This is private constructor..!";
    }

    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }
}


public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("hash code value of s1 : " + s1.hashCode());
        System.out.println("hash code value of s2 : " + s2.hashCode());
        System.out.println("hash code value of s3 : " + s3.hashCode());
    }
}
