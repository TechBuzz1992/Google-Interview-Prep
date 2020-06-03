package easy;

import java.util.*;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "leetcode";

        RemoveVowels obj = new RemoveVowels();

        System.out.println(obj.removeVowels(str));

    }

    public String removeVowels(String str) {
        StringBuilder ans = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                ans.append(c);
            }
        }

        return ans.toString();

    }

    public boolean isVowel(char c) {
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        if (set.contains(c)) {
            return true;
        }

        else {
            return false;
        }

    }

}