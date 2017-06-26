package set1;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution143 {
    public void reorderList(ListNode head) {
        if (head==null || head.next==null) {
            return;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode secondHead = slow.next;
        slow.next=null;
        secondHead = reverse(secondHead);
        
        ListNode first = head;
        ListNode second = secondHead;
        while (second!=null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;
            
            first.next = second;
            second.next = firstNext;
            
            first = firstNext;
            second = secondNext;
        }
        
    }
    
    // reverse the list
    private ListNode reverse(ListNode head) {
        if (head==null || head.next==null) {
            return head;
        }
        
        ListNode pre = head;
        ListNode curr = head.next;
        head.next = null;
        while (curr!=null) {
            ListNode post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
        }
        return pre;
    }
}