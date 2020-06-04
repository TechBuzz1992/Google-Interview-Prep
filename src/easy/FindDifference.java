package easy;

import java.util.*;

public class FindDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcd";

        System.out.println(new FindDifference().getDifference(s, t));

    }

    public char getDifference(String s, String t) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (char c : t.toCharArray()) {
            if (!set.contains(c)) {
                return c;
            }
        }

        return '#';

    }

}