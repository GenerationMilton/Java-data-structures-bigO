package com.livemilton.datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
       /* LinkedList myLinkedList= new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List: ");
        myLinkedList.printList();*/

        //append
        /*LinkedList myLinkedListAppend = new LinkedList(1);

        myLinkedListAppend.append(2);
        myLinkedListAppend.printList(); */

        //removeLast
        LinkedList myLinkedListAppend = new LinkedList(1);

        myLinkedListAppend.append(2);
        //(2)Items - Returns 2 Node
        System.out.println(myLinkedListAppend.removeLast().value);
        //(1) Item - Returns 1 Node
        System.out.println(myLinkedListAppend.removeLast().value);
        //(0) Item -Returns null
        System.out.println(myLinkedListAppend.removeLast());


    }
}
