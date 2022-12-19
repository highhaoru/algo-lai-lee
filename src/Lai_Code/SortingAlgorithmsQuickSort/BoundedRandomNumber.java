package Lai_Code.SortingAlgorithmsQuickSort;

import java.util.Random;

public class BoundedRandomNumber {
  /*
  Write a function that returns a random number within the range of [a, b] with equal probabilities.

Note: you can use Java’s Random class.

Clarification/Assumption:

    Corner case:

    Signature(output, input):
    input:
    output:
   */

  class Solution {
    public int random(int a, int b) {
      Random rand = new Random();
      return a + rand.nextInt(b - a + 1);
    }
  }
}
