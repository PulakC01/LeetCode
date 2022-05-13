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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, node = null;
        head = node = new ListNode(0);
        int carry = 0, remainder = 0, sum = 0;
        while(l1!=null || l2!=null || carry!=0) {
            int a1 = 0, a2 = 0;
            if(l1!=null) {
                a1 = l1.val; 
                l1 = l1.next;
            }
            else 
                a1=0;  
            
            if(l2!=null) {
                a2 = l2.val;
                l2 = l2.next;
            } 
            else 
                a2=0;
            sum = a1+a2+carry;
            carry = sum/10;
            remainder = sum%10;
            node = node.next = new ListNode(remainder);
        }
        return head.next;
    }
}