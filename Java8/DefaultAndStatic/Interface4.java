package Java8.DefaultAndStatic;

public interface Interface4 {
    default void print() {
        System.out.println("interface 4 " + Interface4.class);
    }
}
