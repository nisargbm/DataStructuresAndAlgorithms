package graph;

/**
 * Created by nisar on 09-08-2018.
 */
public class GraphCommons {

    public static int[] initializeToX(int[] a, int x) {
        for (int i = 0; i < a.length; i++) a[i] = x;
        return a;
    }

    public static int getMin(int a, int b) {
        return (a > b) ? b : a;
    }

    public static boolean allVisited(boolean visited[]) {
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) return false;
        }
        return true;
    }

    public static int getMinIndex(int a[], boolean visited[]) {
        int min = Integer.MAX_VALUE, minIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min && !visited[i]) {
                min = a[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
