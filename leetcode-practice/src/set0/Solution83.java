package set0;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        
        ListNode node = head;
        while (node.next != null) {
            ListNode post = node.next;
            if (post.val == node.val) {
                node.next = post.next;
            }
            else {
                node = node.next;
            }
        }
        return head;
    }
}