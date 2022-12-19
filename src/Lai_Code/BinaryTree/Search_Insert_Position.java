package Lai_Code.BinaryTree;

/*
236. Search Insert Position

Given a sorted array and a target value,
return the index where it would be if it were inserted in order.

Assumptions
If there are multiple elements with value same as target,
we should insert the target before the first existing element.

Examples
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,3,3,5,6], 3 → 1
[1,3,5,6], 0 → 0
 */
public class Search_Insert_Position {
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
