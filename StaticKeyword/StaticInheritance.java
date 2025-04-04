package StaticKeyword;

class Parent {
    static int value;
    static {
        value = 10;
        System.out.println("Parent class " + value);
    }
}

class Child extends Parent {
    static {
        value = 20;
        System.out.println("Child class " + value);
    }
}

public class StaticInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Final value : " + Child.value);
    }
}
