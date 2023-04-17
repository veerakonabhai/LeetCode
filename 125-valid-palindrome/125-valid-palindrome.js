/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let res = s.toLowerCase().replace(/[^a-z0-9]/gi,'');
    let rev = res.split("").reverse().join("");
    return res === rev;
};