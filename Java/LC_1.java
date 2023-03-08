package Java;

import java.util.HashMap;

public class LC_1 {
    
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int k = nums.length;
        // boolean achieved = false;     
        // for(int i=0; i<k-1; i++){
        //     if(!achieved){
        //         for(int j=i+1; j<k; j++){
        //             if(target == nums[i]+nums[j]){
        //                 result[0] = i;
        //                 result[1] = j;
        //                 achieved = true;
        //             }
        //         }
        //     }else{
        //         break;
        //     }
        // }
        
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

    public static void main(String[] args) {
        int[] nums = new int[]{2,5,11,7,15,9};
        int target = 9;
        LC_1 runLc_1 = new LC_1();
        int[] result = runLc_1.twoSum(nums, target);
        System.out.println("for given target:"+ target +", from given numbers are at index " + result[0] + ", " 
        + result[1] + " with values " + nums[result[0]] + " and " + nums[result[1]] + " respectively");
    }
}