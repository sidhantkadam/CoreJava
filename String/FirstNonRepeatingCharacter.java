package String;

public class FirstNonRepeatingCharacter {
    private static char firstNonRepeating(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; ++i) {
            boolean flag = false;
            for (int j = 0; j < charArray.length; ++j) {
                if (i!=j && charArray[i] == charArray[j]) {
                    flag = true;
                    break;
                }
            }
            if(!flag)
            {
                return charArray[i];
            }
        }
        return '$';
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = firstNonRepeating(s);
        System.out.println(c);
    }
}
