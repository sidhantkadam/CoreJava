package Array;

import java.util.Arrays;

public class StableBinarySort
{
    private static void stableBinarySort(int[] arr) {
        int first = 0;
        int last  = arr.length-1;

        while (first < last)
        {
            if(arr[first] %2!=0)
            {
                if(arr[last] %2==0)
                {
                    int temp = arr[first];
                    arr[first] = arr[last];
                    arr[last] = temp;
                }
                else {
                    last--;
                }
            }
            else {
                first++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        stableBinarySort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
