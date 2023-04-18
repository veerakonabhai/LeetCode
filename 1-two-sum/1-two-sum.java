class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int k = nums.length;
        boolean achieved = false;
        
        for(int i=0; i<k-1; i++){
            if(!achieved){
                for(int j=i+1; j<k; j++){
                    if(target == nums[i]+nums[j]){
                        result[0] = i;
                        result[1] = j;
                        achieved = true;
                    }
                }
            }else{
                break;
            }
        }
        
        return result;
    }
}