package Lai_Code.ClassAndObjectsIIIArrayList;

import java.util.List;

public class SumOfSquares {
  /*
  Problem: Give an array list of integer,
  calculate the sum of squares of all its elements.

  Note: return 0 if the list is null or empty.

Example:

list = {1,2,3} → returns 14 (14=1*1+2*2+3*3)

  Clarification/Assumption:

    Corner case:


    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public int sumOfSquare(List<Integer> list) {
      // Write your solution here
      if(list == null) {
        return 0;
      }
      int sum = 0;
      for(int i : list) {
        sum += i * i;
      }
      return sum;
    }
  }
}
