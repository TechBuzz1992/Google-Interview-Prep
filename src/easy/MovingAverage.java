package easy;

import java.util.*;

public class MovingAverage {
    Queue<Integer> queue = new LinkedList<>();
    int sum = 0;
    int max = 0;

    MovingAverage(int x) {
        this.max = x;
    }

    public float next(int x) {
        if(queue.size() == max){
            sum-=queue.poll();

        }

        queue.add(x);
        sum+=x;

        return sum / queue.size();

    }

    public static void main(String[] args) {
        MovingAverage obj = new MovingAverage(3);
        System.out.println(obj.next(1));
        System.out.println(obj.next(2));
        System.out.println(obj.next(3));
        System.out.println(obj.next(4));
        System.out.println(obj.next(5));
        System.out.println(obj.next(6));
        System.out.println(obj.next(7));
        System.out.println(obj.next(8));
        System.out.println(obj.next(9));
        System.out.println(obj.next(10));

    }

}