package Lai_Code.SortingAlgorithms;

public class MergeTwoSortedArrays {
  /*
  Given two sorted arrays, merge them into one sorted array.

Assumption: the two arrays are not null or empty.

Example:
array1 = {3,7}
array2 = {1,6,8,9}
answer = {1,3,6,7,8,9}

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int[] merge(int[] one, int[] two) {
      // Write your solution here
      int[] result = new int[one.length + two.length];
      int i = 0, j = 0, k = 0;
      while(i < one.length && j < two.length) {
        if (one[i] <= two[j]) {
          result[k] = one[i];
          i++;
        } else {
          result[k] = two[j];
          j++;
        }
        k++;
      }
      while(i < one.length) {
        result[k] = one[i];
        i++;
        k++;
      }
      while(j < two.length) {
        result[k] = two[j];
        j++;
        k++;
      }
      return result;
    }
  }
}
