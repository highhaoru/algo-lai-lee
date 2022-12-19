package Lai_Code.LinkedListI;

public class FindTheMiddleNodeOfALinkedListWithOddNumberOfNodes {
  /*
  Find the middle node of a given linked list with odd number length.

Assumption: the length > 0

Example:
L = 1 -> 2 -> 3 -> null, return 2->3

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
    public GenerateLinkedList.ListNode findMiddleNode(GenerateLinkedList.ListNode head) {
      if (head == null || head.next == null) {
        return head;
      }

      GenerateLinkedList.ListNode fast = head;
      GenerateLinkedList.ListNode slow = head;

      while (fast.next != null) {
        fast = fast.next.next;
        slow = slow.next;
      }

      return slow;
    }
  }
}
