// this code will not run unless you change the classname to file name.
import java.util.Hashtable;
import java.util.ArrayList;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Hashtable<Integer, Integer> nums1Map = new Hashtable<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            if(nums1Map.containsKey(nums1[i])){
                nums1Map.put(nums1[i], nums1Map.get(nums1[i]) + 1);
            }
            else {
                nums1Map.put(nums1[i], 1);
            }
        }

        for(int i = 0; i < nums2.length; i++){
            if(nums1Map.containsKey(nums2[i])){
                intersection.add(nums2[i]);
                nums1Map.put(nums2[i], nums1Map.get(nums2[i]) - 1);
                if(nums1Map.get(nums2[i]) == 0){
                    nums1Map.remove(nums2[i]);
                }
            }
        }

        int[] final_array = new int[intersection.size()];
        for(int i = 0; i < final_array.length; i++){
            final_array[i] = intersection.get(i);
        }

        return final_array;
    }
}

/*
 * Problem Name: 350. Intersection of Two Arrays II
 * Problem Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
 * 
 * INPUT: nums1 = [1,2,2,1], nums2 = [2,2]
 * OUTPUT: [2,2]
 * 
 * Time Complexity: O(3n) == O(n)
 * Space Complexity: O(3n) == O(n)
 * 
*/