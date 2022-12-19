package Lai_Code.BinarySearch;

public class FindTheKthElementInTheMatrix {
  /*
  Given a matrix, find the Kth index element.

example:
matrix:
1 3 4
5 6 7
8 9 10

k = 4 → return: 6

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int findElement(int[][] matrix, int k) {
      // Write your solution here
      int row = k / matrix[0].length;
      int col = k%matrix[0].length;
      return matrix[row][col];
    }
  }

}
