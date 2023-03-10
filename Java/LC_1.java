package Java;

import java.util.HashMap;

/* 
 * Leet code problem 1 - Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * 
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class LC_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int k = nums.length;
        // brute force method - for each element check the sum with another element
        // matches the target or not with a flag
        /*
         * boolean achieved = false;
         * for(int i=0; i<k-1; i++){
         * if(!achieved){
         * for(int j=i+1; j<k; j++){
         * if(target == nums[i]+nums[j]){
         * result[0] = i;
         * result[1] = j;
         * achieved = true;
         * }
         * }
         * }else{
         * break;
         * }
         * }
         */

        HashMap<Integer, Integer> hm = new HashMap<>();
        // for loop to put all the values into hashmap with their index, so that it
        // helps with search
        for (int i = 0; i < k; i++) {
            hm.put(nums[i], i);
        }
        for (int j = 0; j < k; j++) {
            int i = target - nums[j];
            // search is happening and also checking it is not the same index
            if (hm.containsKey(i) && hm.get(i) != j) {
                result[0] = j;
                result[1] = hm.get(i);
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 2, 5, 11, 7, 15, 9 };
        int target = 9;
        LC_1 runLc_1 = new LC_1();
        int[] result = runLc_1.twoSum(nums, target);
        System.out.println("for given target:" + target + ", from given numbers are at index "
                + result[0] + ", " + result[1] + " with values " + nums[result[0]] + " and "
                + nums[result[1]] + " respectively");
    }
}