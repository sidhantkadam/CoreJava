package Array;

public class SumEqualToArrayIndex
{
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,10,7};
        int num = 9;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]+arr[j]==num)
                {
                    System.out.print(arr[i] +" "+ arr[j]);
                }
            }
            System.out.println();
        }
    }
}
