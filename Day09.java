// this code will not run unless you change the classname to file name.
import java.util.Hashtable;

class Solution{
    public int[] twoSum(int[] nums, int target){
        Hashtable<Integer, Integer> numbersFound = new Hashtable<>();
        for(int i = 0; i < nums.length; i++){
            if(numbersFound.containsKey(target - nums[i])){
                return new int[]{numbersFound.get(target - nums[i]), i};
            }
            numbersFound.put(nums[i], i);
        }

        return null;
   }
}

/*
 * Problem Name: 1. Two Sum
 * Problem Link: https://leetcode.com/problems/two-sum/description/
 * 
 * INPUT: nums = [2,7,11,15], target = 9
 * OUTPUT: [0,1]
 * EXPLANATION: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
*/