package easy;

import java.util.*;

public class ReverseLinkedList {
    static class ListNode {
        ListNode next;
        int data;

        ListNode(int x) {
            this.data = x;
            this.next = null;

        }
    }

    public ListNode reverseList(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        ListNode dummy = new ListNode(-1);
        head = dummy;
        while (!stack.isEmpty()) {
            ListNode current = stack.pop();
            head.next = new ListNode(current.data);
            head = head.next;

        }

        return dummy.next;

    }

}