// Using ES6 data structure Map. Time complexity is O(n).
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    var twoSum1 = function(nums, target) {
    let map = new Map();

    for(let i = 0; i < nums.length; i++) {
        if(map.has(target - nums[i])) {
            return [map.get(target - nums[i]), i];
        } else {
            map.set(nums[i], i);
        }
    }
    return [];
};

// Using Object. Time complexity is also O(n).
    /**
     * @param {number[]} nums
     * @param {number} target
     * @return {number[]}
     */
    var twoSum2 = function(nums, target) {
    let hash = {};

    for(let i = 0; i < nums.length; i++) {
        const n = nums[i];
        if(hash[target - n] !== undefined) {
            return [hash[target - n], i];
        }
        hash[n] = i;
    }
    return [];
}