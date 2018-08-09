package graph;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by nisar on 09-08-2018.
 */
public class Kruskals {
    static class Edge{
        int v1,v2,weight;
        Edge(int v1,int v2,int weight){
            this.v1=v1;
            this.v2= v2;
            this.weight=weight;
        }
    }

    public static boolean kruskals(int mat[][]){
        List<Edge> edges = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[i].length;j++){
                if(mat[i][j] != 0 && mat[i][j] != Integer.MAX_VALUE)
                    edges.add(new Edge(i, j , mat[i][j]));
            }
        }
        edges.sort(new Comparator<Edge>() {
            @Override
            public int compare(Edge o1, Edge o2) {
                return (o1.weight - o2.weight);
            }
        });
        boolean visited[] = new boolean[mat.length];
        int parent[] = new int[mat.length];
        for(int i=0;i<parent.length;i++)parent[i] = i;
        for(Edge edge: edges){
            if(!allParentsSame(parent)){
                if(parent[edge.v1] == parent[edge.v2])continue;
                else{
                    visited[edge.v1] = true;
                    visited[edge.v2] = true;
                    for(int i=0;i<parent.length;i++){
                        if(parent[i] == parent[edge.v2])parent[i] = parent[edge.v1];
                    }
                    System.out.println("Edge : " + edge.v1 + " --> " + edge.v2 + " : Cost --> " + edge.weight);
                }
            }
        }
        return allParentsSame(parent);
    }

    private static boolean allParentsSame(int[] parent){
        for(int i=1;i<parent.length;i++){
            if(parent[i] != parent[0])return false;
        }
        return true;
    }
}
