package Lai_Code.ArrayClassAndObjects;

public class ComputeSum {
  /*
    Given an array, return sum of all elements.

    Example:

    array = [7, 3, 2], return 12

    Note: if the array is null or empty, return 0.

    Clarification/Assumption:
    1. Sorted: ascending or descending, can I assume it's ascending? Yes
    2.  Duplicate: can I assume there's no duplicate elements? Yes

    Corner case:
    if array = null or array.length = 0
    return 0

    Signature(output, input):
    input: int[] array
    output: array[]
   */

  public class Solution {
    public int sum(int[] array) {
      // Write your solution here
      if (array == null || array.length == 0) {
        return 0;
      }
      int sum = array[0];
      for(int i = 1; i < array.length; i++) {
        sum = sum + array[i];
      }
      return sum;
    }
  }
}
