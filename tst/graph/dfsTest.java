package graph;

import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 09-08-2018.
 */
public class dfsTest {
    int mat[][]={
            {0,1,1,0,0,0,0}, // Node 1: 40
            {1,0,0,1,0,0,0}, // Node 2 :10
            {0,1,0,1,1,1,0}, // Node 3: 20
            {0,0,0,0,1,0,0}, // Node 4: 30
            {0,0,0,0,0,0,1}, // Node 5: 60
            {0,0,0,0,0,0,1}, // Node 6: 50
            {0,0,0,0,0,0,0}, // Node 7: 70
    };

    @Test
    public void bfs(){
        DFS.execute(mat);
    }
}
