package Lai_Code.ArrayClassAndObjects;

public class SwapTwoElements {
  /*
  Given an array, and two indices i and j.
  Swap the element at position i and element at position j.

Example:

array = [7, 3, 2], i = 0, j = 2.

Swap such that the array becomes [2, 3, 7]

Assumption: The array is not null or empty.
i and j are both valid indices within the range of the array.

    Clarification/Assumption:
    1. Sorted: ascending or descending, can I assume it's ascending? Yes
    2.  Duplicate: can I assume there's no duplicate elements? Yes

    Corner case:
    void type, no return

    Signature(output, input):
    input: int[] array
    no output
   */

  public class Solution {
    public void swap(int[] array, int i, int j) {
      // Write your solution here
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
  }
}
