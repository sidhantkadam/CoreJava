package String;

public class CamelCase {
    private static String convertToCamelCase(String s) {
        StringBuilder returnString = new StringBuilder();

        boolean capitalizedNext = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                capitalizedNext = true;
            } else if (capitalizedNext) {
                returnString.append(Character.toUpperCase(s.charAt(i)));
                capitalizedNext = false;
            } else {
                returnString.append(s.charAt(i));
            }
        }
        return returnString.toString();
    }

    public static void main(String[] args) {
        String s = "i got intern at geeksforgeeks";
        System.out.println(convertToCamelCase(s));
    }
}
