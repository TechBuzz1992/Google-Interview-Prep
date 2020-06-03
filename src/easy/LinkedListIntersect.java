package easy;

import java.util.*;

public class LinkedListIntersect {
    static class ListNode {
        ListNode next;
        int data;

        ListNode(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public ListNode getIntersectNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }

            headB = headB.next;

        }

        return null;

    }

    public static void main(String[] args) {

    }

}
