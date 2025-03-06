import java.util.ArrayList;
import java.util.Arrays;

public class RatInMaze {
        
    
    
    public static void helper(int i , int j ,ArrayList<ArrayList<Integer>> mat,
    String move , int n , int [][] vis,ArrayList<String> res){
        if(i==n-1 && j==n-1){
             res.add(move);
      return;
        }
        //down
        if(i+1 < n && vis[i+1][j] != 1 && mat.get(i+1).get(j)==1){
            vis[i][j] =1;
            helper(i+1 , j , mat , move+'D' , n , vis,res);
            vis[i][j] =0;
        }
        // left
                if(j - 1 >= 0 && vis[i][j-1] != 1 && mat.get(i).get(j-1)==1){
            vis[i][j] =1;
            helper(i , j-1 , mat , move+'L' , n , vis,res);
            vis[i][j] =0;
        }
        //right
       if(j + 1 <n && vis[i][j+1] != 1 && mat.get(i).get(j+1)==1){
            vis[i][j] =1;
            helper(i , j+1 , mat , move+'R' , n , vis,res);
            vis[i][j] =0;
        }
        //up
        if(i-1 >=0 && vis[i-1][j] != 1 && mat.get(i-1).get(j)==1){
            vis[i][j] =1;
            helper(i-1 , j , mat , move+'U' , n , vis,res);
            vis[i][j] =0;
        }
        
    }
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        int n = mat.size();
        int vis [][] = new int [n][n];
        for(int row []: vis){
            Arrays.fill(row ,0);
        }
        ArrayList<String> res = new ArrayList<>();
        
        helper(0 , 0 , mat ,"", n, vis ,res);
        return res;
        
    }
}
