package Lai_Code.PrimitiveTypesAndBasicOperations;

public class isEven {
  /*
    Basic.isEven

    Check if the number x is even, return true for even numbers.

    Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input: int
    output: t/f
   */
  public class Solution {
    public boolean isEven(int x) {
      //boolean b = //complete the expression
      //return b;
      // Write your solution here
      if(x % 2 == 0) {
        return true;
      } else {
        return false;
      }
    }
  }
}
