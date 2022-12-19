package Lai_Code.LinkedListII;

public class ReverseLinkedListIterative {
  /*
   Easy
 Reverse a singly-linked list iteratively.

 Examples
 L = null, return null
 L = 1 -> null, return 1 -> null
 L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null

  Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */
  private static class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
      this.value = value;
      next = null;
    }
  }

  public ListNode reverse(ListNode head) {
    ListNode pre = null;

    while (head != null) {
      ListNode nxt = head.next;
      head.next = pre;
      pre = head;
      head = nxt;
    }

    return pre;
  }
}
