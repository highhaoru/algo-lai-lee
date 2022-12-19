package Lai_Code.LinkedListI;
public class InsertANodeToTheTailOfALinkedList {

  /*
     Easy
 Insert a value to the tail of a  linked list.

 Example:
 1 -> 3 -> null,
 insert : 5 → return 1 -> 3 -> 5 -> null

 null,
 insert: 5 → return 5 → null

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

  public ListNode insertNode(ListNode head, int target) {
    ListNode tar = new ListNode(target);
    ListNode cur = head;

    if (head == null) {
      return tar;
    }

    while (cur.next != null) {
      cur = cur.next;
    }

    cur.next = tar;

    return head;
  }
}
