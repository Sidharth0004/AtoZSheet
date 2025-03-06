public class wordSearch {
    public static boolean helper(char[][]  board , String word , int row , int col ,int index  
    , int m ,int n ){
    
    if(index == word.length()){
     return true;
    }
   
   if(row<0 || col<0 || row ==m || col ==n || board[row][col] != word.charAt(index) ||
    board[row][col] == '!'){
  return false;
   }
    
    char c = board[row][col];
    board[row][col] = '!';
    boolean top     = helper(board , word ,row - 1 , col , index+1 , m  ,n );
    boolean right   = helper(board , word ,row  ,  col+1 , index+1 , m  ,n );
    boolean bottom  = helper(board , word ,row + 1 , col , index+1 , m  ,n );
    boolean left    = helper(board , word ,row   , col-1 , index+1 , m  ,n );
  
   board[row][col] = c;
 return top|| right|| bottom|| left;
 
    }
 
     public boolean exist(char[][] board, String word) {
        int m =  board.length;
        int n = board[0].length;
 
        for(int i =0 ; i< m ; i++){
       for(int j = 0 ; j<n ; j++){
         if(helper(board , word, i , j , 0 , m , n )){
           return true;
         }
       }
 
 
        }
 
  return false;
     }
}
