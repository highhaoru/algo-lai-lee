package Lai_Code.ArrayClassAndObjects;

public class FindMinimum {
  /*
  Given an array, return its minimum value

  Example:

  array = [7, 3, 2], return 2

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
    public int min(int[] array) {
      // Write your solution here
      if(array == null || array.length == 0) {
        return 0;
      }
      int minValue = array[0];
      for(int i = 1; i < array.length; i++) {
        if(array[i] < minValue) {
          minValue = array[i];
        }
      }
      return minValue;
    }
  }

}
