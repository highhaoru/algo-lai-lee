package LeetCode.BinarySearch.Sqrt_X;

/*
69. Sqrt(x)
Easy

Given a non-negative integer x,
return the square root of x rounded down to the nearest integer.

The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842...,
and since we round it down to the nearest integer, 2 is returned.

Constraints:
0 <= x <= 231 - 1
 */
public class Sqrt_X {
  public int mySqrt(int x) {
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
