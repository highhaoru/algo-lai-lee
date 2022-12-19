package Lai_Code.ControlFlowAndMethods;

public class IsPrimeNumber {
  /*
  Determine whether an integer n is a prime number. Assumption: n is >= 2.

        Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  public class Solution {
    public boolean isPrime(int n) {
      // Write your solution here
      if (n < 2) {
        return false;
      }

      for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
