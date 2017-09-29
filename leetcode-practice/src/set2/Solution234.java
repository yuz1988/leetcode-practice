package set2;

import set0.ListNode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        // O(1) space with reverse second half list
        if (head==null || head.next==null) {
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // reverse list start with slow
        ListNode head1 = reverse(slow);
        while (head!=null && head1!=null) {
            if (head.val != head1.val) {
                return false;
            }
            head = head.next;
            head1 = head1.next;
        }
        return true;
    }
    
    private ListNode reverse(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        ListNode curr = null;
        ListNode post = head;
        while (post != null) {
            ListNode temp = post.next;
            post.next = curr;
            curr = post;
            post = temp;
        }
        return curr;
    }
}