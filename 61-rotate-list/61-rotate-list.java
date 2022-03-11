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
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null)
            return head;
        ListNode current = head;
        int count = 1;

        while (current.next != null) {
            current = current.next;
            count+=1; //Count total elements in list
        }
        //To create a cycle
        current.next = head;
        current = head;
        ListNode temp = null;

        for (int i = 0; i < (count-(k%count));i++) {
            temp = current;
            current = current.next;
        }
        head = current;
        temp.next = null;
        return head;
    }
}