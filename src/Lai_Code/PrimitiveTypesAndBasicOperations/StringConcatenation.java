package Lai_Code.PrimitiveTypesAndBasicOperations;

public class StringConcatenation {
  /*
  Given two strings, concatenate them into one, separated by a comma.

Example:

first string: “hello”

second string: “world”

result: “hello,world”

    Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input: String x, String y
    output: String z = String x + String y
   */

  public class Solution {
    public String concatenate(String x, String y) {
      String z = x + "," + y;//complete the expression
      return z;
      // Write your solution here
    }
  }
}
