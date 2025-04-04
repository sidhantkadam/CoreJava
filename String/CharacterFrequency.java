package String;


public class CharacterFrequency {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        char[] charArray = s.toCharArray();
        boolean[] printedChar = new boolean[256];

        for (int j = 0; j < charArray.length; j++) {
            if (!printedChar[charArray[j]]) {
                int count = 0;
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[j] == charArray[i]) {
                        count++;
                    }
                }
                System.out.print(charArray[j] + "" + count + " ");
                printedChar[charArray[j]] = true;
            }
        }
    }
}
