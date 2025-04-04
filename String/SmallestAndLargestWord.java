package String;


public class SmallestAndLargestWord {
    private static void smallestAndLargestWord(String s) {
        String[] s1 = s.split(" ");

        String small = s1[0];
        String large = s1[0];

        for(int i=1;i<s1.length;i++)
        {
            int size = s1[i].length();
            if(size > large.length())
            {
                large = s1[i];
            } else if (size < small.length()) {
                small = s1[i];
            }
        }
        System.out.println("Small:" + small);
        System.out.println("Large:" + large);
    }

    public static void main(String[] args) {
        String s = "This is a test string";
        smallestAndLargestWord(s);
    }
}
