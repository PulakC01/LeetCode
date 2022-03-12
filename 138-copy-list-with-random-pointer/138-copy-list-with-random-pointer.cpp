/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/
class Solution {
public:
    Node* copyRandomList(Node* head) {
        if(head==NULL)
            return head;
        unordered_map<Node *,Node *> mp;
        
        Node *ans = new Node(0);
        Node *current = head;
        Node *temp = ans;
        while(current!=NULL) {
            temp->next = new Node(current->val);
            temp = temp->next;
            mp[current] = temp;
            current = current->next;
        }
        current = head;
        temp = ans->next;
        
        while(current!=NULL) {
            if(current->random!=NULL)
                temp->random = mp[current->random];
            temp = temp->next;
            current = current->next;
        }
        return ans->next;
    }
};