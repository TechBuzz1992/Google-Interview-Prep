package easy;

import java.util.*;

public class BackspaceCompare {
    public static void main(String[] args) {
        String s = "adb#c";
        String t = "ac";

        System.out.println(new BackspaceCompare().backSpaceCompare(s, t));

    }

    public boolean backSpaceCompare(String s, String t) {
        Stack<Character> stackA = new Stack<>();
        Stack<Character> stackB = new Stack<>();

        int i = s.length() - 1;
        int j = t.length() - 1;

        for (; i >= 0; i--) {
            if (!stackA.isEmpty() && stackA.peek() == '#') {
                stackA.pop();

            } else {
                stackA.push(s.charAt(i));

            }

        }

        for (; j >= 0; j--) {
            if (!stackB.isEmpty() && stackB.peek() == '#') {
                stackB.pop();

            } else {
                stackB.push(t.charAt(j));

            }

        }

        while (!stackA.isEmpty() && !stackB.isEmpty()) {
            if (stackA.peek() != stackB.peek()) {
                return false;
            } else {
                stackA.pop();
                stackB.pop();
            }
        }

        return stackA.isEmpty() && stackB.isEmpty();

    }

}