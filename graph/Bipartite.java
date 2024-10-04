package graph;

import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {

    
       public boolean isBipartite(int[][] graph) {

  int color [] = new int [graph.length];
    Queue<Integer> q = new LinkedList<>();
  for(int i = 0; i < color.length; i++){
    color[i] = -1;
  }

  for(int i =0 ; i<graph.length; i++){
if(color[i]==-1){
  q.add(i);
  color[i] =0;
  while(!q.isEmpty()){
      int curr = q.remove() ;
        for (int j = 0; j < graph[curr].length; j++) {
                 int e = graph[curr][j] ; // e.dest
                 if (color[e] == -1) {
                    int nextCol = color[curr] == 0 ? 1 :0;
                    color[e] = nextCol;
                    q.add(e);

                 }else if (color[e] == color[curr]) {
                    return false; // Not Bipartite

                 }

             } 

  }



}
  }







return true;

    }



}
