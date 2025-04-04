package Stack;

import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String str = "((a + b) + (c + d))";

        Stack<Character> chars = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                if (chars.peek() == '(') {
                    System.out.println("true");
                    return;
                } else {
                    while (chars.peek() != '(') {
                        chars.pop();
                    }
                    chars.pop();
                }
            } else {
                chars.push(c);
            }
        }
        System.out.println("false");
    }
}
