package LeetCode.Maximum_Length_Of_A_Concatenated_String_With_Unique_Characters;

import java.util.ArrayList;
import java.util.List;

public class Maximum_Length_Of_A_Concatenated_String_With_Unique_Characters {
  /*
1239. Maximum Length of a Concatenated String with Unique Characters
Medium

You are given an array of strings arr. A string s is formed by the concatenation of a subsequence
of arr that has unique characters.

Return the maximum possible length of s.
A subsequence is an array that can be derived from another array by deleting some or no elements
without changing the order of the remaining elements.

Example 1:
Input: arr = ["un","iq","ue"]
Output: 4
Explanation: All the valid concatenations are:
- ""
- "un"
- "iq"
- "ue"
- "uniq" ("un" + "iq")
- "ique" ("iq" + "ue")
Maximum length is 4.

Example 2:
Input: arr = ["cha","r","act","ers"]
Output: 6
Explanation: Possible longest valid concatenations are "chaers" ("cha" + "ers") and
"acters" ("act" + "ers").

Example 3:
Input: arr = ["abcdefghijklmnopqrstuvwxyz"]
Output: 26
Explanation: The only string in arr has all 26 characters.


Constraints:
1 <= arr.length <= 16
1 <= arr[i].length <= 26
arr[i] contains only lowercase English letters.

https://www.youtube.com/watch?v=N7womGmLXh8
   */

/*
   Solution by: STANISLAV IABLOKOV
   https://leetcode.com/stanislav-iablokov/
*/

  class Solution
  {
    public int maxLength(List<String> arr)
    {
      int max_len = 0;

      // [1] we should first throw away all strings with any
      //     duplicate characters; strings with all unique
      //     characters are the subsets of the alphabet, thus,
      //     can be encoded using binary form
      List<Integer> unique = new ArrayList<>();
      for (String s : arr)
      {
        Integer bin = 0;
        for (char ch : s.toCharArray()) bin += 1 << (ch - 'a');
        if (Integer.bitCount(bin) == s.length()) unique.add(bin);
      }

      // [2] now start with an empty concatenation and iteratively
      //     increase its length by trying to add more strings
      ArrayList<Integer> concat = new ArrayList<>(List.of(0));
      for (Integer u : unique)
        for (int i = concat.size() - 1; i >= 0; i--)
          if ((concat.get(i) & u) == 0)
          {
            Integer cc = concat.get(i) | u;
            concat.add(cc);
            max_len = Math.max(max_len, Integer.bitCount(cc));
          }

      return max_len;
    }
  }
}
