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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int res = 0;
        List<Integer> arr = new ArrayList<Integer>();
        while(temp!=null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        int n = arr.size();
        Collections.sort(arr);
        temp = head;
        for(int i=0;i<n;i++) {
            temp.val = arr.get(i);
            temp = temp.next;
        }
        return head;
    }
}