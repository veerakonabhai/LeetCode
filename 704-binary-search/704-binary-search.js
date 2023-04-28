/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
    //using two pointers
    /*let left = 0;
    let right = nums.length - 1;
    let mid = 0;
    while(left <= right){
        mid = left + Math.floor((right - left)/2);
        if(nums[mid] === target){
            return mid;
        }else if(nums[mid] < target){
            left = mid + 1;
        }else{
            right = mid - 1;
        }
    }
     return -1;
     */
    
    //using inbuilt function
    return nums.indexOf(target);
};