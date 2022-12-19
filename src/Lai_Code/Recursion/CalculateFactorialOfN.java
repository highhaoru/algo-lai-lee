package Lai_Code.Recursion;

public class CalculateFactorialOfN {
  /*
  Calculate the factorial of n using recursion.

Assumption: n >= 1.

Example:
n = 1 ⇒ return 1
n = 3 ⇒ return 6
n = 5 ⇒ return 120

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public long factorial(int n) {
      // Write your solution here
      if (n == 1) {
        return 1;
      }
      return n * factorial(n - 1);
    }
  }
}
