// this code will not run unless you change the classname to file name.
class Solution {
    public int singleNumber(int[] nums) {
        int finder = 0;
        for(int i = 0; i < nums.length; i++){
            finder ^= nums[i];
        }
        return finder;
        
    }
}

/*
 * Problem Name: 136. Single Number
 * Problem Link: https://leetcode.com/problems/single-number/description/
 * 
 * INPUT: nums = [2,2,1]
 * OUTPUT: 1
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/