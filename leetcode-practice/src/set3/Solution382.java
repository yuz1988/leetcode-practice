package set3;

public class Solution382 {

    ListNode head = null;
    
    /** @param head The linked list's head. Note that the head is guanranteed to be not null, so it contains at least one node. */
    public Solution382(ListNode head) {
        this.head = head;
    }
    
    /** Returns a random node's value. */
    public int getRandom() {
        int num = head.val;
        int count = 1;
        ListNode node = head;
        
        while (node.next!=null) {
            node = node.next;
            count++;
            double p = Math.random();
            if (p<(1.0/count)) {
                num = node.val;
            }
        }
        return num;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */