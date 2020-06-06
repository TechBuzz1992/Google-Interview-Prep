package medium;

import java.util.*;

public class LargestValuesFromLabels {
    class Item {
        int value;
        int label;

        Item(int x, int y) {
            this.value = x;
            this.label = y;
        }
    }

    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int limit) {
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            items.add(new Item(values[i], labels[i]));
        }
        PriorityQueue<Item> maxHeap = new PriorityQueue<>((a, b) -> b.value - a.value);
        maxHeap.addAll(items);
        Map<Integer, Integer> count = new HashMap<>();
        int value = 0;
        while (!maxHeap.isEmpty() && num_wanted > 0) {
            Item current = maxHeap.remove();
            count.put(current.label, count.getOrDefault(current.label, 0) + 1);
            if (count.get(current.label) <= limit) {
                value += current.value;
                num_wanted--;
            }

        }
        return value;

    }
    public static void main(String[] args) {

    }

}