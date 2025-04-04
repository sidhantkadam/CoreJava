package Array;

import java.util.Arrays;

public class MergeSortedArrays
{
    private static int[] mergeSortedArray(int[] arr1, int[] arr2, int[] arr3)
    {
        int i=0,j=0,k =0;
        while(i < arr1.length)
        {
            arr3[k++] = arr1[i++];
        }

        while (j < arr2.length)
        {
            arr3[k++] = arr2[j++];
        }

        Arrays.sort(arr3);
        return arr3;
    }
    public static void main(String[] args)
    {
        int[] arr1 = {1,3,5,9};
        int[] arr2 = {4,2,8,10};
        int[] arr3 = new int[arr1.length + arr2.length];
        
        System.out.println(Arrays.toString(mergeSortedArray(arr1, arr2, arr3)));
    }
}
