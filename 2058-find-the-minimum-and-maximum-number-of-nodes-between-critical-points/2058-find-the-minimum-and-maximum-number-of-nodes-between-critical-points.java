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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = {-1,-1};
        ListNode current = head;
        ListNode prev = null;
        int count = 0;
        if(head==null || head.next==null)
            return ans;
        
        while(current.next!=null) {
            if(prev==null) {
            }
            else {
                if((current.val>prev.val && current.val>current.next.val) || (current.val<prev.val &&                                   current.val<current.next.val))
                    arr.add(count);
            }
            count++;
            prev = current;
            current = current.next;
        }
        if(arr.size()<2)
            return ans;
        Collections.sort(arr);
        int output = Integer.MAX_VALUE;
        for (int i=0; i<arr.size()-1; i++)
            if (arr.get(i+1) - arr.get(i) < output)
                output = arr.get(i+1) - arr.get(i);
        ans[0] = output;
        ans[1] = arr.get(arr.size()-1) - arr.get(0);
        return ans;
    }
}