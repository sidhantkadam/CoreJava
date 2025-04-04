package NestedClasses;

class House
{
    void calculateArea()
    {
        class Room
        {
            int l;
            int w;

            public Room(int l, int w) {
                this.l = l;
                this.w = w;
            }

            public int getArea()
            {
                return l*w;
            }
        }
        Room r = new Room(20, 30);
        System.out.println(r.getArea());
    }
}

public class LocalClassLocalVariables
{
    public static void main(String[] args)
    {
        House h = new House();
        h.calculateArea();
    }
}
