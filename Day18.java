// this code will not run unless you change the classname to file name.
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++){
            if(haystack.charAt(i) == needle.charAt(0)){
                for(int j = 0; j < needle.length(); j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)){
                        break;
                    }
                    if(j == needle.length() - 1){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}


/*
 * Problem Name: 28. Find the Index of the First Occurrence in a String
 * Problem Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * 
 * INPUT: haystack = "sadbutsad", needle = "sad"
 * OUTPUT: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * 
 * Time Complexity: O(n*m)
 * Space Complexity: O(1)
 * 
*/