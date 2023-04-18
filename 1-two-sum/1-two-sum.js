/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for (let i = 0; i < nums.length; i++) {
    const pairNum = target - nums[i];
    const indexOfNum = nums.indexOf(pairNum);

    if (indexOfNum !== -1 && indexOfNum !== i) {
        return [i, indexOfNum];
    }
}
};