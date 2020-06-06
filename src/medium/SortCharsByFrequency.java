package medium;

import java.util.*;

public class SortCharsByFrequency {
    public static void main(String[] args) {
        String str = "leetcodetree";
        System.out.println(new SortCharsByFrequency().maxFrequency(str));

    }

    public String maxFrequency(String str) {
        char[] arr = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b) -> map.get(b) - map.get(a));
        maxHeap.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();
        while (!maxHeap.isEmpty()) {
            Character c = maxHeap.remove();
            for (int i = 0; i < map.get(c); i++) {
                ans.append(c);
            }
        }

        return ans.toString();
    }

}