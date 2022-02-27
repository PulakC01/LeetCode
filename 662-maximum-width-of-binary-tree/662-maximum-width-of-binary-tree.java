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
    public int widthOfBinaryTree(TreeNode root) {
        int maxWidth = 0;
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.add(root);
        
        while (!q.isEmpty()) {
            int len = q.size();
            int leftNodePosition = q.peek().val;
			TreeNode node = null;
            for (int i = 0; i < len; i++) {
                node = q.poll();
				int normalizedNodePosition = node.val - leftNodePosition;
				
                if (node.left != null) {
                    node.left.val = normalizedNodePosition * 2;
                    q.add(node.left);
                }
                
                if (node.right != null) {
                    node.right.val = normalizedNodePosition * 2 + 1;
                    q.add(node.right);
                }
            }
			int rightNodePosition = node.val;
            maxWidth = Math.max(maxWidth, rightNodePosition - leftNodePosition + 1);
        }
        
        return maxWidth;   
    }
}