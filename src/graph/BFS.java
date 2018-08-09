package graph;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nisar on 09-08-2018.
 */
public class BFS {
    public static void bfs(int[][] mat, int start){
        Queue<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[mat.length];
        queue.add(start);
        visited[start] = true;
        int node;
        while(!queue.isEmpty()){
            node = queue.remove();
            System.out.print(node + " -- ");
            for(int i=0;i<mat[node].length;i++){
                if(mat[node][i] != 0 && mat[node][i] != 99 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
