/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       /* TreeNode sltn = new TreeNode();
        
        if(p.val < root.val && q.val > root.val){
            sltn = root;
        }else if(p.val <= root.val && q.val <= root.val){
            sltn = lowestCommonAncestor(root.left, p, q);
        }else if(p.val >= root.val && q.val >= root.val){
            sltn = lowestCommonAncestor(root.right, p, q);
        }
        
        return sltn;*/
        
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
        
        
    }
}