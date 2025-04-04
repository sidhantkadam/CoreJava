package String;

public class KthNonRepeatingCharacter {
    private static char findKthNonRepeatingCharacter(String str, int k) {
        char[] charArray = str.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; ++i) {
            boolean flag = false;
            for (int j = 0; j < charArray.length; ++j) {
                if (i != j && charArray[i] == charArray[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                count++;
                if(count == k) {
                    return charArray[i];
                }
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int k = 1;
        char c = findKthNonRepeatingCharacter(str, k);
        System.out.println(c);
    }
}
