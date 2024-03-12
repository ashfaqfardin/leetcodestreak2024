// this code will not run unless you change the classname to file name.
class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length < 2){
            return;
        }
        int L = 0;
        int R = 1;
        while(R < nums.length){
            if(nums[L] != 0){
                L++;
                R++;
            }
            else if(nums[R] == 0){
                R++;
            }
            else {
                int temp = nums[R];
                nums[R] = nums[L];
                nums[L] = temp;
            }
        }
    }
}

/*
 * Problem Name: 283. Move Zeroes
 * Problem Link: https://leetcode.com/problems/move-zeroes/description/
 * 
 * INPUT: nums = [0,1,0,3,12]
 * OUTPUT: [1,3,12,0,0]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/