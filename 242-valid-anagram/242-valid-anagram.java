class Solution {
    public boolean isAnagram(String s, String t) {
        
        //base case
        if(s.length() != t.length()){
            return false;
        }
        
        
        //using 2 while loops to iterate over and check
        /*
        Map<Character, Integer> solMap = new HashMap<>();
        int sl = 0;
        while(sl < s.length()){
            if(solMap.containsKey(s.charAt(sl))){
                int val = solMap.get(s.charAt(sl));
                val++;
                solMap.replace(s.charAt(sl), val);
            }else{
                solMap.put(s.charAt(sl), 1);
            }
            sl++;
        }
        
        int tl = 0;
        while(tl < t.length()){
            if(solMap.containsKey(t.charAt(tl))){
                int val = solMap.get(t.charAt(tl));
                if(val == 1){
                    solMap.remove(t.charAt(tl));
                }else{
                val--;
                solMap.replace(t.charAt(tl), val);
                }
            }else{
                return false;
            }
            tl++;
        }
        return solMap.isEmpty();
        */
        
        //using for loop
        /*
        Map<Character, Integer> solMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(solMap.containsKey(s.charAt(i))){
                int val = solMap.get(s.charAt(i));
                val++;
                solMap.replace(s.charAt(i), val);
            }else{
                solMap.put(s.charAt(i), 1);
            }
        }
        for(int i = 0; i < t.length(); i++){
            if(solMap.containsKey(t.charAt(i))){
                int val = solMap.get(t.charAt(i));
                if(val == 1){
                    solMap.remove(t.charAt(i));
                }else{
                val--;
                solMap.replace(t.charAt(i), val);
                }
            }else{
                return false;
            }
        }
        return solMap.isEmpty();
        */
        
        //create a array with 26 character for alphabets and use for loop to get over the strings
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int i : count){
            if(i != 0) return false;
        }
        return true;
    }
}