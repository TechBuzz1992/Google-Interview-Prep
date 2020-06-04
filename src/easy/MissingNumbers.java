package easy;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {

    }

    public List<Integer> getMissingNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;

    }

}