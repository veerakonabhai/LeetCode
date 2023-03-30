/* 
 * Leet code problem 1 - Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

let nums = [2, 9, 7, 11, 3, 15];
let target = 20;
var twoSum = function (nums, target) {
    const mp = {}
    // for loop to put all the differences into above object
    for (let i = 0; i < nums.length; i++) {
        const diff = target - nums[i]
        // if a difference is already present returns it's indices 
        if (diff in mp) return [mp[diff], i]
        //if not then add the difference into object
        mp[nums[i]] = i
    }
};

console.log(twoSum(nums, target));