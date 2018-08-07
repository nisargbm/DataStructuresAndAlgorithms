package trees;

/**
 * Created by nisar on 07-08-2018.
 */
public class Node {
    int value;
    Node left,right;
    int width;

    Node(int value){
        this.value = value;
        this.left = null;
        this.right = null;
        this.width = 0;
    }
    Node (int value,int width){
        this.value = value;
        this.left = null;
        this.right = null;
        this.width = width;
    }
    void setWidth(int width){
        this.width = width;
    }
}
