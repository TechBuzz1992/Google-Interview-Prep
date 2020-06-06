package medium;

import java.util.*;

public class KthLargestElement {
    public static void main(String[] args) {
        
    }

    public int getKthLargestElement(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.add(i);
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        return minHeap.remove();
    }
    
}