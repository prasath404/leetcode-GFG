/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyhead = new ListNode(-1,head);
        ListNode leftprev = dummyhead;
        ListNode current = head;
        for(int i=0;i<left-1;i++){
            leftprev = current;
            current = current.next;
        }
        ListNode prev = null;
        for(int i=0;i<right-left+1;i++){
            ListNode nextpointer = current.next;
            current.next = prev;

            prev = current;
            current = nextpointer;
        }

        leftprev.next.next = current;
        leftprev.next = prev;
        return dummyhead.next;

    }
}