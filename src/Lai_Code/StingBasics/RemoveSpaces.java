package Lai_Code.StingBasics;

public class RemoveSpaces {
  /*
  Given a string, remove all leading/trailing/duplicated empty spaces.

Assumptions:

The given string is not null.
Examples:

“  a” --> “a”
“   I     love MTV ” --> “I love MTV”

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public String removeSpaces(String input) {
      if (input.length() == 0) {
        return input;
      }

      char[] str = input.toCharArray();
      boolean flag = false;
      int i = 0;

      for (char ch : str) {
        if (ch != ' ') {
          str[i] = ch;
          flag = true;
          ++i;
        }
        else if (ch == ' ' && flag) {
          str[i] = ch;
          flag = false;
          ++i;
        }
      }

      if (i > 0 && str[i - 1] == ' ') {
        --i;
      }

      return new String(str, 0, i);
    }
  }
}
