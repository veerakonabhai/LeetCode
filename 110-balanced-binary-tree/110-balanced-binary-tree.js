/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {boolean}
 */
var isBalanced = function(root) {
    return height(root) != -1;
};
const height = function(root){
        if(!root){
            return 0; //balanced
        }
        const left = height(root.left);
        const right = height(root.right);
        if(Math.abs(left - right) > 1 || left === -1 || right === -1){
            return -1; //unbalanced
        }
        return Math.max(left,right)+1;      
};