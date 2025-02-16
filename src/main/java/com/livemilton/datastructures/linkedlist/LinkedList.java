package com.livemilton.datastructures.linkedlist;

import org.w3c.dom.Node;

public class LinkedList {

    //variables
    private Node head;
    private Node tail;
    private int length;



    //class
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }
    }

    //constructor
    public LinkedList(int value) {
        Node newNode= new Node(value);
        head= newNode;
        tail= newNode;
        length=1;
    }

    public void printList() {
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            //move across the linked list
            temp= temp.next;
        }
    }
    public void getHead() {
        if(head == null){
            System.out.println("Head: null");
        } else{
            System.out.println("Head: "+ head.value);
        }
    }

    public void getTail() {
        if(head == null){
            System.out.println("Tail: null");
        }else{
            System.out.println("Tail: "+ tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: "+length);
    }


    //append
    public void append(int value){
        Node newNode= new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;

    }

}
