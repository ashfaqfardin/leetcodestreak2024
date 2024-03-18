// this code will not run unless you change the classname to file name.
class Solution {
    public int reverse(int x) {
        int result = 0;
        while(x != 0){
            int remainder = x % 10;
            int temp = (result * 10) + remainder;
            if ((temp - remainder) / 10 != result){
                return 0;
            }
            x = x  / 10;
            result = temp;
        }

        return result;
    }
}

/*
 * Problem Name: 7. Reverse Integer
 * Problem Link: https://leetcode.com/problems/reverse-integer/description/
 * 
 * INPUT: x = 123
 * OUTPUT: 321
 * 
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 * 
*/