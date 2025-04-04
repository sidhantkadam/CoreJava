package OPPs;// Dynamic/CompileTime poly

class Upper {
    void display() {
        System.out.println("Parent, OPPs.Upper class");
    }
}

class Lower1 extends Upper {
    @Override
    void display() {
        System.out.println("Child 1, Lower class");
    }
}

class Lower2 extends Upper {
    @Override
    void display() {
        System.out.println("Child 2, Lower class");
    }
}

public class Poly_Method_Overriding {
    public static void main(String[] args) {
        Upper upper = new Lower1();
        Upper upper2 = new Lower2();
        upper.display();    //output: Child 1, Lower class
        upper2.display();   //output: Child 2, Lower class
    }
}
