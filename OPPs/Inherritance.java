package OPPs;

    /*
        By which one class is allowed to inherit the features (fields and methods)
        of another class
    */

class Student {
    public static String run() {
        return "OPPs.Student is present";
    }
}

class Boy extends Student {
    public static String go() {
        return "OPPs.Boy is not present, some where else..";
    }
}

public class Inherritance {
    public static void main(String[] args) {
        System.out.println(Boy.run());
        System.out.println(Boy.go());
    }
}
