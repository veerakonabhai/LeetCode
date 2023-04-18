class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int k = nums.length;
        /*boolean achieved = false;
        
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
        }*/
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<k; i++){
            hm.put(nums[i],i);
        }
        for(int j = 0; j<k;j++){
            int i = target - nums[j];
            if(hm.containsKey(i) && hm.get(i) != j){
                result[0] = j;
                result[1] = hm.get(i);
                break;
            }
        }
        
        return result;
        
    }
}