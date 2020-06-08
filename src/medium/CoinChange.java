package medium;

//import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 12;

        System.out.println(new CoinChange().getCoinChange(coins, amount));

    }

    public int getCoinChange(int[] coins, int amount) {
        int[] ans = new int[amount + 1];

        ans[0] = 1;

        for (int coin : coins) {
            for (int i = 1; i <= amount; i++) {
                if (i >= coin) {
                    ans[i] += ans[i - coin];
                }

            }
        }

        return ans[amount];

    }

}