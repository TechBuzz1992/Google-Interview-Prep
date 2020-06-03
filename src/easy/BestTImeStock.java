package easy;

//import java.util.*;

public class BestTImeStock {
    public static void main(String[] args) {
        int[] prices = {7,6,1,4,7,2};

        BestTImeStock obj = new BestTImeStock();

        System.out.println(obj.getMaxProfit(prices));

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