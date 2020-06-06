package medium;

import java.util.*;

public class MeetingRoomsII {
    static class Interval {
        int start;
        int end;

        Interval(int a, int b) {
            this.start = a;
            this.end = b;
        }
    }

    public int numOfMeetingRooms(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        PriorityQueue<Interval> minHeap = new PriorityQueue<>((a, b) -> a.end - b.end);
        minHeap.add(intervals[0]);
        for (int i = 0; i < intervals.length; i++) {
            Interval current = intervals[i];
            Interval earliest = minHeap.remove();
            if (current.start >= earliest.end) {
                earliest.end = current.end;

            } else {
                minHeap.add(current);
            }
            minHeap.add(earliest);
        }

        return minHeap.size();

    }

}