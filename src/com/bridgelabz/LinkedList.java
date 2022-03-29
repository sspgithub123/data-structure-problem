package com.bridgelabz;

public class LinkedList<T> {
    Node head;
    // node creation
    public class Node<T> {
        T data;
        Node next;
        //Constructor
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
