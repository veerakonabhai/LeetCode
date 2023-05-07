class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] charSet = new int[26]; 
        for(char c : magazine.toCharArray()){
            charSet[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(--charSet[c-'a'] < 0) return false;
        }
        return true;
    }
}