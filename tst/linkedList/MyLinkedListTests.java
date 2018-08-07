package linkedList;

import org.junit.jupiter.api.Test;

/**
 * Created by nisar on 07-08-2018.
 */
public class MyLinkedListTests {

    @Test
    public void deleteOne(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.deleteFirst(5);
        System.out.println(myLinkedList.toString());
        myLinkedList.deleteFirst(30);
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void deleteAll(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.deleteAll(30);
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void removeDuplicates(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.removeDuplicates();
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void reverseRecursive(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.head = myLinkedList.reverseRecursive(myLinkedList.head);
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void reverseIterative(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.reverseIterative();
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void reverseGrpOfK(){
        MyLinkedList myLinkedList = new MyLinkedList();
        insert(myLinkedList);
        myLinkedList.head = myLinkedList.reverseGroupOfK(myLinkedList.head, 3);
        System.out.println(myLinkedList.toString());
    }

    @Test
    public void merge2LL(){
        MyLinkedList myLinkedList1 = new MyLinkedList();
        MyLinkedList myLinkedList2 = new MyLinkedList();
        insert(myLinkedList1);
        insert(myLinkedList2);
        MyLinkedList myLinkedList3 = new MyLinkedList();
        myLinkedList3.head = myLinkedList3.merge2LLAlternateRecursive(myLinkedList1.head, myLinkedList2.head, true);
        System.out.println(myLinkedList3.toString());
    }

    private void insert(MyLinkedList myLinkedList){
        myLinkedList.insert(30);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(10);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(60);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(5);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(30);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(30);
        System.out.println(myLinkedList.toString());
        myLinkedList.insert(5);
        System.out.println(myLinkedList.toString());
    }

    private void Sortedinsert(MyLinkedList myLinkedList){
        myLinkedList.sortedInsert(30);
        System.out.println(myLinkedList.toString());
        myLinkedList.sortedInsert(10);
        System.out.println(myLinkedList.toString());
        myLinkedList.sortedInsert(60);
        System.out.println(myLinkedList.toString());
        myLinkedList.sortedInsert(5);
        System.out.println(myLinkedList.toString());
        myLinkedList.sortedInsert(30);
        System.out.println(myLinkedList.toString());
        myLinkedList.sortedInsert(30);
        System.out.println(myLinkedList.toString());
    }
}
