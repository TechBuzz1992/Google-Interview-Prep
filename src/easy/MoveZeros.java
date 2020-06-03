package easy;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 3, 4, 5, 0, 12 };
        new MoveZeros().moveZeros(nums);
        System.out.println(Arrays.toString(nums));

    }

    public void moveZeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }

        }

        for(int i = index;i<nums.length;i++){
            nums[i] = 0; 
        }
    }

}