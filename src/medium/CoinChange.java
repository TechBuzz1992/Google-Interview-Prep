package medium;

public class CoinChange {
    public static void main(String[] args) {

    }

    public int CoinChangeValue(int[] coins, int amount, int[] dp) {

        if (amount < -1) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        if (dp[amount - 1] != 0) {
            return dp[amount - 1];
        }

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int result = CoinChangeValue(coins, amount - coin, dp);
            if (result >= 0 && result < min) {
                min = 1 + result;
            }
        }

        dp[amount - 1] = min == Integer.MAX_VALUE ? -1 : min;

        return dp[amount - 1];

    }

}