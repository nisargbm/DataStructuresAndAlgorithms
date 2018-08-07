package linkedList;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by nisar on 06-08-2018.
 */
public class MyLinkedList {

    public Node head;

    public void insert(int value){
        Node newnode = new Node(value);
        if(head == null) head = newnode;
        else{
            Node temp = head;
            while(temp.next != null)temp = temp.next;
            temp.next = newnode;
        }
    }

    public void sortedInsert(int value){
        Node newnode = new Node(value);
        if(head == null) head = newnode;
        else{
            if(value <= head.value){
                newnode.next = head;
                head = newnode;
            }
            else{
                Node temp = head;
                Node prev = null;
                while(temp != null && value > temp.value){
                    prev = temp;
                    temp = temp.next;
                }
                newnode.next = temp;
                prev.next = newnode;
            }
        }
    }

    public void deleteFirst(int value){
        if(head == null)return;
        if(head.value == value){
            head = head.next;
            return;
        }
        Node temp = head;
        Node prev = null;
        while(temp != null && value != temp.value){
            prev = temp;
            temp = temp.next;
        }
        if(temp != null)
            prev.next = temp.next;
        else
            prev.next = null;
    }

    public void deleteAll(int value){
        if( head == null )return;
        while(head!=null && head.value == value){
            head = head.next;
        }
        if( head == null )return;
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(temp.value == value){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public void removeDuplicates(){
        if(head == null)return;
        Set<Integer> set = new HashSet<>();
        Node temp = head;
        Node prev = null;
        while(temp != null){
            if(set.contains(temp.value)){
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                set.add(temp.value);
                prev = temp;
                temp = temp.next;
            }
        }
    }

    public Node reverseRecursive(Node node){
        if(node == null || node.next == null)return node;
        Node remaining = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;
        return remaining;
    }

    public void reverseIterative(){
        if(head == null)return;
        Node prev = null, curr = head, next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node reverseGroupOfK(Node node, int k){
        if(node == null)return null;
        Node prev = null, curr = node, next = null;
        int count = 0;
        while(curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            node.next = reverseGroupOfK(next, k);
        }
        return prev;
    }

    public Node merge2LLAlternateRecursive(Node node1, Node node2, boolean flag){
        if(node1 == null)return node2;
        if(node2 == null)return node1;
        Node temp = null;
        if(flag){
            temp = node1;
            temp.next = merge2LLAlternateRecursive(node1.next, node2, !flag);
        }
        else{
            temp = node2;
            temp.next = merge2LLAlternateRecursive(node1, node2.next, !flag);
        }
        return temp;
    }

    public int length(){
        if(head == null)return 0;
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public Node containsLoop(){
        if(head == null || head.next == null)return null;
            Node slow = head, fast = head;
            while(slow != null && fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow == fast)return slow;
            }
        return null;
    }

    public String toString(){
        String s="";
        Node temp = head;
        while(temp != null){
            s = s + temp.value+" --> ";
            temp =temp.next;
        }
        s+="null";
        return s;
    }

    public String toStringReverse(Node node){
        if(node == null)return "Null";
        else{
            return toStringReverse(node.next) + " -- " + node.value;
        }
    }
}
