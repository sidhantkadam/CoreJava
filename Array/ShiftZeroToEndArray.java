package Array;

import java.util.Arrays;

public class ShiftZeroToEndArray
{
    public static void main(String[] args) {
        int[] arr = {1,0,5,0,3,0,8,7,0,7,0};
        int temp =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if (arr[i] == 0)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
