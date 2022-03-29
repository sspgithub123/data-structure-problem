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
    /*
     * This is the method to add first element
     */
    public void addFirst(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}
