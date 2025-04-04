package ExceptionHandeling;

public class StringVowels {
    public static void main(String[] args) throws Exception {
        String s = "APPLE";
        checkVowels(s);
    }

    private static void checkVowels(String s) {
        String vowels = "AEIOUaeiou";
        boolean containsVowels = false;
        try {
            for (int i = 0; i < vowels.length(); i++) {
                char ch = vowels.charAt(i);
                if (s.contains(String.valueOf(ch))) {
                    containsVowels = true;
                    break;
                }
            }
            if (!containsVowels) {
                throw new Exception("Exception !");
            } else {
                System.out.println("Contain Vowels");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
