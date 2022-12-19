package Lai_Code.LinkedListI;

public class CountNodesInALinkedList {
  /*
  Given a linked list, count the number of nodes in it.

Assumption: The linkedlist is not null or empty.

Example:
Given: 1->7->5->4->2->null

Answer: 5

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  /**
   * class ListNode {
   *   public int value;
   *   public ListNode next;
   *   public ListNode(int value) {
   *     this.value = value;
   *     next = null;
   *   }
   * }
   */

  public class Solution {
    public int count(GenerateLinkedList.ListNode head) {
      // Write your solution here
      int cnt = 0;
      GenerateLinkedList.ListNode cur = head;

      while (cur != null) {
        ++cnt;
        cur = cur.next;
      }

      return cnt;
    }
  }
}
