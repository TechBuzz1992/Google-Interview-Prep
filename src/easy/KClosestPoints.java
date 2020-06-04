package easy;

import java.util.*;

public class KClosestPoints {
    static class Point {
        int x;
        int y;

        Point(int a, int b) {
            this.x = a;
            this.y = b;
        }
    }

    public List<Point> kClosestPoints(Point[] points, int k) {
        PriorityQueue<Point> maxHeap = new PriorityQueue<>((a, b) -> (b.x * b.x + b.y * b.y) - (a.x * a.x + a.y * a.y));
        for (Point point : points) {
            maxHeap.add(point);
            if (maxHeap.size() > k) {
                maxHeap.remove();
            }

        }

        List<Point> ans = new ArrayList<>();
        while (!maxHeap.isEmpty()) {
            ans.add(maxHeap.remove());
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}