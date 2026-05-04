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
    public void reorderList(ListNode head) {
        ListNode cur = head;
        int count = 0;
        while(cur != null) {
            count++;
            cur = cur.next;
        }
        cur = head;
        for(int i = 0; i < (int)Math.ceil((double)count/2) - 1; i++) {
            cur = cur.next;
        }
        ListNode secondHalf = cur.next;
        cur.next = null;
        ListNode tail = reverseList(secondHalf);
        cur = head;
        while(cur != null && tail != null) {
            ListNode tempNext = cur.next;
            ListNode tailNext = tail.next;
            cur.next = tail;
            cur.next.next = tempNext;
            cur = tempNext;
            tail = tailNext;
        }

    }

    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null) {
            ListNode tempNext = cur.next;
            cur.next = prev;
            prev = cur;
            cur = tempNext;
        }
        return prev;

    }
}
