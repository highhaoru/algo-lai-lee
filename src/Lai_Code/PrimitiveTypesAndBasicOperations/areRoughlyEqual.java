package Lai_Code.PrimitiveTypesAndBasicOperations;

public class areRoughlyEqual {
  /*
  Check if the given number x and y are roughly equal,
  the allowed error is lower than 0.0001.

  Clarification/Assumption:

    Corner case:
    if y < x --> x - y的绝对值 < 0.0001
    if x < y --> y - x的绝对值 < 0.0001

    Signature(output, input):
    input: double x, double y
    output: t/f
   */

  public class Solution {
    public boolean areRoughlyEqual(double x, double y) {
      // boolean b = //complete the expression
      // return b;
      // // Write your solution here
      if (Math.abs(x - y) < 0.0001 || Math.abs(y - x) < 0.0001) {
        return true;
      } else {
        return false;
      }
    }
  }
}
