package medium;

import java.util.*;

public class RepeatedDNASequence {
    public static void main(String[] args) {

    }

    public List<String> findRepeatedDNASubsequences(String str) {
        List<String> ans = new ArrayList<>();
        if (str == null || str.length() == 0) {
            return ans;
        }

        Map<String, Integer> seen = new HashMap<>();
        int i = 0;
        while (i + 10 <= str.length()) {
            String subSequence = str.substring(i, i++ + 10);
            seen.put(subSequence, seen.getOrDefault(subSequence, 0) + 1);
            if (seen.get(subSequence) == 2) {
                ans.add(subSequence);
            }

        }

        return ans;
    }

}