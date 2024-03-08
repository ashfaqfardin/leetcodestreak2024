// this code will not run unless you change the classname to file name.
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
        
    }
}

/*
 * Problem Name: 217. Contains Duplicate
 * Problem Link: https://leetcode.com/problems/contains-duplicate/description/
 * 
 * INPUT: nums = [1,2,3,1]
 * OUTPUT: true
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
*/