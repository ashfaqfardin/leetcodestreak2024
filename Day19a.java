// this code will not run unless you change the classname to file name.
import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}

/*
 * Problem Name: 14. Longest Common Prefix
 * Problem Link: https://leetcode.com/problems/longest-common-prefix/description/
 * 
 * INPUT: strs = ["flower","flow","flight"]
 * OUTPUT: "fl"
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/