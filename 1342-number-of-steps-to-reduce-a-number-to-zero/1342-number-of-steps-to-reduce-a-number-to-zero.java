class Solution {
    public int numberOfSteps(int num) {
        int res = 0;
        if(num <= 2){
            return num;
        }
        res++;
        if(num%2 == 0){
            res += numberOfSteps(num/2);
        }else{
            res += numberOfSteps(num-1);
        }
        return res;
        
    }
}