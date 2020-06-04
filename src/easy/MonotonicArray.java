package easy;

public class MonotonicArray {
    public static void main(String[] args) {

    }

    public boolean isMonotone(int[] nums) {
        boolean decreasing = true;
        boolean increasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                increasing = false;
            }

            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }
        }

        return increasing || decreasing;

    }

}