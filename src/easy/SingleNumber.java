package easy;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,4,8,4};

        System.out.println(new SingleNumber().getSingleNumber(nums));

    }

    public int getSingleNumber(int[] nums) {
        int ans = 0;
        for (int i : nums) {
            ans = ans ^ i;
        }

        return ans;
    }

}