package trees;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 07-08-2018.
 */
public class MyBSTTests {

    MyBST bst;

    @Test
    public void printAllOrders(){
        MyBST bst = new MyBST();
        insertSomeNodes(bst);
        MyBST.printInorder(bst.root);
        System.out.println();
        MyBST.printPreOrder(bst.root);
        System.out.println();
        MyBST.printPostOrder(bst.root);
        System.out.println();
        MyBST.morrisTraversal(bst.root);
        System.out.println();
    }

    @Test
    public void levelOrderTraversal(){
        MyBST bst = new MyBST();
        insertSomeNodes(bst);
        bst.levelOrderTraversal();
    }

    @Test
    public void numNodes(){
        MyBST bst = new MyBST();
        insertSomeNodes(bst);
        int nodes = bst.numberOfNodes(bst.root);
        System.out.println(nodes);
    }

    @Test
    public void maxDepth(){
        MyBST bst = new MyBST();
        insertSomeNodes(bst);
        int depth = bst.maxDepth(bst.root);
        System.out.println(depth);
    }

    @Test
    public void numberOfNodesAtLevelK(){
        MyBST bst = new MyBST();
        insertSomeNodes(bst);
        int nodes = bst.numberOfNodesAtLevelK(bst.root, 2);
        System.out.println("\n" + nodes);
    }


    private void insertSomeNodes(MyBST bst){
        bst.insert(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(60);
        bst.insert(70);
        bst.insert(80);
        bst.insert(40);
        bst.insert(45);
    }
}
