package medium;

import java.util.*;

public class MinCostToConnectSticks {
    public static void main(String[] args) {

    }

    public int minCostToConnectSticks(int[] nums) {
        int cost = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i : nums) {
            minHeap.add(i);
        }
        while (minHeap.size() > 1) {
            int sum = minHeap.remove() + minHeap.remove();
            cost += sum;
            minHeap.add(sum);
        }

        return cost;
    }

}