package medium;

import java.util.*;

public class BoatsToSavePeople {
    public static void main(String[] args) {

    }

    public int getNumOfBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;

        int low = 0;
        int high = people.length - 1;
        while (low <= high) {
            if (people[low] + people[high] <= limit) {
                low++;
                high--;
            } else {
                high--;
            }

            boats++;

        }

        return boats;

    }

}