package medium;

public class MaxWindowSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 3;

        System.out.println(new MaxWindowSum().maxWindowSum(nums, k));

    }

    public int maxWindowSum(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        //int start = 0;
        int end = 0;
        int windowSum = 0;
        while (end < nums.length) {
            windowSum += nums[end];
            //System.out.println(windowSum);
            if (end >= k - 1) {
                max = Math.max(max, windowSum);
                windowSum -= nums[end-k+1];

            }
            end++;
        }
        return max;
    }

}