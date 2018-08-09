package graph;

import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 09-08-2018.
 */
public class KruskalsTest {
    /* Let us create following weighted graph
                 10
            0--------1
            |  \     |
           6|   5\   |15
            |      \ |
            2--------3
                4       */
    int graph[][] = new int[][]{{0, 10, 6, 5},
                                {10, 0, 0, 15},
                                {6, 0, 0, 4},
                                {5, 15, 4, 0}};

    int graph2[][] = new int[][]{{0, 1, 2, 0, 0, 0},
                                 {1, 0, 5, 0, 0, 0},
                                 {2, 5, 0, 50, 0, 0},
                                 {0, 0, 50, 0, 10, 0},
                                 {0, 0, 0, 10, 0, 3},
                                 {0, 0, 0, 0, 3, 0}};

    @Test
    public void kruskals1(){
        Kruskals.kruskals(graph);
    }

    @Test
    public void kruskals2(){
        Kruskals.kruskals(graph2);
    }
}
