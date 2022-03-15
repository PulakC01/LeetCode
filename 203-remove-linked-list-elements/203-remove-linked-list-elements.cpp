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
    ListNode* removeElements(ListNode* head, int val) {
        if(!head)
            return head;
        if(!head && head->val == val)
            return head->next;
        while(head->val==val) {
            head = head->next;
            if(!head)
                return head;
        }
        ListNode* current = head->next;
        ListNode* prev = head;
        while(current) {
            if(current->val==val) {
                current = current->next;
                prev->next = current;
            }
            else {
                current = current->next;
                prev = prev->next;
            }
        }
        return head;
    }
};