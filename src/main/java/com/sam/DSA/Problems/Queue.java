package com.sam.DSA.Problems;

public class Queue {
    // Linked List implementation

    class Node{
        String item;
        Node behind;
    }

    public Node head = null;
    public Node tail = null;

    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    public void enqueue(String str){
        if(head == null){
            head = new Node ();
            head.item =str;
            tail = head;
        }
        tail.behind = new Node ();
        tail.behind.item = str;
        tail = tail.behind;
    }
    public String dequeue(){
        if(isEmpty()){
            return null;
        }else{
            String retValue = head.item;
            head = head.behind;
            return retValue;
        }
    }

}
