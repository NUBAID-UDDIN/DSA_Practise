class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode curr = head;
        int maxVal = 0;

        while (curr != null) {
            if (curr.val >= maxVal) {
                maxVal = curr.val;
                tail.next = curr;
                tail = curr;
            }
            curr = curr.next;
        }
        tail.next = null;

        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
