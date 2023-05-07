class Solution {
    int[] count;
    public int climbStairs(int n) {
        count = new int[n+1];
        return counter(n);
    }
    public int counter(int n){
        if(count[n] != 0){
            return count[n];
        }
        else{
            count[n] = (n > 0 && n < 4) ? n : counter(n-1) + counter(n-2);
        }
        return count[n];
    }
}