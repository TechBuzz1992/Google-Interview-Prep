package medium;

public class SingleNumberII {
    public static void main(String[] args) {
        int[] nums =  {1,0,1,0,99};

        System.out.println(new SingleNumberII().getSingleNumber(nums));

    }

    public int getSingleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

}