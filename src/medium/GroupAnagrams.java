package medium;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

    }

    public List<List<String>> groupedAnagrams(String[] str) {
        List<List<String>> ans = new ArrayList<>();
        if (str == null || str.length == 0) {
            return ans;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : str) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());

            }
            map.get(sorted).add(s);

        }

        ans.addAll(map.values());
        return ans;
    }

}