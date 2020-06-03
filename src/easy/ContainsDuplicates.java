package easy;

import java.util.*;

public class ContainsDuplicates {
    public static void main(String[] args) {

    }

    public boolean containsDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                return true;
            }
        }

        return false;

    }

}