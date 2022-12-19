package Lai_Code.BinaryTreeAndBinarySearchTree;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
public class PreOrderTraversalOfBinaryTreeIterative {
/*
Easy
Implement an iterative, pre-order traversal of a given binary tree,
return the list of keys of each node in the tree as it is pre-order traversed.

Examples
        5
      /    \
    3        8
  /   \        \
1      4        11

Pre-order traversal is [5, 3, 1, 4, 8, 11]

Corner Cases
What if the given binary tree is null? Return an empty list in this case.
How is the binary tree represented?
We use the level order traversal sequence with a special symbol "#" denoting the null node.

For Example:
The sequence [1, 2, 3, #, #, 4] represents the following binary tree:
    1
  /   \
 2     3
      /
    4

Clarification/Assumption:

Corner case:

Signature(output, input):
input:
output:
*/
public class TreeNode {
  public int key;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int key) {
    this.key = key;
  }
}
  public class Solution {
    public List<Integer> preOrder(TreeNode root) {
      List<Integer> ans = new ArrayList<>();
      if (root == null) {
        return ans;
      }

      Deque<TreeNode> stack = new ArrayDeque<>();

      stack.offerFirst(root);

      while (!stack.isEmpty()) {
        TreeNode cur = stack.pollFirst();

        ans.add(cur.key);

        if (cur.right != null) {
          stack.offerFirst(cur.right);
        }
        if (cur.left != null) {
          stack.offerFirst(cur.left);
        }
      }
      return ans;
    }
  }
// TC: O(n); SC: O(logn)
}
