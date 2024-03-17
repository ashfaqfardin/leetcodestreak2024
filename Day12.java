// this code will not run unless you change the classname to file name.
class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++){
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
/*
 * Problem Name: 344. Reverse String
 * Problem Link: https://leetcode.com/problems/reverse-string/description/
 * 
 * INPUT: s = ["h","e","l","l","o"]
 * OUTPUT: ["o","l","l","e","h"]
 * 
 * Time Complexity: O(n/2) == O(n)
 * Space Complexity: O(1)
 * 
*/