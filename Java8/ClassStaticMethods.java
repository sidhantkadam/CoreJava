package Java8;

class Static
{
    public static void print()
    {
        System.out.println("Static method is called using method reference !");
    }
}

public class ClassStaticMethods
{
    public static void main(String[] args)
    {
        Runnable R = Static::print;
        R.run();
    }
}
