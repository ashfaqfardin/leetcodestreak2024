// this code will not run unless you change the classname to file name.
import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> numbersFound = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(!numbersFound.add(i + " row " + board[i][j])){
                        return false;
                    }
                    if(!numbersFound.add(j + " Column " + board[i][j])){
                        return false;
                    }
                    int boxNumber = ((i / 3) * 3) + (j / 3);
                    if(!numbersFound.add(boxNumber + " Box " + board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


/*
 * Problem Name: 36. Valid Sudoku
 * Problem Link: https://leetcode.com/problems/valid-sudoku/description/
 * 
 * INPUT: nums = board = 
 * [["5","3",".",".","7",".",".",".","."]
 * ,["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * 
 * OUTPUT: true
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(3n^2) == O(n^2) 
 * 
*/