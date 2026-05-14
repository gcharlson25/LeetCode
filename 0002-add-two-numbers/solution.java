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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while(cur1 != null || cur2 != null) {
            int total = 0;
            if(carry == 1) {
                total = 1;
            }
            if(cur1 == null) {
                total += cur2.val;
            }
            else if(cur2 == null) {
                total += cur1.val;
            }
            else {
                total += cur1.val + cur2.val;
            }
            if(total >= 10) {
                total = total % 10;
                carry = 1;
            }
            else {
                carry = 0;
            }
            cur.next = new ListNode(total);
            cur = cur.next;
            if(cur1 != null) {
                cur1 = cur1.next;
            }
            if(cur2 != null) {
                cur2 = cur2.next;
            }
        }
        if(carry == 1) {
            cur.next = new ListNode(1);
        }
        return dummy.next;
    }
}
