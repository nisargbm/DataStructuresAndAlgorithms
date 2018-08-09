package graph;

import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 09-08-2018.
 */
public class PrimsTest {
    /* Let us create the following graph
          2    3
       (0)--(1)--(2)
       |    / \   |
      6|  8/   \5 |7
       | /      \ |
       (3)-------(4)
            9          */

    int graph[][] = new int[][] {{0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0},
    };

    @Test
    public void prims(){
        Prims.prims(graph);
    }
}
