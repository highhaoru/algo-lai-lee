package LeetCode.Reverse_Linked_List;
/*
// Easy
// Reverse a singly-linked list iteratively.

// Examples
// L = null, return null
// L = 1 -> null, return 1 -> null
// L = 1 -> 2 -> 3 -> null, return 3 -> 2 -> 1 -> null
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Reverse_Linked_List {
  public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) {
      return head;
    }

    ListNode pre = null;
    ListNode cur = head;
    ListNode nxt = null;

    while (cur != null) {
      nxt = cur.next;
      cur.next = pre;
      pre = cur;
      cur = nxt;
    }

    head = pre;

    return head;
  }
}
