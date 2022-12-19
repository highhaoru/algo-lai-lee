/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
//https://leetcode.com/problems/binary-search/discuss/423162/Binary-Search-101
var search = function(nums, target) {
    let l = 0, r = nums.length - 1;
    while (l < r) {
        let mid = l + Math.floor((r - l + 1)/2);
        if (target < nums[mid]) {
            r = mid - 1
        } else {
            l = mid;
        }
    }
    return nums[l] === target ? l : -1;
};