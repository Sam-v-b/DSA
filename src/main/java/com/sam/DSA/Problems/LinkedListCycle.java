package com.sam.DSA.Problems;

public class LinkedListCycle {
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

    public void findCycle(int new_data){
        Node fastPointer= head;
        Node slowPointer= head;

        while(slowPointer != null && fastPointer != null && fastPointer.next != null){
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if(slowPointer == fastPointer ){
                System.out.println("We have a loop at "+ slowPointer.data);
                break;
            }
        }
    }

}
