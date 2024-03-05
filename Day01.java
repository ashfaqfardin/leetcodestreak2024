class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElementIndex = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[uniqueElementIndex] != nums[i]){
                nums[uniqueElementIndex + 1] = nums[i];
                uniqueElementIndex++; 
            }
        }

        return uniqueElementIndex + 1; 
    }
}

/*NOTES:
 * Problem Name: 26. Remove Duplicates from Sorted Array
 * Problem Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 * 
 * INPUT: nums = [1,1,2]
 * OUTPUT: 2, [1,2,_]
 * 
 * 
 * checking unique elements
 * unique element checking index starts at 0, u
 * iteration index starts at 1, i
 * checking if "u" index element is not equal to "i" index element, 
 * that means it is a unique value
 * if the unique value is found we will update the next index value,
 * which is u+1 th value,
 * then we update shift the u index to the right with u++
 * finally we will return the count of unique numbers, which is u index number + 1,
 * since the array starts counting from 0
 * done
 */