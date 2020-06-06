package medium;

import java.util.*;

public class NextClosestTime {
    public static void main(String[] args) {

    }

    public String nedxtClosestTime(String time) {
        int minutes = Integer.parseUnsignedInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));

        Set<Integer> set = new HashSet<>();
        for (char c : time.toCharArray()) {
            set.add(c - '0');
        }

        while (true) {
            minutes = (minutes + 1) % (24 * 60);
            int[] nextTime = { minutes / 60 / 10, minutes / 60 % 10, minutes % 60 / 10, minutes % 60 % 10 };

            boolean isValid = true;
            for (int i : nextTime) {
                if (!set.contains(i)) {
                    isValid = false;
                }
            }

            if (isValid) {
                return String.format("%02d:%02d", minutes / 60, minutes % 60);
            }
        }
    }

}