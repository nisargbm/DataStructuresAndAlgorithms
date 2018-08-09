package graph;

/**
 * Created by nisar on 09-08-2018.
 */
public class Djikstra {
    public static void djikstra(int mat[][], int start){
        boolean visited[] = new boolean[mat.length];
        int[] distance = new int[mat.length], parent = new int[mat.length];
        distance = GraphCommons.initializeToX(distance, Integer.MAX_VALUE);
        parent = GraphCommons.initializeToX(parent, -1);
        visited[start] = true;
        distance[start] = 0;
        while(!GraphCommons.allVisited(visited)){
            for(int i=0;i<mat[start].length;i++){
                if(mat[start][i] != Integer.MAX_VALUE && mat[start][i] != 0 && !visited[i]){
                    distance[i] = GraphCommons.getMin(distance[i], distance[start] + mat[start][i]);
                    if( distance[i] == distance[start] + mat[start][i]){
                        parent[i] = start;
                    }
                }
            }
            int minIndex = GraphCommons.getMinIndex(distance, visited);
            visited[minIndex] = true;
            start = minIndex;
        }
        printSolution(distance);
    }

    private static void printSolution(int[] distance) {
        for(int i=0;i<distance.length;i++)System.out.println("Vertex " + i + " at distance : " + distance[i]);
    }
}
