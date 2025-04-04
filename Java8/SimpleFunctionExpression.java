package Java8;

interface Done
{
    void run();
    default void execute()
    {
        System.out.println("World !");
    }
}

public class SimpleFunctionExpression {

    public static void main(String[] args) {
        Done done  = new Done() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        done.run();
        done.execute();

        Done done1  = () -> System.out.println("Bye ");
        done1.run();
        done1.execute();
    }
}
