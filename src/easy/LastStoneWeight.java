package easy;

import java.util.*;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] nums = {2,4,6,4};

        LastStoneWeight obj = new LastStoneWeight();
        System.out.println(obj.lastStoneLeft(nums));

    }

    public int lastStoneLeft(int[] nums) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i : nums) {
            maxHeap.add(i);
        }
        while (maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();

            if (x != y) {
                maxHeap.add(Math.abs(y - x));
            }

        }

        return maxHeap.size() == 0 ? 0 : maxHeap.poll();
    }

}