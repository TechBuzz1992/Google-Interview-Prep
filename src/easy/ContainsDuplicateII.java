package easy;

import java.util.*;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,1};
        int k = 2;

        System.out.println(new ContainsDuplicateII().containsDuplicate(nums, k));

    }

    public boolean containsDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i != map.get(nums[i]) && Math.abs(i - map.get(nums[i])) <= k) {
                return true;
            }

        }

        return false;

    }

}