class Solution {
    public int maxAscendingSum(int[] nums) {

        if(nums.length == 0) return 0;

        int currentCount = nums[0], maxCount = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]){
                currentCount += nums[i];
            }else{
                maxCount = Math.max(maxCount, currentCount);
                currentCount = nums[i];
            }
        }
        return Math.max(maxCount, currentCount);
    }
}