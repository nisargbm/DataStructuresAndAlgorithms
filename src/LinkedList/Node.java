package LinkedList;

/**
 * Created by nisar on 06-08-2018.
 */
public class Node{
    int value;
    Node next;
    Node(){
        value = 0; next =null;
    }
    Node(int value){
        this.next=null;
        this.value=value;
    }
}
