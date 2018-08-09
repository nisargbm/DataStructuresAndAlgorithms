package graph;

/**
 * Created by nisar on 09-08-2018.
 */
public class DFS {
    public static void execute(int[][] mat){
        boolean[] visited = new boolean[mat.length];
        for(int i=0;i<mat.length;i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(mat, visited, i);
            }
        }
    }

    public static void dfs(int[][] mat, boolean[] visited, int start){
        System.out.print(start + " -- ");
        for(int i=0;i<mat[start].length;i++){
            if(mat[start][i]!=0 && !visited[i]){
                visited[i] = true;
                dfs(mat, visited, i);
            }
        }
    }
}
