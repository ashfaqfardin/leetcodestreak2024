// this code will not run unless you change the classname to file name.
class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - j - 1];
                matrix[i][matrix[0].length - j - 1] = temp;
            }
        }
    }
}

/*
 * Problem Name: 48. Rotate Image
 * Problem Link: https://leetcode.com/problems/rotate-image/description/
 * 
 * INPUT: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
 * OUTPUT: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * 
*/