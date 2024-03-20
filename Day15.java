// this code will not run unless you change the classname to file name.
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] charCount = new int[26];
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < charCount.length; i++){
            if(charCount[i] != 0){
                return false;
            }
        }
        return true;
    }
}

/*
 * Problem Name: 242. Valid Anagram
 * Problem Link: https://leetcode.com/problems/valid-anagram/description/
 * 
 * INPUT: s = "anagram", t = "nagaram"
 * OUTPUT: true
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(26) == O(1)
 * 
*/