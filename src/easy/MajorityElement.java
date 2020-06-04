package easy;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 1, 1, 1, 2, 1, 2, 1 };

        System.out.println(new MajorityElement().getMajorityElement(nums));

    }

    public int getMajorityElement(int[] nums) {
        int len = (int) Math.floor(nums.length / 2);
        Map<Integer, Integer> count = new HashMap<>();

        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);

            if (count.get(i) > len) {
                return i;
            }

        }

        return -1;
    }

}