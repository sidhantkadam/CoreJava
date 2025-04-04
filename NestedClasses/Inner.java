package NestedClasses;

public class Inner
{
        class Processor
        {
            public void displayDetails()
            {
                System.out.println("Dell");
                System.out.println("50GHZ");
            }
        }

        void processorDisplay()
        {
            Processor pro = new Processor();
            pro.displayDetails();
        }

        public static void main(String[] args) {
            Inner computer = new Inner();
            computer.processorDisplay();
        }
}
