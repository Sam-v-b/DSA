package com.sam.DSA.Problems;

public class Stack {
    // Linked List implementation

    class Node{
        String item;
        Node next;
    }
    public Node top = null;
    public boolean isEmpty(){
        if(top==null){
            return true;
        }else{
            return false;
        }
    }
    public void push(String str){
        Node oldTop = top;
        top = new Node ();
        top.item = str;
        top.next = oldTop;
    }
    public String pop(){
        String retValue = top.item;
        top = top.next;
        return retValue;
    }

}
