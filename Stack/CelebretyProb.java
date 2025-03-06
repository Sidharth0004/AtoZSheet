public class CelebretyProb {
//     public int celebrity(int mat[][]) {
        
//         int n = mat.length;
//         int iKnow[] = new int[n];
//         int knowme [] = new int [n];
        
//         for(int i = 0 ; i<n ; i++){
//            for(int j = 0 ; j<n ; j++){
//                if(mat[i][j] == 1){
//                   knowme[j]++;
//                   iKnow[i]++;
                  
//                }
//            }
//         }
        
//         for(int i = 0 ; i<n ; i++){
//             if(knowme[i] == n-1 && iKnow[i] ==0){
//                 return i ;
//             }
//         }
//         return -1;
        
//    }


public int celebrity(int mat[][]) {
    int top = 0;
    int down = mat.length - 1;

    while (top < down) {
        if (mat[top][down] == 1) {
            top++;
        } else {
            down--;
        }
    }

    for (int i = 0; i < mat.length; i++) {
        if (i != top && (mat[top][i] == 1 || mat[i][top] == 0)) {
            return -1;
        }
    }

    return top;
}
}
