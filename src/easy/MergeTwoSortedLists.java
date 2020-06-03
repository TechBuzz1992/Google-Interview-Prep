package easy;

public class MergeTwoSortedLists {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public ListNode mergeTwoSortedLists(ListNode n1, ListNode n2){
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;

        while(n1!=null && n2!=null){
            if(n1.data < n2.data){
                dummy.next = n1;
                n1 = n1.next;
            }
            else{
                dummy.next = n2;
                n2 = n2.next;
            }

            dummy = dummy.next;
        }

        if(n1!=null){
            dummy.next = n1;
        }
        else{
            dummy.next = n2;
        }

        return head.next;
    }

}