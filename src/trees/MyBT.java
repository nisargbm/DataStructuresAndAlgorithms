package trees;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Created by nisar on 07-08-2018.
 */
public class MyBT {

    public Node root;

    public boolean completeBinaryTree(Node node){
        if(node == null)return true;
        if(node.left == null && node.right == null)return true;
        if(node.left != null && node.right == null)return false;
        if(node.left == null && node.right != null)return false;
        return completeBinaryTree(node.left) & completeBinaryTree(node.right);
    }

    public void bottomView(){
        if(root == null)return;
        Map<Integer, Node> map = new TreeMap<>();
        Queue<Node> nodes = new LinkedList<>();
        Queue<Integer> widthQueue = new LinkedList<>();
        nodes.add(root);
        widthQueue.add(0);
        Node temp;
        int width;
        while(!nodes.isEmpty()){
            temp = nodes.remove();
            width = widthQueue.remove();
            map.put(width, temp);
            if(temp.left != null){
                nodes.add(temp.left);
                widthQueue.add(width - 1);
            }
            if(temp.right != null){
                nodes.add(temp.right);
                widthQueue.add(width + 1);
            }
        }
        for(int i : map.keySet()){
            System.out.println("Key : " + i + " --> Value : " + map.get(i).value);
        }
    }

    public void topView(){
        if(root == null)return;
        Map<Integer, Node> map = new TreeMap<>();
        Queue<Node> nodes = new LinkedList<>();
        Queue<Integer> widthQueue = new LinkedList<>();
        nodes.add(root);
        widthQueue.add(0);
        Node temp;
        int width;
        while(!nodes.isEmpty()){
            temp = nodes.remove();
            width = widthQueue.remove();
            map.putIfAbsent(width, temp);
            if(temp.left != null){
                nodes.add(temp.left);
                widthQueue.add(width - 1);
            }
            if(temp.right != null){
                nodes.add(temp.right);
                widthQueue.add(width + 1);
            }
        }
        for(int i : map.keySet()){
            System.out.println("Key : " + i + " --> Value : " + map.get(i).value);
        }
    }

    public Node lowestCommonAncestor(Node node, int value1, int value2){
        if(node == null)return null;
        if(node.value == value1)return node;
        if(node.value == value2)return node;
        Node left = lowestCommonAncestor(node.left, value1, value2);
        Node right = lowestCommonAncestor(node.right, value1, value2);
        if(left != null && right != null)return node;
        return (left == null)? right : left;
    }
}
