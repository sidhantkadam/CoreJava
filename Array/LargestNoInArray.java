package Array;

import java.util.Arrays;

class FindMax
{
    public static int find(int[] values)
    {
        Arrays.sort(values);
        return values[values.length - 1];
    }
}


public class LargestNoInArray
{
    public static void main(String[] args)
    {
        int[] arr = {30, 50,40};
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);

        int[] array = {78,99,55};
        System.out.println(FindMax.find(array));
    }
}
