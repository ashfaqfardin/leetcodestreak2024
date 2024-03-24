// this code will not run unless you change the classname to file name.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++){
            if(prefix == ""){
                return "";
            }
            String tempString = "";
            
            int searchSize = Math.min(prefix.length(), strs[i].length());
            for(int j = 0; j < searchSize; j++){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    break;
                }
                tempString += prefix.charAt(j);
            }
            prefix = tempString;
        }

        return prefix;

    }
}

/*
 * Problem Name: 14. Longest Common Prefix
 * Problem Link: https://leetcode.com/problems/longest-common-prefix/description/
 * 
 * INPUT: strs = ["flower","flow","flight"]
 * OUTPUT: "fl"
 * 
 * Time Complexity: O(n*m)
 * Space Complexity: O(m)
 * 
*/