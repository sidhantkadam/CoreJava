package NestedClasses;

public class StaticNestedClass
{
    static class Department
    {
        void displayInfo()
        {
            System.out.println("FSADM-3");
            System.out.println(20);
        }
    }
    public static void main(String[] args)
    {
        StaticNestedClass.Department department = new StaticNestedClass.Department();
        department.displayInfo();
    }
}
