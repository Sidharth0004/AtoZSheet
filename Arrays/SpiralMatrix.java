import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    

      public static List<Integer> spiralOrder(int[][] matrix) {
   
    int startRow = 0;
         int startCol = 0;
         int endRow = matrix.length-1;
         int endCol = matrix[0].length-1;

         ArrayList<Integer> list = new ArrayList<>();

           while (startRow<= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                list.add(matrix[startRow][j]);
            }
            //right
            for (int i = startRow+1; i <= endRow; i++) {
                list.add(matrix[i][endCol]);
            }
            //bottom
            for (int j = endCol-1; j >= startCol; j--) {
                if (startRow==endRow) {
                    break;
                }
                list.add(matrix[endRow][j]);
            }
            //left
            for (int i = endRow-1; i >= startRow+1; i--) {
                if (startCol==endCol) {
                    break;
                }
                list.add(matrix[i][startCol]);
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
         }

   return list;

    }





    public static void main(String[] args) {
        int matrix[][] ={{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};

                     System.out.println(spiralOrder(matrix));
    }
}
