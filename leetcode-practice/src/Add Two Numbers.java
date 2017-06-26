/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode(0);
        ListNode p = head;
        
        while (p1!=null || p2!=null) {
            int a = 0;
            int b = 0;
            if (p1!=null) {
                a = p1.val;
            }
            if (p2!=null) {
                b = p2.val;
            }
            int sum = a+b+carry;
            if (sum>=10) {
                carry = 1;
                ListNode node = new ListNode(sum-10);
                p.next = node;
                p = node;
            }
            else {
                carry = 0;
                ListNode node = new ListNode(sum);
                p.next = node;
                p = node;
            }
            if (p1!=null) {
                p1 = p1.next;
            }
            if (p2!=null) {
                p2 = p2.next;
            }
        }
        if (carry==1) {
            p.next = new ListNode(1);
        }
        
        return head.next;        
    }
}