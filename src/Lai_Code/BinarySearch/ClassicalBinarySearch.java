package Lai_Code.BinarySearch;

public class ClassicalBinarySearch {
  /*
  Given a target integer T and an integer array A sorted in ascending order,
  find the index i such that A[i] == T or return -1 if there is no such index.

Assumptions
There can be duplicate elements in the array,
and you can return any of the indices i such that A[i] == T.

Examples
A = {1, 2, 3, 4, 5}, T = 3, return 2
A = {1, 2, 3, 4, 5}, T = 6, return -1
A = {1, 2, 2, 2, 3, 4}, T = 2, return 1 or 2 or 3

Corner Cases
What if A is null or A is of zero length? We should return -1 in this case.

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */
  public class Solution {
    public int binarySearch(int[] array, int target) {
      // Write your solution here
      if (array == null || array.length == 0) {
        //if A is null or A of zero length
        return -1;
        //返回-1
      }

      int left = 0;
      //赋值int类型变量left值为0
      int right = array.length - 1;
      //赋值int类型变量right值为array的最后一位（array.length - 1）
      while(left <= right) {
        //while（condition：当left小于等于right时）
        int mid = left + (right - left) /2;
        //initialization：赋值int类型变量mid的值为left+(right - left) /2
        if (array[mid] == target) {
          //若mid在array中的值等于目标值
          return mid;
          //返回mid
        } else if (array[mid] < target) {
          //不然若mid在array中的值小于目标值
          left = mid + 1;
          //left等于mid + 1
        } else {
          right = mid -1;
          //不然right等于mid
        }
      }
      return -1;
      //不然就返回-1

    }
  }
}
