package Lai_Code.ArrayClassAndObjects;

public class ReverseAnArray{
/*
Given an array, reverse all its elements.

Example:

array = [2, 3, 5, 7, 11]

result: [11, 7, 5, 3, 2]

Assumption: The array is not null or empty.

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
    public void reverse(int[] array) {
      // Write your solution here
      int i = 0, j = array.length -1;
      while(i < j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
      }
    }
  }
}
