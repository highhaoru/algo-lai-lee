package Lai_Code.Debug;

public class RemoveDuplicateElementFromArray {
/*
There are bugs in the given code, please fix them.

Given a 1D array and a known duplicate element (which appears more than once),
remove the duplicate element and return the result array.

Input: array = [2, 3, 3, 4, 5], duplicate = 3
Output: [2, 4, 5]

Assume
(1) the input array is not null or empty
(2) the duplicate element always exists in the input array and there is only one duplicate element.

 Clarification/Assumption:

 Corner case:

 Signature(output, input):
 input:
 output:
*/


    public int[] removeDuplicate(int[] array, int duplicate) {
      //Write your solution here
      //step1: count how many duplicate number
      //step2: result array, length = array.length - count, based on new length, new result array
      //step3: if not need to delete, copy original elements to new array / need delete, skip
      //array 2 3 3 4 5
      //
      //array[i] != duplicate, copy array[i] -> result[j] = array[i]
      //array[i] == duplicate, skip, i++

      //result: 2 4 5
      //.               j
      if (array == null || array.length == 0){
        return new int[0];
      }
      int count = 0;
      for (int i = 0; i < array.length; i++) {
        if (array[i] == duplicate) {
          count++;
        }
      }
      //int newLen = array.length - count;
      int[] result = new int[array.length - count];
      int i = 0;
      //for (int i = 0; i < array.length; i++){
      // if (array[i] != duplicate){
      //   result[j] = array[j];//copy
      //   j++;
      // }
      //}
      int j = 0;
      while (i < array.length) {
        if (array[i] == duplicate) {
          i++;
        } else {
          result[j] = array[i];
          i++;
          j++;
        }
      }
      return result;
    }
  }


