package Lai_Code.ControlFlowAndMethods;

public class SignOfNumber {
  /*
  Return 1 if the input integer is positive,
  -1 if the input integer is negative,
  0 if the input integer is zero.

      Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int sign(int x) {
      // Write your solution here
      if (x < 0) {
        return -1;
      } else if (x == 0) {
        return 0;
      } else {
        return 1;
      }
    }
  }
}
