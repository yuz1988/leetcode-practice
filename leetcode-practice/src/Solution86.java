public class Solution86 {
	public ListNode partition(ListNode head, int x) {
        ListNode p = head;
        
        // less than x
        ListNode h1 = new ListNode(0);
        ListNode p1 = h1;
        
        // larger than x
        ListNode h2 = new ListNode(0);
        ListNode p2 = h2;
        
        while (p != null) {
            if (p.val < x) {
                p1.next = p;
                p1 = p;
            }
            else {
                p2.next = p;
                p2 = p;
            }
            p = p.next;
        }
        
        p1.next = h2.next;
        p2.next = null;
        
        return h1.next;
    }
}
