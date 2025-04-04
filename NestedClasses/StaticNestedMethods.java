package NestedClasses;

class MathUtil
{
    static class Calculator
    {
        static int add(int a,int b)
        {
            return a+b;
        }
    }
}

public class StaticNestedMethods
{
    public static void main(String[] args) {
        System.out.println(MathUtil.Calculator.add(22,56));
    }
}
