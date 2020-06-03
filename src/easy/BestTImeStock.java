package easy;

//import java.util.*;

public class BestTImeStock {
    public static void main(String[] args) {

    }

    public int getMaxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i] - min);
            }

        }

        return max;

    }

}