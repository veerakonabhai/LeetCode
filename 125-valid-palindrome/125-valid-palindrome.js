/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    //base case
    if(s == null) return false;
    if(s.trim() === "") return true;
    //to convert into lower case
    let str = s.toLowerCase();
    let start = 0;
    let end = str.length - 1;
    while(start < end){
        while(start < end && !((str.charAt(start) >= 'a' && str.charAt(start) <= 'z') || (str.charAt(start) >= '0' && str.charAt(start) <= '9'))){
            start ++;
        }
        while(start < end && !((str.charAt(end) >= 'a' && str.charAt(end) <= 'z') || (str.charAt(end) >= '0' && str.charAt(end) <= '9'))){
            end--;
        }
        if(str.charAt(start) != str.charAt(end)){
            return false;
        }
        start++;
        end--;
        
    }
    return true;
};