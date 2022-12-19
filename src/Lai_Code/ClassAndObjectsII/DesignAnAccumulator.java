package Lai_Code.ClassAndObjectsII;

public class DesignAnAccumulator {
  /*
  Design an accumulator, which can take a new integer using function “add”,
  and can return the sum of all taken integers up to now using function “sum”.

  Clarification/Assumption:

    Corner case:
    void type, no return

    Signature(output, input):
    input: int
    output: int
   */
  class Accumulator {
    int i = 0;
    public void add(int x) {
      i +=x;
    }
    public int sum() {
      return i;
    }
  }
}
