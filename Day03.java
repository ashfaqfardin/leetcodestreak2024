// this code will not run unless you change the classname to file name.
class Solution {
    public void rotate(int[] nums, int k) {
        // if k = 36, but nums.length = 7
        k = k % nums.length;

        // for this problem k=3
        // [1,2,3,4,5,6,7] --> [7,6,5,4,3,2,1]
        rotate(nums, 0, nums.length - 1);
        // [7,6,5,4,3,2,1] --> [5,6,7,4,3,2,1]
        rotate(nums, 0, k - 1);
        // [5,6,7,4,3,2,1] --> [5,6,7,1,2,3,4]
        rotate(nums, k, nums.length - 1);
    }

    public void rotate(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

/*
 * Problem Name: 189. Rotate Array
 * Problem Link: https://leetcode.com/problems/rotate-array/description/
 * 
 * INPUT: nums = [1,2,3,4,5,6,7], k = 3
 * OUTPUT: [5,6,7,1,2,3,4]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
*/