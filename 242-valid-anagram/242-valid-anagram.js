/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    //base case
    if(s.length !== t.length) return false;
    
    //using map and for loops to iterate over
    /*
    let map = {};
    for(let i = 0; i < s.length; i++){
        let letter = s[i];
        if(!map[letter]){
            map[letter] = 1;
        }else{
            map[letter]++;
        }
    }
    for(let i = 0; i < t.length; i++){
        let letter = t[i];
        if((!map[letter]) || map[letter] < 1)  return false;
        map[letter]--;
    }
    return true;
    */
    
    //using one liner sort
    return s.split('').sort().join('') === t.split('').sort().join('');
};