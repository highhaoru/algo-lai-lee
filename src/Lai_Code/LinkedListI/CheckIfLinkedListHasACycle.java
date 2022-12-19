package Lai_Code.LinkedListI;

public class CheckIfLinkedListHasACycle {
  /*
  Check if a given linked list has a cycle. Return true if it does, otherwise return false.

  Assumption:
  You can assume there is no duplicate value appear in the linked list.

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

  public boolean hasCycle(ListNode head) {
    if (head == null || head.next == null) {
      return false;
    }

    ListNode fast = head;
    ListNode slow = head;

    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;

      if (fast == slow) {
        return true;
      }
    }

    return false;
  }
}
