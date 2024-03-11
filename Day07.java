// this code will not run unless you change the classname to file name.
class Solution {
    public int[] plusOne(int[] digits) {
        int digitIndex = digits.length - 1;
        while(digits[digitIndex] == 9){
            if(digitIndex == 0){
                int[] newDigits = new int[digits.length + 1];
                newDigits[0] = 1;
                
                return newDigits; 
            }
            digits[digitIndex] = 0;
            digitIndex--;
        }
        
        digits[digitIndex]++;
        
        return digits;
    }
}

/*
 * Problem Name: 66. Plus One
 * Problem Link: https://leetcode.com/problems/plus-one/description/
 * 
 * INPUT: digits = [1,2,3]
 * OUTPUT: [1,2,4]
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
*/