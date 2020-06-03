package easy;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {7,1,2,3,4,5,6};
        int target = 16;

        System.out.println(new TwoSum().twoSum(nums, target));

    }

    public boolean twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);

        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(nums[i]) != map.get(target - nums[i])) {
                return true;
            }

        }

        return false;

    }

}