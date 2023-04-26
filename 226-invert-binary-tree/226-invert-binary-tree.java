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
    public TreeNode invertTree(TreeNode root) {
        
        if(root == null){
            return null;
        }
        
        /*TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        
        root.right = left;
        root.left = right;*/
        /* instead of creating 2 nodes above, lets use 1 node and swap*/
        
        invertTree(root.right);
        invertTree(root.left);
        
        TreeNode curr = root.right;
        root.right = root.left;
        root.left = curr;
        return root;
        
    }
}