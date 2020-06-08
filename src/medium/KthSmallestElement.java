package medium;

import java.util.*;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int k = 8;

        System.out.println(new KthSmallestElement().kthSmallestElement(nums, k));

    }

    public int kthSmallestElement(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((a, b) -> b - a);
        for (int i : nums) {
            maxHeap.add(i);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }
        }

        return maxHeap.remove();
    }

}