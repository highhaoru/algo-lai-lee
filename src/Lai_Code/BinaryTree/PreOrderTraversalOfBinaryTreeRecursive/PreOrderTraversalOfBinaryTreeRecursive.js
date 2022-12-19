/**
 * 144. Binary Tree Preorder Traversal(LeetCode)
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var traversal = function(ans,root) {
    if (root == null) {
        return;
    }
    traversal(ans.push(root.val),null);
    traversal(ans,root.left);
    traversal(ans,root.right);
};
var preorderTraversal = function(root) {
    var ans=[];
    traversal(ans,root);
    return ans;
};