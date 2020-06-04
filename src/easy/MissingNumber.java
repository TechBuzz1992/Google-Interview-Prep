package easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 6, 8, 7, 5, 3, 2, 1, 0 };

        System.out.println(new MissingNumber().getMissingNumber(nums));

    }

    public int getMissingNumber(int[] nums) {
        int currSum = 0;
        int max = 0;
        for (int i : nums) {
            currSum += i;
            if (i > max) {
                max = i;
            }
        }

        int sum = max * (max + 1) / 2;

        return sum - currSum;
    }

}