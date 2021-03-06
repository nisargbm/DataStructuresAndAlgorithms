package graph;

/**
 * Created by nisar on 09-08-2018.
 */
public class FloydWarshall {
    public static void floydWarshall(int mat[][]){
        int i, j, k;

        /* Initialize the solution matrix same as input graph matrix.
           Or we can say the initial values of shortest distances
           are based on shortest paths considering no intermediate
           vertex. */
        int dist[][] = new int[mat.length][mat.length];
        for (i = 0; i < mat.length; i++)
            for (j = 0; j < mat.length; j++)
                dist[i][j] = mat[i][j];

        /* Add all vertices one by one to the set of intermediate
           vertices.
          ---> Before start of a iteration, we have shortest
               distances between all pairs of vertices such that
               the shortest distances consider only the vertices in
               set {0, 1, 2, .. k-1} as intermediate vertices.
          ----> After the end of a iteration, vertex no. k is added
                to the set of intermediate vertices and the set
                becomes {0, 1, 2, .. k} */
        for (k = 0; k < dist.length; k++)
        {
            // Pick all vertices as source one by one
            for (i = 0; i < dist.length; i++)
            {
                // Pick all vertices as destination for the
                // above picked source
                for (j = 0; j < dist.length; j++)
                {
                    // If vertex k is on the shortest path from
                    // i to j, then update the value of dist[i][j]
                    if (dist[i][k] + dist[k][j] < dist[i][j])
                        dist[i][j] = dist[i][k] + dist[k][j];
                }
            }
        }

        // Print the shortest distance matrix
        printSolution(dist);
    }

    private static void printSolution(int dist[][])
    {
        System.out.println("Following matrix shows the shortest "+
                "distances between every pair of vertices");
        for (int i=0; i<dist.length; ++i)
        {
            for (int j=0; j<dist.length; ++j)
            {

                System.out.print(dist[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
