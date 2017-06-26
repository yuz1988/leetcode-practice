public class Solution92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        
        ListNode node = dummyHead;
        int i = 0;
        while (i+1 < m) {
            node = node.next;
            i++;
        }
        ListNode preStart = node;
        ListNode start = node.next;
        ListNode[] twoNodes = reverse(start, n-m);
        preStart.next = twoNodes[0];
        start.next = twoNodes[1];
        
        return dummyHead.next;
    }
    
    private ListNode[] reverse(ListNode head, int len) {
        int i = 0;   // number of reverse move
        ListNode pre = head;
        ListNode post = head.next;
        while (i < len) {
            ListNode postNext = post.next;
            post.next = pre;
            pre = post;
            post = postNext;
            i++;
        }
        ListNode[] res = new ListNode[2];
        res[0] = pre;
        res[1] = post;
        return res;
    }
}