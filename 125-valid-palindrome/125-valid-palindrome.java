class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        int start = 0;
        int end = s.length() - 1;
        while(start < end){
            //to check any non alpha-numeric and skip it
            while(start < end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }while(start < end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
}