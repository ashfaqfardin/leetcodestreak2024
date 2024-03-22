// this code will not run unless you change the classname to file name.
class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int sign = 1;
        int answer = 0;
        String trimedString = s.trim();
    
        if(trimedString.length() == 0){
            return 0;
        }
        if(trimedString.charAt(index) == '-'){
            sign = -1;
            index++;
        }
        else if(trimedString.charAt(index) == '+'){
            index++;
        }

        while(index < trimedString.length() && Character.isDigit(trimedString.charAt(index))){
            int digit = trimedString.charAt(index) - '0';
            if(answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10) && digit > Integer.MAX_VALUE % 10){
                if(sign == -1){
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            answer = (answer * 10) + digit;
            index++;
        }
        return answer * sign;
    }
}

/*
 * Problem Name: 8. String to Integer (atoi)
 * Problem Link: https://leetcode.com/problems/string-to-integer-atoi/description/
 * 
 * INPUT: s = "4193 with words"
 * OUTPUT: 4193
 * Explanation:
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 * ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 * 
 * Time Complexity: O(n), where n is the number of character in s
 * Space Complexity: O(n)
 * 
*/