package Java;

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

public class LC_125 {

    public static boolean isPalindrome(String s) {
        String res = s.toLowerCase().replaceAll("[^a-z0-9]+", "");
        return res.equals(new StringBuilder(res).reverse().toString());
        
    }
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama", s2 = "race a car", s3 = " ", s4 = "ab_a";
        System.out.println(isPalindrome(s1)); //true
        System.out.println(isPalindrome(s2)); //false
        System.out.println(isPalindrome(s3)); //true
        System.out.println(isPalindrome(s4)); //true
    }
    
}
