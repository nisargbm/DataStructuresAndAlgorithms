package trees;

import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 07-08-2018.
 */
public class MyBTTests {

    @Test
    public void topView(){
        MyBT bt = new MyBT();
        insertSomeNodes(bt);
        bt.topView();
    }

    @Test
    public void bottomView(){
        MyBT bt = new MyBT();
        insertSomeNodes(bt);
        bt.bottomView();
    }

    @Test
    public void completeBinaryTree(){
        MyBT bt = new MyBT();
        insertSomeNodes(bt);
        System.out.println( "Complete Binary Tree ? --> " + bt.completeBinaryTree(bt.root));
    }

    @Test
    public void lowestCommonAncestor(){
        MyBT bt = new MyBT();
        insertSomeNodes(bt);
        Node ancestor = bt.lowestCommonAncestor(bt.root, 4, 1);
        System.out.println("Lowest common ancestor -->" + ancestor.value);
    }

    private void insertSomeNodes(MyBT bt){
        bt.root = new Node(10);
        bt.root.left = new Node(2);
        bt.root.right = new Node(21);
        bt.root.right.left = new Node(11);
        bt.root.left.left = new Node(20);
        bt.root.left.right = new Node(1);
        bt.root.right.right = new Node(-25);
        bt.root.right.right.left = new Node(3);
        bt.root.right.right.right = new Node(4);
    }
}
