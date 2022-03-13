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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(!head)
            return head;
        int count = 1;
        ListNode* current = head;
        while(current!=NULL) {
            current = current->next;
            count+=1;
        }
        count = count - n;
        if(count==1)
            return head->next;
        int temp = 1;
        current = head;
        while(current!=NULL) {
            if(temp==count-1) {
                ListNode* change = current->next->next;
                current->next = change;
                break;
            }
            current = current->next;
            temp+=1;
        }
        return head; 
    }
};