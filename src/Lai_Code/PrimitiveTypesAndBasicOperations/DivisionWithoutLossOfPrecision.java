package Lai_Code.PrimitiveTypesAndBasicOperations;

public class DivisionWithoutLossOfPrecision {
  /*
  529. Division without loss of precision

  Given two integer a and b, calculate a divide by b but maintain the precision.

  eg{
  Clarification/Assumption:
  1. Sorted: ascending or descending, can I assume it's ascending? Yes
  2.  Duplicate: can I assume there's no duplicate elements?  No
  3.  How large are M and N, can I assume they are both within the range of integers? Yes
    a.  Is it possible m <<<<  n ?  Yes
    b.  Is it possible m ---- n ?  Yes


  Corner case:
    a = 0, b = 0: 0^0 0^-x -> invalid
    a = 0, b < 0: 0^-1 = 1/0
  General Case:
    b < 0: a^b = 1/(a^(-b)), 2^-3 = 1/(2^3)
    b > 0: a^b

  Signature(output, input):
    In more details your signature of the function should be like
    void DFS_EightQueen_2nd(int [][]input, int indexQueen, int indexRow, ....)
    // base case
    indexQueen == 8

  Time & Space complexity
  }
   */

  class Solution{
    public double divide() {
      int a = 3;
      int b = 7;

      double c = ((double)a / b); //Complete the expression

      return c;
    }
  }

  /**
   *   public static void main(String[] args) {
   *     int a = 3;
   *     int b = 7;
   *
   *     double c = ((double)a / b); //Complete the expression
   *
   *     System.out.println(c);
   *   }
   */



}
