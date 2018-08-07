package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by nisar on 07-08-2018.
 */
public class MyBST {

    public Node root;

    public void insert(int value){
        Node newnode = new Node(value);
        if(root == null)root = newnode;
        else{
            Node prev = null;
            Node curr = root;
            while(curr != null){
                if( value < curr.value){
                    prev = curr;
                    curr = curr.left;
                }
                else{
                    prev = curr;
                    curr = curr.right;
                }
            }
            if(value < prev.value)prev.left = newnode;
            else prev.right = newnode;
        }
    }

    public static void printInorder(Node node){
        if(node == null)return;
        printInorder(node.left);
        System.out.print( node.value + " -- ");
        printInorder(node.right);
    }

    public static void printPreOrder(Node node){
        if(node == null)return;
        System.out.print(node.value + " -- ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public static void printPostOrder(Node node){
        if(node == null)return;
        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print( node.value + " -- ");
    }

    public void levelOrderTraversal(){
        if(root == null)return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        Node temp;
        int level = 1;
        while(!queue.isEmpty()){
            System.out.print("Level " + level++ + " --> ");
            while(queue.peek() != null){
                temp = queue.remove();
                System.out.print(temp.value + " -- ");
                if(temp.left != null)queue.add(temp.left);
                if(temp.right != null)queue.add(temp.right);
            }
            queue.remove();
            if(!queue.isEmpty())queue.add(null);
            System.out.println();
        }
    }

    public int numberOfNodes(Node node){
        if(node == null)return 0;
        return 1 + numberOfNodes(node.left) + numberOfNodes(node.right);
    }

    public int maxDepth(Node node){
        if(node == null)return 0;
        int left = 1 + maxDepth(node.left);
        int right = 1 + maxDepth(node.right);
        return (left > right)? left : right;
    }

    public int numberOfNodesAtLevelK(Node node, int level){
        if(node == null)return 0;
        if( level == 0){
            System.out.print(node.value + " -- ");
            return 1;
        }
        return numberOfNodesAtLevelK(node.left, level - 1) + numberOfNodesAtLevelK(node.right, level - 1);
    }

    public static void morrisTraversal(Node node){
        if(node == null)return;
        Node curr = node, predecessor = null;
        while(curr != null){
            if(curr.left == null){
                System.out.print(curr.value + " -- ");
                curr =curr.right;
            }
            else{
                predecessor = curr.left;
                while(predecessor.right != null && predecessor.right != curr)
                    predecessor = predecessor.right;
                if(predecessor.right == null){
                    predecessor.right = curr;
                    curr = curr.left;
                }
                else{
                    predecessor.right = null;
                    System.out.print(curr.value + " -- ");
                    curr = curr.right;
                }
            }
        }
    }
}
