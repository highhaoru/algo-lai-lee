package Lai_Code.BinarySearch;

/*
161. Square Root I
Medium
Given an integer number n, find its integer square root.

Assumption:
n is guaranteed to be >= 0.

Example:
Input: 18, Return: 4
Input: 4, Return: 2
 */
public class Square_Root_I {
  public int sqrt(int x) {
    if(x <= 1) return x;
    int start = 1;
    int end = x/2;

    while(start < end) {
      // start is not always moving and hence we can get stuck in infinite loop with mid calculation
      // Adding 1 to mid everytime to ensure we always move the mid
      int mid = (start + (end-start)/2) + 1;

      // use division instead of multiplication to avoid overflow
      int div = x/mid;
      if(div == mid) return mid;
      if(div > mid) start = mid;
      else end = mid-1;
    }

    return start;
  }
}
