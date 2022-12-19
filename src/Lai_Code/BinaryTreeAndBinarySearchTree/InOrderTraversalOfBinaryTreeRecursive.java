package Lai_Code.BinaryTreeAndBinarySearchTree;
import java.util.ArrayList;
import java.util.List;
public class InOrderTraversalOfBinaryTreeRecursive {
/*
Implement a recursive, in-order traversal of a given binary tree,
return the list of keys of each node in the tree as it is in-order traversed.

Examples
        5
      /    \
    3        8
  /   \        \
1      4        11

In-order traversal is [1, 3, 4, 5, 8, 11]

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
  private static class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
      this.key = key;
    }
  }

  public List<Integer> inOrder(TreeNode root) {
    List<Integer> ans = new ArrayList<>();
    traversal(ans, root);
    return ans;
  }

  private void traversal(List<Integer> ans, TreeNode root) {
    if (root == null) {
      return;
    }
    traversal(ans, root.left);
    ans.add(root.key);
    traversal(ans, root.right);
  }
}
