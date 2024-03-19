// this code will not run unless you change the classname to file name.
class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(charCount[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}

/*
 * Problem Name: 387. First Unique Character in a String
 * Problem Link: https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * 
 * INPUT: s = "loveleetcode"
 * OUTPUT: 2
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(26) == O(1)
 * 
*/