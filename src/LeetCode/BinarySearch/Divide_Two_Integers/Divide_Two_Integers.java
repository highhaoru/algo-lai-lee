package LeetCode.BinarySearch.Divide_Two_Integers;

/*
29. Divide Two Integers
Medium

Given two integers dividend and divisor, divide two integers without using multiplication,
division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part.
For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers
within the 32-bit signed integer range: [−231, 231 − 1]. For this problem,
if the quotient is strictly greater than 231 - 1, then return 231 - 1,
and if the quotient is strictly less than -231, then return -231.

Example 1:
Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.

Example 2:
Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.

Constraints:
-231 <= dividend, divisor <= 231 - 1
divisor != 0
 */
public class Divide_Two_Integers {
  public int divide(int dividend, int divisor) {
    // Check for overflow
    if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
      return Integer.MAX_VALUE;
    }
    // Sign of result
    int sign = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0) ? -1 : 1;
    // Quotient
    int quotient = 0;
    // Take the absolute value
    long absoluteDividend = Math.abs((long) dividend);
    long absoluteDivisor = Math.abs((long) divisor);
    // Loop until the  dividend is greater than divisor
    while (absoluteDividend >= absoluteDivisor) {
      // This represents the number of bits shifted or
      // how many times we can double the number
      int shift = 0;
      while (absoluteDividend >= (absoluteDivisor << shift)) {
        shift++;
      }
      // Add the number of times we shifted to the quotient
      quotient += (1 << (shift - 1));
      // Update the dividend for the next iteration
      absoluteDividend -= absoluteDivisor << (shift - 1);
    }
    return sign == -1 ? -quotient : quotient;
  }
}
