/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    ArrayList<Integer> ans = new ArrayList<>();
    public void inorderTraversal(TreeNode root) {
        if(root==null)
            return;
        inorderTraversal(root.left);
        ans.add(root.val);
        inorderTraversal(root.right);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return 0;

        inorderTraversal(root);
        return ans.get(k-1);
    }
}
