package easy;

import java.util.*;

public class MeetingRooms {
    static class Interval {
        int start;
        int end;

        Interval(int x, int y) {
            this.start = x;
            this.end = y;
        }
    }

    public static void main(String[] args) {

    }

    public boolean canAttendMeetings(Interval[] nums) {
        int[] start = new int[nums.length];
        int[] end = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            start[i] = nums[i].start;
            end[i] = nums[i].end;
        }

        Arrays.sort(start);
        Arrays.sort(end);

        for (int i = 0; i < nums.length - 1; i++) {
            if (start[i + 1] < end[i]) {
                return false;
            }
        }

        return true;
    }

}