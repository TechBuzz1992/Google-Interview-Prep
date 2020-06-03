package easy;

import java.util.*;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aabb";

        FirstUniqueCharacter obj = new FirstUniqueCharacter();

        System.out.println(obj.getFirstUniqueCharacter(str));

    }

    public int getFirstUniqueCharacter(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), i);
            } else {
                map.put(str.charAt(i), -1);
            }
        }

        for (char c : map.keySet()) {
            if (map.get(c) != -1 && map.get(c) < min) {
                min = map.get(c);
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;

    }

}