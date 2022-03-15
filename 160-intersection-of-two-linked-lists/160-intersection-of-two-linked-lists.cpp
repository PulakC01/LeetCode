/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* a = headA;
        ListNode* b = headB;
        vector<ListNode*> v;
        while(a) {
            v.push_back(a);
            a = a->next;
        }
        while(b) {
            if(std::find(v.begin(), v.end(), b) != v.end()) 
                return b;
            b = b->next;
        }
        return NULL;
    }
};