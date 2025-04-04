package String;

public class MergeStringArrays {
    public static void main(String[] args) {
        String s1 = "hello world";
        String s2 = "let's begin the coding";

        String[] charArray = s1.trim().split(" ");
        String[] charArray1 = s2.trim().split(" ");
        String[] merge = new String[charArray1.length + charArray.length];

        int i = 0, j = 0, k = 0;
        while (i != charArray.length) {
            merge[k] = charArray[i];
            i++;
            k++;
        }

        while (j != charArray1.length) {
            merge[k] = charArray1[j];
            j++;
            k++;
        }

        for (String s : merge) {
            System.out.print(s + " ");
        }
    }
}
