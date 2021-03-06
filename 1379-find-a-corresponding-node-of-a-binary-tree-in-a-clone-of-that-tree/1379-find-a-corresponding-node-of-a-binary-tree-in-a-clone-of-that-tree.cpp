/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        if(!original)
            return nullptr;
        if(original->val == target->val)
            return cloned;
        
        TreeNode* l = getTargetCopy(original->left, cloned->left, target);
        if(l != nullptr)
            return l;
        
        TreeNode* r = getTargetCopy(original->right, cloned->right, target);
        if(r != nullptr) 
            return r;
        
        return nullptr;
    }
};