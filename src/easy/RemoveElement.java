package easy;

import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,3,4,5,6};
        int k = 3;

        System.out.println(new RemoveElement().removeInPlace(nums, k));

    }

    public int removeInPlace(int[] nums, int k) {
        int index = 0;
        for (int i : nums) {
            if (i != k) {
                nums[index++] = i;
            }
        }

        System.out.println(Arrays.toString(nums));

        return index;
    }

}