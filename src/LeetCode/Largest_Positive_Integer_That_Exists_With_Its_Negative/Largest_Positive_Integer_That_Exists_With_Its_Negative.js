/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxK = function(nums) {
    let numsSet = new Set(nums)
    let largestInteger = -Infinity

    for (let num of numsSet) {
        if (num > 0 && numsSet.has(-num)) {
            largestInteger = Math.max(largestInteger, num)
        }
    }

    return largestInteger === -Infinity ? -1 : largestInteger
};