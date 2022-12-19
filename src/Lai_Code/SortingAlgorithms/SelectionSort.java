package Lai_Code.SortingAlgorithms;

public class SelectionSort {
  /*
  Given an array of integers, sort the elements in the array in ascending order.
  The selection sort algorithm should be used to solve this problem.

Examples
{1} is sorted to {1}
{1, 2, 3} is sorted to {1, 2, 3}
{3, 2, 1} is sorted to {1, 2, 3}
{4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}

Corner Cases
What if the given array is null? In this case, we do not need to do anything.
What if the given array is of length zero? In this case, we do not need to do anything.

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int[] solve(int[] array) {
      // Write your solution here
      if (array == null || array.length == 0) {
        return array;
      }
      for (int i = 0; i < array.length - 1; i++) {
        int min = i;
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] < array[min]) {
            min = j;
          }
        }
        swap(array, i, min);
      }
      return array;
    }
    public void swap(int[]array, int left, int right) {
      int temp = array[left];
      array[left] = array[right];
      array[right] = temp;
    }
  }
}
