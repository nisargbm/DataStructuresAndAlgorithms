package graph;

import static graph.GraphCommons.*;

/**
 * Created by nisar on 09-08-2018.
 */
public class Prims {

    public static void prims(int[][] mat){
        boolean visited[] = new boolean[mat.length];
        int parent[] = new int[mat.length];
        int distance[] = new int[mat.length];
        parent = initializeToX(parent, 0);
        distance = initializeToX(distance, Integer.MAX_VALUE);
        visited[0] = true;

        int start = 0;
        while(!allVisited(visited)){
            for(int i=0;i<mat[start].length;i++){
                if(mat[start][i] != Integer.MAX_VALUE && mat[start][i] != 0 && !visited[i]){
                    distance[i] = getMin(distance[i], mat[start][i]);
                    if(distance[i] == mat[start][i]){
                        parent[i] = start;
                    }
                }
            }
            int minIndex = getMinIndex(distance, visited);
            visited[minIndex] = true;
//            System.out.println("Parent --> " + parent[minIndex] + " - Index --> " + minIndex + " - Distance --> " + distance[minIndex]);
            start = minIndex;
        }
        printMST(mat, parent);
    }

    private static void printMST(int[][] mat, int[] parent) {
        for(int i=0;i<mat.length;i++){
            System.out.println( "Edge : " + parent[i] + " --> " + i + "-- Distance : " + mat[i][parent[i]]);
        }
    }
}
