package com.sam.DSA.Problems;

public class MiddleNodeOfLinkedList {
    class Node {
        int data;
        Node next = null;
        Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void addNode(int new_data){
        Node new_node = new Node(new_data);
        if(head==null){
            head = new_node;
            tail = new_node;
        }else{
            tail.next = new_node;
            tail = tail.next;
        }
    }
    public void printMe(){
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data +" - ");
            temp = temp.next;
        }
        System.out.println("Null ");

    }


    public void findMiddleNode(String name) {
        Node fastPointer= head;
        Node slowPointer= head;

        while(fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }
        System.out.println(slowPointer.data);
    }

}

