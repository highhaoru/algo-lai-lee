package Lai_Code.ControlFlowAndMethods;

public class CalculateAToThePowerOfB {
  /*
  Example:

a = 3, b = 4  Return 81

a = 4, b = 2  Return 16

Assumption: a > 0, b > 0

Note: don’t worry about time complexity for now.

        Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int power(int a, int b) {
      // Write your solution here
      if (b == 0)
        return 1;
      else if (b % 2 == 0)
        return power(a, b / 2) * power(a, b / 2);
      else
        return a * power(a, b / 2) * power(a, b / 2);
    }
  }
}
