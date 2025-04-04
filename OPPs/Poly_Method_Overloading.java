package OPPs;//   Static/Runtime Polymorphism

class Call {
    static int Addition(int a, int b) {
        return a + b;
    }

    static float Addition(float a, float b) {
        return a + b;
    }

    static String Addition(String a, String b) {
        return a + b;
    }
}

public class Poly_Method_Overloading {
    public static void main(String[] args) {
        System.out.println(Call.Addition(78, 89));
        System.out.println(Call.Addition(67.4f, 89.0f));
        System.out.println(Call.Addition("ABC", "DEF"));
    }
}
