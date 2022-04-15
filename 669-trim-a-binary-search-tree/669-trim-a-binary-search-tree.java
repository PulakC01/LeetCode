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
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return root;
        }
        //Find a valid root which is used to return.
        while (root!=null && (root.val < low || root.val > high)) {
            if (root.val < low) {
                root = root.right;
            }
            if (root.val > high) {
                root = root.left;
            }
        }
        TreeNode dummy = root;
        while (dummy != null) {
            while (dummy.left != null && dummy.left.val < low) {
                dummy.left = dummy.left.right; 
                // If the left child is smaller than L, then we just keep the right subtree of it. 
            }
            dummy = dummy.left;
        }
        dummy = root;
        while (dummy != null) {
            while (dummy.right != null && dummy.right.val > high) {
                dummy.right = dummy.right.left;
                // If the right child is biggrt than R, then we just keep the left subtree of it. 
            }
            dummy = dummy.right;
        }
        return root;
    }
}