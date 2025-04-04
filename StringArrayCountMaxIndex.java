public class StringArrayCountMaxIndex
{
    public static void main(String[] args) {
        String [] str = {"10.0.1.45", "10.0.1.45","10.3.54.123"};

        for(String i : str)
        {
            if(i.equals(i+1))
            {
                System.out.println(i);
            }
            else {
                System.out.println("No");
            }
        }
    }
}
