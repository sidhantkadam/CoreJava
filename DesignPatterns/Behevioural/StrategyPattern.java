package DesignPatterns.Behevioural;

    /*
    design pattern that allows you to define a family of algorithms or behaviors,
    put each of them in a separate class, and make them interchangeable at runtime.
    This pattern is useful when you want to dynamically change the behavior of a class
    without modifying its code.
    */

//Create Strategy Interface, Common impl. for concrete strategy classes
interface SortingStrategy {
    void sort(int[] arr);
}

//Create concrete Context, for assigning tasks to strategy object and store reference to it.
class SortingContext {
    SortingStrategy sortingStrategy;

    public SortingContext(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void performSort(int[] array) {
        sortingStrategy.sort(array);
    }
}

//Concrete classes for various implementation of SortingStrategy interface
class BubbleSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Bubble Sort !");
    }
}

class MergeSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Merge Sort !");
    }
}

class SelectionSort implements SortingStrategy {

    @Override
    public void sort(int[] arr) {
        System.out.println("Sorted using Selection Sort !");
    }
}

public class StrategyPattern {
    public static void main(String[] args) {

        //creating sorting object for BubbleSort strategy
        SortingContext context = new SortingContext(new BubbleSort());
        int[] arr = {1, 2, 5, 4, 3, 5, 1, 4, 2};
        context.performSort(arr);

        context.setSortingStrategy(new SelectionSort());
        int[] arr1 = {1, 2, 5, 4, 3, 5, 1, 4, 2};
        context.performSort(arr1);

        context.setSortingStrategy(new MergeSort());
        int[] arr2 = {1, 2, 5, 4, 3, 5, 1, 4, 2};
        context.performSort(arr2);
    }
}
