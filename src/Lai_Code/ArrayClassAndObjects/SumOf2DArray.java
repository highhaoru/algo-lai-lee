package Lai_Code.ArrayClassAndObjects;

public class SumOf2DArray {
  /*
  Given a two-dimensional array, calculate the sum of all its elements

Example:

array = {{ 2, 3}, {4, 5}, {1, 0}}

Return 15

Clarification/Assumption:
The 2D array is not null or empty. The 2D array is rectangular shape.

    Corner case:
    if array = null or array.length = 0
    return 0

    Signature(output, input):
    input: int[][] array
    output: int
   */

  public class Solution {
    public int sum(int[][] array) {
      // Write your solution here
      int sum = 0;
      for(int i = 0; i < array.length; i++) {
        for(int j = 0; j < array[0].length; j++) {
          sum += array[i][j];
        }
      }
      return sum;
    }
  }
}
