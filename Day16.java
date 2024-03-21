// this code will not run unless you change the classname to file name.
class Solution {
    public boolean isPalindrome(String s) {
        String newStr = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newStr += s.charAt(i);
            }
        }
        
        newStr = newStr.toLowerCase();

        for(int i = 0; i < newStr.length(); i++){
            if(newStr.charAt(i) != newStr.charAt(newStr.length() - i - 1)){
                return false;
            }
        }

        return true;
    }
}
/*
 * Problem Name: 125. Valid Palindrome
 * Problem Link: https://leetcode.com/problems/valid-palindrome/description/
 * 
 * INPUT: s = "A man, a plan, a canal: Panama"
 * OUTPUT: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
*/