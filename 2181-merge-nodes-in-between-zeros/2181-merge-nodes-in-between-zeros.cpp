/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* ans = new ListNode(0);
        ListNode* current = head->next;
        ListNode* dummy = ans;
        int sum = 0;
        while(current) {
            if(current->val==0) {
                ans->next = new ListNode(sum);
                ans = ans->next;
                sum = 0;
            }
            else {
                sum = sum+current->val;
            }
            current = current->next;
        }
        return dummy->next;
    }
};