package Java8.DefaultAndStatic;

public interface Interface1 {
    default void print() {
        System.out.println("interface 1 " + Interface1.class);
    }
}
