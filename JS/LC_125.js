/* LeetCode 125 : Valid Palindrome
 * Given a phrase, check if it is a palindrome,
 * after converting all uppercase letters into lowercase letters 
 * and removing all non-alphanumeric characters.
 * 
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome. 
 * 
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * 
 */

/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let res = s.toLowerCase().replace(/[^a-z0-9]/gi,'');
    let rev = res.split("").reverse().join("");
    return res === rev;
};
const s1 = "A man, a plan, a canal: Panama", s2 = "race a car", s3 = " ", s4 = "ab_a";
console.log(isPalindrome(s1)); //true
console.log(isPalindrome(s2)); //false
console.log(isPalindrome(s3)); //true
console.log(isPalindrome(s4)); //true