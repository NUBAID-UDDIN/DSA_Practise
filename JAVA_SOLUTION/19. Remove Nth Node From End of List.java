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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode A = dummy;
        ListNode B = dummy;

        for (int i = 0; i <= n; i++) {
            A = A.next;
        }

        while (A != null) {
             A = A.next;
             B= B.next;
        }


        B.next = B.next.next;

        return dummy.next;
    }
}
