package Lai_Code.BinarySearch;

/*
Search In Bitonic Array
Medium

Search for a target number in a bitonic array,
return the index of the target number if found in the array, or return -1.

A bitonic array is a combination of two sequence:
the first sequence is a monotonically increasing one
and the second sequence is a monotonically decreasing one.

Assumptions:
The array is not null.

Examples:
array = {1, 4, 7, 11, 6, 2, -3, -8}, target = 2, return 5.
 */
public class Search_In_Bitonic_Array {
  public int search(int[] a, int target) {
    // Write your solution here
    int maxIndex = findMaxElement(a);
    int targetIndex = binarySearch(a, 0, maxIndex, target);
    if (targetIndex != -1) {
      return targetIndex;
    }
    return binarySearch(a, maxIndex + 1, a.length - 1, target);
  }
  // Order agnostic binary search
  private static int binarySearch(int[] a, int start, int end, int target) {
    if (start > end) {
      return -1;
    }
    int mid = (start + end) / 2;

    if (target == a[mid]) {
      return mid;
    } else if ((a[start] < a[end] && target < a[mid]) || (a[start] > a[end] && target > a[mid])) {
      return binarySearch(a, start, mid - 1, target);
    } else {
      return binarySearch(a, mid + 1, end, target);
    }
  }

  // Find Max element in a Bitonic array
  private static int findMaxElement(int[] a) {
    int n = a.length;
    int start = 0;
    int end = n - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if ((mid == 0 || a[mid] > a[mid - 1]) && (mid == n - 1 || a[mid] > a[mid + 1])) {
        return mid;      // a[mid] is greater than both its neighbours. It is the maximum, return its index
      } else if (a[mid] < a[mid - 1]) {
        end = mid - 1;   // a[mid] is smaller than its previous element, maximum lies in left half
      } else {
        start = mid + 1; // maximum lies in the right half
      }
    }

    return -1;
  }
}
