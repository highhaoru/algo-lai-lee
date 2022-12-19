package Lai_Code.BinarySearch;

/*
321. Divide Two Integers With Restrictions
Medium
Given two integers a and b, calculate a / b without using divide/mod operations.

Assuming any number divided by 0 is Integer.MAX_VALUE.

Examples:
0 / 1 = 0
1 / 0 = Integer.MAX_VALUE
-1 / 0 = Integer.MAX_VALUE
11 / 2 = 5
-11 / 2 = -5
11 / -2 = -5
-11 / -2 = 5
https://redquark.org/leetcode/0029-divide-two-integers/
 */
public class Divide_Two_Integers_With_Restrictions {
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
