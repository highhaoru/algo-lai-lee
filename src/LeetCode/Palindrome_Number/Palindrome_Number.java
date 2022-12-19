package LeetCode.Palindrome_Number;

/*
9. Palindrome Number
Easy

Given an integer x, return true if x is palindrome integer.
An integer is a palindrome when it reads the same backward as forward.
For example, 121 is a palindrome while 123 is not.

Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-.
Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Constraints:
-231 <= x <= 231 - 1

Follow up:
Could you solve it without converting the integer to a string?
 */
public class Palindrome_Number {
  public boolean isPalindrome(int x) {
    if(x<0) return false;
    // 保存x上每一位的数
    List<Integer> list = new ArrayList<>();
    // 取得x上的每一位
    while(x>0){
      list.add(x%10);
      x/=10;
    }
    // 定义左右指针
    int left=0,right=list.size()-1;
    while(left<right){
      // 左右指针指向的数字不同时，返回false
      if(list.get(left) != list.get(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}

class Solution {
  public boolean isPalindrome(int x) {
    if( x < 0 ){
      return false;
    }

    int rev = 0, y = x;

    while( y > 0 ){
      int a = y % 10;
      rev = rev * 10 + a;
      y = y / 10;
    }

    if( rev == x ){
      return true;
    } else {
      return false;
    }
  }
}