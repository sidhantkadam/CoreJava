package Array;

import java.util.Arrays;

public class MissingNoArray
{
    public static void main(String[] args) {
        int[] arr = {2,4,3,5,7,1};

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=i+1)
            {
                System.out.println(i+1);
            }
        }
    }
}
