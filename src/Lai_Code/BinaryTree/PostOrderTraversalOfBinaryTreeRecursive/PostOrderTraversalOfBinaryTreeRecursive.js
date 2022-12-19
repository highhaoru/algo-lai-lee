/**
 * 145. Binary Tree Postorder Traversal(LeetCode)
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
    traversal(ans,root.left);
    traversal(ans,root.right);
    traversal(ans.push(root.val),null);
};

var postorderTraversal = function(root) {
    var ans=[];
    traversal(ans,root);
    return ans;
};