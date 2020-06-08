package medium;

import java.util.*;

public class LongestSubStringDistinctChars {
    public static void main(String[] args) {
        String str = "dusaneharsh";
        System.out.println(new LongestSubStringDistinctChars().longestSubStringDistinct(str));

    }

    public int longestSubStringDistinct(String str) {
        int max = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        Set<Character> chars = new HashSet<>();
        while (start < str.length() && end < str.length()) {
            if (chars.contains(str.charAt(end))) {
                max = Integer.max(max, end - start);
                start = end;
                chars = new HashSet<>();
                chars.add(str.charAt(end));
                end++;

            } else {
                chars.add(str.charAt(end));
                end++;
            }

        }

        return max;
    }

}