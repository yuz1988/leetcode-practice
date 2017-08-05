package set0;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }
        // get length of list (not null at tail)
        int len = 0;
        ListNode node = head;
        ListNode tail = head;
        while (node != null) {
            len++;
            if (node.next == null) {
                tail = node;
            }
            node = node.next;
        }
        k = k % len;
        if (k == 0 || len == 1) {
            return head;
        }
        
        // find the node before the new start node
        int step = len - k - 1;
        node = head;
        while (step != 0) {
            step--;
            node = node.next;
        }
        ListNode res = node.next;
        node.next = null;
        tail.next = head;
        return res;
    }
}