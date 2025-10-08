package Java8.DefaultAndStatic;

public class InterfaceImplClass implements Interface1, Interface4 {

    @Override
    public void print() {
        Interface1.super.print();
    }
}
