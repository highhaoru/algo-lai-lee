package Lai_Code.ControlFlowAndMethods;

public class CalculateFactorialOfN {
  /*
  求n的阶乘. Assumption, n > 1.

Example:

n = 3, return 6

n = 4, return 24

n = 5, return 120

        Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int factorial(int n) {
      // Write your solution here
      int fact = 1;
      for (int i = 1; i <= n; i++) {
        fact = fact * i;
      }

      return fact;
    }

  }
}
