package easy;

//import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 6, 7, 8, 8, 8, 9, 9, 9, 10 };

        System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));

    }

    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
            }
        }

        // System.out.println(Arrays.toString(nums));

        return index;
    }

}