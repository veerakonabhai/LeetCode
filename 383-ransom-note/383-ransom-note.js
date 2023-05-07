/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
var canConstruct = function(ransomNote, magazine) {
    const map = {};
    for(let char of magazine){
        if(!map[char]){
            map[char] = 0;
        }
        map[char]++;
    }
    for(let char of ransomNote){
        if(!map[char]){
            return false;
        }
        map[char]--;
    }
    return true;
};