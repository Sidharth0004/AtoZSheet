import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NQueen {
        public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ;j++ ){
          board[i][j] = '.';
            }
        }
        List<List<String>> res = new ArrayList<>();
        helper(0, board,res);
        return res;
        
    }
static void helper(int col, char[][] board, List < List < String >> res) {
 if(col == board.length){
    res.add(construct(board));
    return;
 }

 for(int row = 0 ; row< board.length; row++){
    if(isSafe(board , row , col)){
        board[row][col] = 'Q';
                helper(col + 1, board, res);
                board[row][col] = '.';  
    }
 }
}
static boolean isSafe(char [][] board , int row , int col){
     int duprow = row;
        int dupcol = col;
        while(row>= 0 && col>= 0 ){
            if(board[row][col] =='Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while(col>=0){
            if (board[row][col] == 'Q') return false;
            col--;
        }

   row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;

}

    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
