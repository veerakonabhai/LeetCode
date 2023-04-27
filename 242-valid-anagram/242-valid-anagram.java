class Solution {
    public boolean isAnagram(String s, String t) {
        
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
        
        
    }
}