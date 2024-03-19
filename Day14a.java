// this code will not run unless you change the classname to file name.
import java.util.Hashtable;

class Solution {
    public int firstUniqChar(String s) {
        Hashtable <Character, Integer> map = new Hashtable<>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

/*
 * Problem Name: 387. First Unique Character in a String
 * Problem Link: https://leetcode.com/problems/first-unique-character-in-a-string/description/
 * 
 * INPUT: s = "loveleetcode"
 * OUTPUT: 2
 * 
 * Time Complexity: O(2n) == O(n)
 * Space Complexity: O(n)
 * 
*/