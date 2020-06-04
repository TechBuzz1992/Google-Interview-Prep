package easy;

public class HouseRobber {
    public static void main(String[] args) {

    }

    public int rob(int[] n) {
        if (n == null || n.length == 0) {
            return 0;
        }

        if (n.length == 1) {
            return n[0];
        }

        if (n.length == 2) {
            return Math.max(n[0], n[1]);
        }

        int[] dp = new int[n.length];
        dp[0] = n[0];
        dp[1] = Math.max(n[0], n[1]);

        for (int i = 2; i < n.length; i++) {
            dp[i] = Math.max(n[i] + dp[i - 2], n[i - 1]);
        }

        return dp[n.length - 1];
    }

}