package easy;

import java.util.*;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str = "[{()}]";

        System.out.println(new ValidParanthesis().isValidParenthesis(str));

    }

    public boolean isValidParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.peek() == '{' || c == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' || c == ']') {
                    stack.pop();
                } else if (stack.peek() == '(' || c == ')') {
                    stack.pop();
                }
            }

        }

        return stack.isEmpty();

    }

}