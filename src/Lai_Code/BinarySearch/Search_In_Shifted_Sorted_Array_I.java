package Lai_Code.BinarySearch;

/*
21. Search In Shifted Sorted Array I
Medium

Given a target integer T and an integer array A,
A is sorted in ascending order first, then shifted by an arbitrary number of positions.

For Example, A = {3, 4, 5, 1, 2} (shifted left by 2 positions).
Find the index i such that A[i] == T or return -1 if there is no such index.

Assumptions
There are no duplicate elements in the array.

Examples
A = {3, 4, 5, 1, 2}, T = 4, return 1
A = {1, 2, 3, 4, 5}, T = 4, return 3
A = {3, 5, 6, 1, 2}, T = 4, return -1

Corner Cases
What if A is null or A is of zero length? We should return -1 in this case.
 */
public class Search_In_Shifted_Sorted_Array_I {
  public int search(int[] nums, int target) {
    if(nums == null || nums.length == 0){
      return -1;
    }
    int l = 0;
    int r = nums.length - 1;
    while (l < r) {
      int mid = (l + r) / 2;
      if (nums[mid] == target) return mid;

      if (nums[l] <= nums[mid]) {
        if (target >= nums[l] && target < nums[mid]) {
          r = mid - 1;
        } else {
          l = mid + 1;
        }
      } else {
        if (target > nums[mid] && target <= nums[r]) {
          l = mid + 1;
        } else {
          r = mid - 1;
        }
      }
    }
    return nums[l] == target ? l : -1;
  }
}
