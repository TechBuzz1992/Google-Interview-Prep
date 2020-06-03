package easy;

import java.util.*;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] words = { "flat", "flay", "flaeet" };

        LongestCommonPrefix obj = new LongestCommonPrefix();
        System.out.println(obj.getLCP(words));

    }

    public String getLCP(String[] words) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while (i < words[0].length()) {
            char c = words[0].charAt(i);

            for (int j = 1; j < words.length; j++) {
                if (words[j].charAt(i) != c) {
                    return ans.toString().length() > 0 ? ans.toString() : "No LCP Found";
                }
            }

            ans.append(c);
            i++;

        }
        // System.out.println("Emopty CHeck"+ans.toString().isEmpty());

        return ans.toString();
    }

}