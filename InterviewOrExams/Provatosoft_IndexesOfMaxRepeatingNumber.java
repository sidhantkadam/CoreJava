package InterviewOrExams;

        //Not Solved

public class Provatosoft_IndexesOfMaxRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 2, 2, 2, 2, 2, 2, 2, 0, 0};

        int previousCount = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == previousCount)
            {
                count++;
            }
            else {
                System.out.println(previousCount + ":" + count);
                previousCount = arr[i];
                count = 1;
            }
        }
    }
}
