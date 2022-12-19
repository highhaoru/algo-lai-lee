package Lai_Code.LinkedListI;

public class GenerateLinkedList {
  /*
  Generate a linked list of length n, where the nodes contains numbers from 0 to n-1 in order.

Assumption: n > 0.

Example:
n = 3

Answer: 0->1->2->null

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

   class ListNode {
     public int value;
     public ListNode next;
     public ListNode(int value) {
     this.value = value;
     next = null;
   }
   }

  public class Solution {
    public ListNode generate(int n) {
      // Write your solution here
      ListNode head = new ListNode(0);
      ListNode cur = head;

      for (int i = 1; i < n; ++i) {
        cur.next = new ListNode(i);
        cur = cur.next;
      }

      return head;
    }
  }
}
