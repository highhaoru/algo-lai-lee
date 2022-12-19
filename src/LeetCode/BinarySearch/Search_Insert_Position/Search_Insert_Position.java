package LeetCode.BinarySearch.Search_Insert_Position;

/*
35. Search Insert Position
Easy

Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not,
return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2

Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1

Example 3:
Input: nums = [1,3,5,6], target = 7
Output: 4

Constraints:
1 <= nums.length <= 104
-104 <= nums[i] <= 104
nums contains distinct values sorted in ascending order.
-104 <= target <= 104
 */
public class Search_Insert_Position {
  public int searchInsert(int[] A, int target) {
    int low = 0, high = A.length-1;
    while(low<=high){
      int mid = (low+high)/2;
      if(A[mid] == target) return mid;
      else if(A[mid] > target) high = mid-1;
      else low = mid+1;
    }
    return low;
  }
}

class Solution {
  //Lai_Code
  public int searchInsert(int[] nums, int target) {
    //corner case
    if (nums == null || nums.length ==0) {
      return 0 ;
    }
    int left =0 , right = nums.length - 1 ;
    if (nums[left] > target) {
      return 0; // the first one
    } else if(nums[right] < target){
      return right +1 ; // the next one
    }
    //now its in the middle: if found, then return
    int firstIndex = 0 ;
    while(left + 1 < right){
      int mid = left + (right - left)/2 ;
      if (nums[mid] == target) {
        right = mid ;
      } else if(nums[mid] < target){
        left = mid ;
      } else {
        right = mid ;
      }
    }
    if (nums[left] == target) {
      firstIndex = left ;
    } else if (nums[right] == target) {
      firstIndex = right ;
    } else {
      firstIndex = -1 ;
    }
    //the target will sit in the middle of the left and right
    if (firstIndex == -1 ) {
      return left+1;
    } else{
      return firstIndex ;
    }
  }
}