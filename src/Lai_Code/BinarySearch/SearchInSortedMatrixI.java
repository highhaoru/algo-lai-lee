package Lai_Code.BinarySearch;

public class SearchInSortedMatrixI {
  /*
  Given a 2D matrix that contains integers only,
  which each row is sorted in an ascending order.
  The first element of next row is larger than (or equal to) the last element of previous row.

Given a target number, returning the position that the target locates within the matrix.
If the target number does not exist in the matrix, return {-1, -1}.

Assumptions:
The given matrix is not null, and has size of N * M, where N >= 0 and M >= 0.

Examples:
matrix = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} }
target = 7, return {1, 2}
target = 6, return {-1, -1} to represent the target number does not exist in the matrix.

Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int[] search(int[][] matrix, int target) {
      // Write your solution here
      if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return new int[] {-1, -1};
      }
      int m = matrix.length, n = matrix[0].length;
      int l = 0, r = m * n - 1;
      while(l <= r) {
        int mid = l + (r - l) /2;
        if (matrix[mid / n][mid % n] == target) {
          return new int[] {mid / n, mid % n};
        } else if (target < matrix[mid / n][mid % n]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      }

      return new int[] {-1, -1};
    }
  }
}
